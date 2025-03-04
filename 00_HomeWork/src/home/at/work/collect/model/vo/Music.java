package home.at.work.collect.model.vo;

public class Music {

	private int ranking;
	private String title;
	private String singer;
	private String songwriter;
	private int price;
	private String publisher;
	
	public Music() {	}

	public Music(int ranking, String title, String singer, String songwriter, 
			int price,String publisher) {
		super();
		this.ranking = ranking;
		this.title = title;
		this.singer = singer;
		this.songwriter = songwriter;
		this.price = price;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSongwriter() {
		return songwriter;
	}

	public void setSongwriter(String songwriter) {
		this.songwriter = songwriter;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Music [차트 순위 : " + ranking + "/ 앨범 :" + title + 
				"/ 가수 :" + singer + "/작곡가 :" + songwriter + "/ 정가: " + price + 
				"/앨범제작사 /" + publisher + "]";
	}

	
	
}
