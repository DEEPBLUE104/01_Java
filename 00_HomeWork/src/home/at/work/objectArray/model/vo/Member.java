package home.at.work.objectArray.model.vo;

public class Member {

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울, 경기, 충북, 강원..)
	
	
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	
	
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + ", memberAge="
				+ memberAge + ", region=" + region + "]";
	}

	
	
}
