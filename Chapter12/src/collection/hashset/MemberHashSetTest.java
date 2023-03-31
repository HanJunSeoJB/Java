package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "박재범");
		Member memberSon = new Member(1002, "손흥민");
		Member memberHan = new Member(1003, "한준서");
		
		memberHashSet.addMember(memberHan);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberLee);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
