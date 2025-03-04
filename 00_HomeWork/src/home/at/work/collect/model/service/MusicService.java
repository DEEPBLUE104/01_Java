package home.at.work.collect.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import home.at.work.collect.model.vo.Music;

public class MusicService {
	List<Music> musicList = new ArrayList<>();
	List<Music> starList = new ArrayList<>();
	Scanner sc = new Scanner(System.in); // 필드 지역에 넣어야 결과가 나온다

	public void musicService() {
		int menuNum = 0;

		// 내용을 넣지 않아서 결과가 나오지 않았음. 내용 먼저 넣는 것을 추천
		musicList.add(new Music(1, "welcome To the Show", "데이식스", "김아무개", 30000, "파랑새"));
		musicList.add(new Music(2, "복숭아", "아이유", "아이유", 190000, "세상살이"));
		musicList.add(new Music(3, "pop the music", "블락비", "이세영", 58000, "금뿌리개"));
		musicList.add(new Music(4, "그때 그 무렵", "에피소드", "서정주", 90000, "신드롬플룻"));
		musicList.add(new Music(5, "여기까지 해요", "김희숙", "데이즈", 70000, "푸른 아이"));

		starList.add(new Music(2, "복숭아", "아이유", "아이유", 190000, "세상살이"));
		starList.add(new Music(5, "여기까지 해요", "김희숙", "데이즈", 70000, "푸른 아이"));

		try {

			do {
				System.out.println("==== music 리스트 ====");
				System.out.println("1. 앨범 등록");
				System.out.println("2. 목록 조회");
				System.out.println("3. 앨범 수정");
				System.out.println("4. 앨범 삭제");
				System.out.println("5. my playlist 등록");
				System.out.println("6. my playlist 조회");
				System.out.println("7. my playlist 삭제");
				System.out.println("8. 랜덤 재생 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴를 입력하세요. :");
				menuNum = sc.nextInt(); // menuNum이 아니라 다른 변수를 넣었음. 연동되려면 제대로 입력하기
				sc.nextLine();

				switch (menuNum) {
				case 1: System.out.println(addmusic()); break;
				case 2: seemusic(); break;
				case 3: editmusic(); break;
				case 4: removemusic(); break;
				case 5: addstarmusic(); break;
				case 6: seestarmusic(); break;
				case 7: removestarmusic(); break;
				case 8: randommusic(); break;
				case 0:
					System.out.println("~좋은 음악, 위대한 음악~"); break;
				default:
					System.out.println("다시 입력해주세요.");
				}
			} while (menuNum != 0);

		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}
	}

	public String addmusic() {
		System.out.println("======앨범 정보 입력=======");

		System.out.print("앨범 번호 :");
		int ranking = sc.nextInt();
		sc.nextLine();

		System.out.print("앨범 제목 :");
		String title = sc.next();
		sc.nextLine();

		System.out.print("가수 :");
		String singer = sc.next();

		System.out.print("작곡가  :");
		String composer = sc.next();
		sc.nextLine();

		System.out.print("앨범 가격:");
		int price = sc.nextInt();

		System.out.print("앨범 제작사 :");
		String publisher = sc.next();

		Music newMusic = new Music(ranking, title, singer, composer, price, publisher);

		musicList.add(newMusic); // 할당을 이상한 곳에 했다. github 참조

		return "새롭게 등록되었습니다!";

	}

	public String seemusic() {

		for (Music temp : musicList) {
			System.out.println(temp); // music.get(0)를 입력하니 첫번째만 5번 나왔다.
		} // github를 보고 수정
		return "노래를 등록해주세요!";
	}

	public String editmusic() {

		boolean flag = false;
		int editMenu = 0;
		seemusic();
		System.out.println("====음반 수정====");

		System.out.print("수정할 음반을 선택하세요. :");
		int edit = sc.nextInt();
		sc.nextLine();

		System.out.println(musicList.get(edit - 1));

		for (Music temp : musicList) {

			if (temp.getRanking() == edit) {

				flag = true;

				System.out.print("1. 앨범 번호 :");
				System.out.print("2. 앨범 제목 :");
				System.out.print("3. 가수 :");
				System.out.print("4. 작곡가  :");
				System.out.print("5. 앨범 가격:");
				System.out.print("6. 앨범 제작사 :");

				System.out.print("수정할 항목을 골라주세요 :");
				editMenu = sc.nextInt();

				switch (editMenu) {
				case 1:
					System.out.println("==앨범 번호==");
					System.out.println("수정할 앨범 번호를 입력하세요 : ");
					int editranking = sc.nextInt();
					temp.setRanking(editranking);
					break;

				case 2:
					System.out.println("==앨범 제목==");
					System.out.println("수정할 앨범 제목을 입력하세요 : ");
					String edittitle = sc.next();
					temp.setTitle(edittitle);
					break;

				case 3:
					System.out.println("==가수==");
					System.out.println("수정할 가수이름을 입력하세요 : ");
					String editsinger = sc.next();
					temp.setSinger(editsinger);
					break;

				case 4:
					System.out.println("==작곡가==");
					System.out.println("수정할 작곡가 이름을 입력하세요 : ");
					String editcomposer = sc.next();
					temp.setSongwriter(editcomposer);
					break;

				case 5:
					System.out.println("==앨범가격==");
					System.out.println("수정할 앨범가격을 입력하세요 : ");
					int editprice = sc.nextInt();
					temp.setPrice(editprice);
					break;

				case 6:
					System.out.println("==제작사==");
					System.out.println("수정할 제작사를 입력하세요 : ");
					String editpublisher = sc.next();
					temp.setPublisher(editpublisher);
					break;

				default:
					System.out.println("다시 입력해주세요.");
				}

			}
			if (flag)
				return "일치하는 도서 번호가 없습니다.";

		}
		return "수정 되었습니다.";
	}

	public void removemusic() {

		seemusic();

		System.out.print("삭제하려는 음악 번호를 입력해주세요. :");
		int deletemusic = sc.nextInt();

		for (Music temp : musicList) {
			if (temp.getRanking() == deletemusic) {
				int index = musicList.indexOf(temp);
				// ^List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환

				System.out.println("index 번호 : " + index);

				System.out.println("정말 삭제하시겠습니까? (Y/N) :");

				char answer = sc.next().toUpperCase().charAt(0);

				if (answer == 'Y') {
					musicList.remove(index);
					System.out.println("삭제 되었습니다.");
					break;
				} else {
					System.out.println("취소 되었습니다.");
				}
			}

		}
	}

	public String addstarmusic() {

		System.out.println("==my playlist 등록==");

		System.out.print("앨범 번호 :");
		int ranking = sc.nextInt();
		sc.nextLine();

		System.out.print("앨범 제목 :");
		String title = sc.next();
		sc.nextLine();

		System.out.print("가수 :");
		String singer = sc.next();

		System.out.print("작곡가  :");
		String composer = sc.next();
		sc.nextLine();

		System.out.print("앨범 가격:");
		int price = sc.nextInt();

		System.out.print("앨범 제작사 :");
		String publisher = sc.next();

		Music star = new Music(ranking, title, singer, composer, price, publisher);
		starList.add(star);
		return "새롭게 등록되었습니다!";
	}

	public String seestarmusic() {

		System.out.println("==my playlist 목록==");

		for (Music temp : starList) {
			System.out.println(temp);
		}
		return "";
	}

	public String removestarmusic() {

		seestarmusic();

		System.out.print("삭제할 앨범 번호를 입력하세요.");
		int deletestar = sc.nextInt();

		for (Music temp : starList) {
			if (temp.getRanking() == deletestar) {
				int index = starList.indexOf(temp);

				System.out.println("index 번호" + (index + 1));

				System.out.print("정말로 삭제하시겠습니까? (Y/N) :");
				char answer = sc.next().toUpperCase().charAt(0);

				if (answer == 'Y') {
					starList.remove(index);
					return "삭제되었습니다.";
				}
				return "취소되었습니다";
			}
		}
		return "";

	}

	public void randommusic() {

		System.out.println("===음반 셔플===");

		int max = musicList.size();

		int random = (int) (Math.random() * max);

		System.out.println(musicList.get(random).getTitle());

	}
}