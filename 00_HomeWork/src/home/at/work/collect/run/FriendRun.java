package home.at.work.collect.run;

import java.util.ArrayList;
import java.util.List;

import home.at.work.collect.model.vo.Friend;

public class FriendRun {

	public static void main(String[] args) {
		
		
		List<Friend> friends = new ArrayList<Friend>();
		
		friends.add(new Friend("망글곰"));
		friends.add(new Friend("먼작귀"));
		friends.add(new Friend("별의 커비"));
		friends.add(new Friend("마루"));
		friends.add(new Friend("가나디"));
		friends.add(new Friend("죠르디"));
		
		int random = (int) (Math.random()*friends.size())
				;
	
		Friend leader = friends.get(random);
		
		leader.pickLeader();
	
	}
}
