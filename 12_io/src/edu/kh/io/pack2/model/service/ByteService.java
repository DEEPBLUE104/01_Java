package edu.kh.io.pack2.model.service;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteService {

	/*
	 * 스트림(stream) : 데이터가 이동하는 통로
	 * 					기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * - 1byte 단위로 데이터를 입/출력하는 스트림
	 * - 최상위 클래스 : InputStream, OutputStream
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 	 모든 것을 입/출력 할 수 있음
	 * 	(단, 통로가 좁다보니 속도가 좀 느림,
	 * 	char 형 문자같은 경우 깨질 우려가 있다.)
	 * 
	 * 
	 * */

	//IO 관련된 코드 IOException이 발생될 가능성이 높다
	// -> IO관련 코드는 거의 모든 메서드가 throws IOException
	// -> IOException 예외 처리 구문을 작성하는 것이 필수
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * + 데이터 출력
	 */
	public void fileByteOutPut() {
		
		// FileOutPutStream 참조 변수 선언(OutputStream 상속받은 자식 클래스)
		FileOutputStream fos = null;
		
		try {
			
			//new FileOutputStream("경로") :
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// 단, 폴더는 생성되지 않음
			// -> 기존 파일이 존재하면 내용을 덮어쓰기 함.
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
			
			// String의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World\n");
			sb.append("1234567\n");
			sb.append("~!@#$$%%%^^<>?!\n");
			sb.append("몸이 너무 아프다.. 병원 가야하는데 \n");
			sb.append("야간병원은 어딨는지 모른단 말이지..\n");

			// 출력방법 1 : 한 글자(2byte)씩 파일로 출력
			
			// StringBuilder -> String 변환 -> char.At() -> char로 변환
			String content = sb.toString();
			
		/*	for(int i = 0; i < content.length(); i++) {
				char ch = content.charAt(i);
				fos.write(ch); //1byte 출력 스트림이 연결된 파일에 ch 쓰기
			} 
		*/
			
		// -> 2byte 범주의 문자(영어, 숫자, 기본특수문자 제외)는 
		// 바이트 기반 스트림 통과 시
		// 데이터 손실이 발생해서 글자가 깨지는 문제가 발생
		
		// 출력 방법 2: String을 byte[] 변환 후 출력	
			
			fos.write(content.getBytes());  //byte[]로 만들어 반환
			
			fos.flush(); // 스트림 안에 남아있는 모든 데이터를 모두 밀어냄
			// FileOutputStream에서는 flush() 선택 사항
			
			System.out.println("출력 완료");
			
		} catch(IOException e) {
			e.printStackTrace();
		
		} finally { //try에서 예외 발생 여부 관계없이 무조건 수행
			
			//사용완료한 스트림을 제거(닫기, 메모리 반환)
			//-> 메모리 누수 방지
			
			try {
				// 스트림이 정상 생성된 경우
				// 스트림을 닫는다 ( NullPointerException 방지)
				// colse() 메서드도 IOException 발생시키기 때문에
				// try - catch 이용하여 예외 처리 필수
			
				if(fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
