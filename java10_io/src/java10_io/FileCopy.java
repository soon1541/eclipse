package java10_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public FileCopy() {
		
	}
	public void start() {
		// c:\\javafiletest\natural.jpg 읽기
		// c:\\newFolder\natural.jpg로 쓰기
		
		try {
			File source = new File("c://javafiletest/natural.jpg");
			File target = new File("c://newFolder", source.getName());
			
			// 1. 입력스트림(byte) 만들기
			FileInputStream fs = new FileInputStream(source);
			FileOutputStream fo = new FileOutputStream(target);
			
			/*
			while(true) {
				int byteDate = fs.read(); // 읽기 eof=-1
				if(byteData == -1) {break};
				fo.write(byteData);
			
			}
			*/
			
			// 배열을 이용한 입출력
			// 읽기
			byte[] data = new byte[(int)source.length()];
			fs.read(data, 0, data.length);
			
			fo.write(data, 0, data.length);
			
			
			
			fs.close();
			fo.close();
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		new FileCopy().start();

	}

}
