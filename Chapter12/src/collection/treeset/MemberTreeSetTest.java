package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001, "박재범");
		Member memberSon = new Member(1002, "한준서");
		Member memberHan = new Member(1003, "손흥민");
		
		memberTreeSet.addMember(memberHan);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();

	}

}
