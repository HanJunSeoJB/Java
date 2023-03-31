package generic;

public class GenericMethod {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static <T, V> double makeCircle(Point<T, V> p1, Point<T, V> p2) {
		double x1 = ((Number)p1.getX()).doubleValue();
		double y1 = ((Number)p1.getY()).doubleValue();
		double x2 = ((Number)p2.getX()).doubleValue();
		double y2 = ((Number)p2.getY()).doubleValue();
		
		double r = Math.sqrt(Math.pow(x2-x1, 2) - Math.pow(y2 - y1, 2));
		double PI = 3.14;
		
		return PI * r * r;
	}

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(4, 3.0);
		
		double rect = GenericMethod.makeRectangle(p1, p2);
		double circle = GenericMethod.makeCircle(p1, p2);
		System.out.println(rect);
		System.out.println(circle);
	}

}
