package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World!";
		int i = 100;
		
		StringConcat concat2 = (s, v) -> {
			System.out.println(s + "," + v);
			System.out.println(i);
		};
		concat2.makeString(s1, s2);
	}

}
