package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {

	// 스트림 : 데이터가 이동하는 통로
	
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입/출력하는 스트림
	// -> 문자가 아닌 파일(이미지, 영상, exe 등등), 입/출력
	
	// 문자 기반 스트림 : 문자 단위(2byte)로 데이터를 입/출력하는 스트림
	// -> 문자 데이터(채팅, 코드, 데이터) 입/출력
	
	public void output() {
		
		String content = "Hello World\n"
					   + "123456789\n"
					   + "오늘은 금요일 입니다."
					   + "점심 어떤게 좋을까요?";
		
		// * 스트림 객체 생성시 예외처리가 필요함
		// Unhandled exception type FileNotFoundException
		
		// 바이트 기반 파일 출력 스트림
		FileOutputStream fos = null;  // 메서드의 지역변수 = 메서드 어디서든 사용 가능
									 // -> finally에서도 사용 가능
		
		// 문자 기반 파일 출력 스트림
		FileWriter fw = null;
		
		
		try {
			fos = new FileOutputStream("byte/byteTest.txt", true);
				// new FileOutputStream("출력할 파일 경로", 이어쓰기 여부);
				// -> 파일이 없으면 생성됨
				// 새롭게 실행 될 때 마다 파일/내용 덮어쓴다
				// 이어쓰기 여부를 true로 하면 이전 내용 이어쓰기 된다. 
			    // (log 작성 시 많이 사용)
			
			
			// 1byte씩 파일로 출력 (한글자씩 읽음)
			for(int i=0; i<content.length(); i++) {
				fos.write(content.charAt(i));
			}
			
			System.out.println("바이트 스트림 출력 완료");
			
			// -------------------------------
			
			fw = new FileWriter("char/charTest.txt", true);
				// new FileWriter("출력할 파일 경로");
				// -> 파일이 없으면 생성됨
			
			fw.write(content);
			
			System.out.println("문자 스트림 출력 완료");
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지의 모든 메서드 출력
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				// 스트림.close()   (스트림 통로를 닫는 것)
				// 스트림 내부에 존재하는 데이터를 모두 밀어낸 후 
				// 객체 자원(메모리) 반환
				// -> 필수 작성!
				
				fos.close();  
				// 여기서 쓰기 위해 fos를 try보다 더 먼저(메소드에) 만들어둠
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void input() {
		
		FileInputStream fis = null;   // 바이트 기반
		
		FileReader fr = null;   // 문자 기반
		
		try { 
			fis = new FileInputStream("char/charTest.txt");
							   		// 파일 경로
			
			int value = 0; // 파일에서 읽어온 값을 저장할 변수
			
			// fis.read() : 다음 1byte를 읽어와 int형으로 반환
			//				단, 읽어올 내용이 없으면 -1 반환
			
			while((value = fis.read()) != -1) System.out.print((char)value);
			// read값이 int이기 때문에 char로 강제 형변환
				
//			while(true) {  // 위의 while문과 같다
//				value = fis.read();
//				if(value == -1) break;
//				System.out.print((char)value);  
//			}
			
			System.out.println("\n-----------------------------------");
			
			fr = new FileReader("char/charTest.txt");
			
			while(true) {
				value = fr.read();
				if(value == -1) break;
				System.out.print((char)value);
			}
		
			// 둘 다 throws FileNotFoundException 가능
			// fis.read, fr.read 모두 IOException 가능
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fis !=null) fis.close();
				if(fr !=null) fr.close();
				// 둘 다 IOException 가능성 O
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 어떤 형식의 파일이든 복사하기(바이트+보조 스트림)
	public void fileCopy() { // input과 output 동시 진행
		
		Scanner sc = new Scanner(System.in);
		
		// 보조 스트림(혼자 생성되서 입출력 할 수 없는 스트림
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			System.out.print("복사할 파일의 경로 : ");
			String input = sc.nextLine();
			
			bis = new BufferedInputStream(new FileInputStream(input));
			// new BufferedInputStream(기반 스트림)
			
			System.out.print("복사 위치+파일명 : ");
			String output = sc.nextLine();
			
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			// Buffered 보조 스트림
			// -> 버퍼를 이용해서 1byte/1문자 씩이 아닌
			//    한번에 많은 내용을 입/출력 할 수 있게하는 보조 스트림(속도 up)
			
			int value = 0;
			
			while(true) {
				value = bis.read();
				if(value == -1) break;
				
				bos.write(value);
				// 1byte씩 출력되는 것 같으나
				// 내부 버퍼에 출력되는 내용이 모여서 한번에 출력됨
			}
			
			System.out.println("복사 완료");
			
			// 바이트 스트림이기 때문에 1byte씩 읽어오지만
			// 한글 같은 2byte 문자가 버퍼에 쌓이면 깨졌던 모양이 복구됨
			
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("입/출력 과정에서 오류가 발생했습니다.");
			e.printStackTrace();		
		} finally {
			
			try {
				if(bis !=null) bis.close();
				if(bos !=null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
