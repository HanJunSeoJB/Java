package array;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
	
		ArrayList<Book> library= new ArrayList<Book>();
		
		library.add(new Book("화산귀환", "청명"));
		library.add(new Book("전독시", "김독자"));
		library.add(new Book("롤", "라이엇"));
		library.add(new Book("안티프라자", "르세라핌"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		for(Book book: library) {
			book.showBookInfo();
		}
	}
}
