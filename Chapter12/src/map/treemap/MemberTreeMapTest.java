package map.treemap;

import collection.Member;
import map.hashmap.MemberHashMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberLee = new Member(1003, "박재범");
		Member memberSon = new Member(1012, "손흥민");
		Member memberHan = new Member(1008, "한준서");
		
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberHan);
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1012);
		memberTreeMap.showAllMember();
	}

}
