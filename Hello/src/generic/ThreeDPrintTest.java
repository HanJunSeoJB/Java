package generic;

public class ThreeDPrintTest {

	public static void main(String[] args) {
		ThreeDPrint<Powder> print = new ThreeDPrint<>();
		print.setMaterial(new Powder());
		print.printing();
		
		ThreeDPrint<Plasctic> print1 = new ThreeDPrint<>();
		print1.setMaterial(new Plasctic());
		print1.printing();
		
	}

}
