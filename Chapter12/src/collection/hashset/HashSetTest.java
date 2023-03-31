package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("한준서"));
		hashSet.add(new String("김국화"));
		hashSet.add(new String("한준서"));
		
		System.out.println(hashSet);

	}

}
