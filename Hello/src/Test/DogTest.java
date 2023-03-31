package Test;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("멍멍이", "불독"); 
		dogArray[1] = new Dog("멍멍이2", "치와와"); 
		dogArray[2] = new Dog("멍멍이3", "진돗개"); 
		dogArray[3] = new Dog("멍멍이4", "리트리버"); 
		dogArray[4] = new Dog("멍멍이5", "허스키"); 
		
		for(Dog dog:dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}

}
