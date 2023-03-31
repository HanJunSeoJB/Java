package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("abvc");
		String str2 = "abvc";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "abvc";
		String str4 = "abvc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
