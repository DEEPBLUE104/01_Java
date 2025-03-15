package home.at.work.io.model;

import java.io.File;

public class IO_Service {

	public void method1() {
		
		File directory = new File("/io_test/20250315");
		
		if (!directory.exists()) {
			directory.mkdirs();
		
		 System.out.println(directory.getName());
		 System.out.println(directory.getPath());
		}
		
	}
	
	
}
