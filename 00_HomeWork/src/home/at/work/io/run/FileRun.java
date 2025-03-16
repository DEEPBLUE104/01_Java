package home.at.work.io.run;

import home.at.work.io.model.FileService;

public class FileRun {

	public static void main(String[] args) {

		FileService service = new FileService();
	//	service.fileByteInput(); //한글은 입력되지 않음
	//	service.fileInput(); //한글도 나옴
		service.bufferedFileByteInput(); //한글도 나옴
	//	service.fileOutput(); //한글도 나옴

		
	}

}
