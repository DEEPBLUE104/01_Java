package home.at.work.collect.model.vo;

public class Friend {
	

	private String name;
	
	public Friend(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pickLeader() {
		
		System.out.println(name + "이 제일 귀엽다" );
		
	}
	

}
