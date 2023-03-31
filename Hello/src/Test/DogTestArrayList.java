package Test;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("멍멍이", "치와와"));
		dogList.add(new Dog("멍멍이2", "불독"));
		dogList.add(new Dog("멍멍이3", "리트리버"));
		dogList.add(new Dog("멍멍이4", "진돗개"));
		dogList.add(new Dog("멍멍이5", "허스키"));
		
		for(Dog dog:dogList) {
			System.out.println(dog.showDogInfo());  
		}
	}
}
