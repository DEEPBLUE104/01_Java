package home.at.work.io.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileService {

	public void fileInput() {

		// 스트림 참조 변수 선언
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null; // 문자 기반 보조 스트림

		try {

			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/20250316/노래가사.txt");

			// 보조 스트림 생성
			br = new BufferedReader(fr);

			String line = null; // 한 줄을 읽어와 저장할 변수

			while (true) {
				// String BufferedReader.readLine() : 한 줄씩 문자열을 읽는 역할.(줄단위)
				// -> 개행문자가 나올 때까지의 문자열을 읽음.
				line = br.readLine();

				if (line == null) { // 더이상 읽어올 내용이 없을 때
					break; // 반복종료
				}

				System.out.println(line);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (br != null)
					br.close();

			} catch (Exception e) {

			}
		}
	}

	public void fileByteInput() {

		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("\\io_test\\20250316\\노래가사.txt");
			// FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해야 한다
			// -> 존재하지 않으면 FileNotFoundException 발생

			// 방법1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -> 2byte 범주의 글자들은 깨지는 문제 발생함

			// byte -> 자바에서 정수형
			// 다루기 힘들기 때문에 정수향 기본형인 int로 변환해서 사용

			int value = 0; // 읽어온 바이트 값을 저장할 변수

			StringBuilder sb = new StringBuilder();

			while (true) {
				value = fis.read(); // 1byte씩 읽어오기
				// 단, 더이상 읽어올 값이 없으면 -1 반환

				if (value == -1)
					break; // 다 읽어왔으면 반복 멈추겠다.

				sb.append((char) value); // char로 강제 형변환해서 글자 형태로 sb 추가

			}

			System.out.println(sb.toString()); // 읽어온 내용 콘솔에 출력

			// InputStream은 flush() 없음
			// flush()는 출력 스트림에만 관련된 동작

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {
				// 사용완료된 Stream 메모리 반환
				if (fis != null)
					fis.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * 문자 기반 파일 출력(파일 내보내기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileOutput() {
		
		//스트림 참조변수 선언
		FileWriter fw = null;  //문자 기반 파일 출력 스트림
		BufferedWriter bw = null;  //문자 출력 보조 스트림
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("오늘은 3월 6일 목요일 입니다.\n");
			sb.append("내일은 시험이 있습니다.\n");
			sb.append("LIST가 나온다고는 하는데..\n");
			sb.append("예?? 자바 총정리 시험을 본다구요?\n");
			sb.append("아... 죽겠네요\n");
		
			String content = sb.toString();
			
			// content에 저장된 문자열을
			// /io_test/20250305/출력테스트.txt 파일로 출력하기
			
			// 파일과 출력스트림 연결(파일이 없으면 생성해줌)
			fw = new FileWriter("/io_test/20250316/출력테스트.txt");
			
			bw = new BufferedWriter(fw);
			
			bw.write(content);  //content에 저장된 내용을 연결된 파일에 출력한다.
			
		//	bw.flush();  // 버퍼 구문이 있다면 써야하지만 close 구문에 포함되어 있다.
						 // close 구문이 있을 시 생략가능 
		
			
			System.out.println("출력 완료");
			
		}catch(Exception e) {
			
		}finally {
			
			try {
				if(bw != null) bw.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어올 때 사용 -> 읽어오는 파일의 크기가 작으면 보조 스트림의 성능 이점이 크게 눈에
	 * 띄지는 않음
	 */
	public void bufferedFileByteInput() {

		// 파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;

		// 파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;

		try {
			// 기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20250316\\노래가사.txt");

			// 보조 스트림 생성
			bis = new BufferedInputStream(fis);

			byte[] bytes = bis.readAllBytes();

			String content = new String(bytes);

			System.out.println(content);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				// 보조 스트림만 close()해도 기반 스트림도 같이 close() 됨
				if (bis != null)
					bis.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
