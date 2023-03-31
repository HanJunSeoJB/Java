package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "박재범");
		Member memberSon = new Member(1002, "손흥민");
		Member memberHan = new Member(1003, "한준서");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberHan);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();

	}

}
