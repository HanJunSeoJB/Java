package polymorphism;
import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("Human are reading a book.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("Eagle is flying far a way");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("Tiger is running all fours");
	}
}

public class AnimalTest1 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();
		aTest.addAnimal();
		System.out.println("Down Casting");
		aTest.testCasting();
		
		
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i =0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else {
				System.out.println("Not support Shape");
				
			}
		}
	}
}


