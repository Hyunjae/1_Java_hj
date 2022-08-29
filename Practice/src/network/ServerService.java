package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService {
	
	public void serverStart() {
		
		// 1. 포트번호 생성
		int port = 8500;
		
		// 초기화(소켓, 스트림)
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// 2. 서버용 소켓 작성
			serverSocket = new ServerSocket(port);
			
			// 3. 접속 요청 기다림
			
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			// 4. 접속 요청 수락 후 클라이언트 소켓 객체 생성
			clientSocket = serverSocket.accept();
			
			System.out.println("[클라이언트 접속 성공]");
			
			// 5. 클라이언트의 입/출력 스트림 생성
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 6. 보조스트림
			
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
			// 7. 스트림 통해 읽고 쓰기
			
			// 서버 -> 클라
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			String str = sdf.format(now) + "[서버 접속 성공]";
			
			pw.println(str);
			pw.flush();
			
			// 클라 -> 서버
			String clientMessage = br.readLine();
			
			String clientIp = clientSocket.getInetAddress().getHostAddress();
	
			System.out.println(clientIp + "가 보낸 메세지 : "+ clientMessage);
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			
			//8. 통신 종료
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}


}
