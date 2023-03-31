package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손흥민");
		Member memberPark = new Member(1003, "박서준");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberPark.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberPark, 1);
		memberArrayList.showAllMember();
	}

}
