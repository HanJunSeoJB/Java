package stream.inputstream;

import java.util.Scanner;

public class SystemInTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int num = sc.nextInt();
		
		System.out.println(name);
		System.out.println(num);
	}
}
