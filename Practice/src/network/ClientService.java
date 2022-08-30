package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService {
	
	public void clientStart() {
		
		// 1. 서버 ip주소, 클라이언트용 소켓 생성
		
		String serverIP = "192.168.219.120";
		
		int port = 8500;
		
		Socket clientSocket = null;
		
		// 스트림 초기화
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("[Client]");
			clientSocket = new Socket(serverIP, port);
			
			// 2. 서버와의 입출력 스트림 오픈
			if(clientSocket != null) {
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				// 3. 보조스트림
				br = new BufferedReader(new InputStreamReader(is));
				pw = new PrintWriter(os);
				
				// 4. 읽고 쓰기
				// 서버 -> 클라
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				
				// 클라 -> 서버
				Scanner sc = new Scanner(System.in);

				System.out.print("서버로 전달할 메세지 : ");
				String str = sc.nextLine();
				
				pw.println(str);
				pw.flush();
			}
	
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			// 5. 통신 종료
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(clientSocket != null) clientSocket.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
