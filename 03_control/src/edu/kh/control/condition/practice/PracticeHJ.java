package edu.kh.control.condition.practice;

import java.util.Scanner;

public class PracticeHJ {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextInt();		
		System.out.print("과제 점수 : ");
		double homeWork = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextInt();
		
		midTerm *= 0.2;
		finalTerm *= 0.3;
		homeWork *= 0.3;
		attendance *= 5 * 0.2;
		
		double totalScore = midTerm + finalTerm + homeWork + attendance;
		
		if(attendance <= 14) {
			System.out.println("========= 결과 =========");
			System.out.println("Fail [출석 횟수 부족 ("+ (int)attendance + "/20)]");
		} else {
			System.out.println("중간 고사 점수(20) : " + midTerm);
			System.out.println("기말 고사 점수(30) : " + finalTerm);
			System.out.println("과제 점수(30) : " + homeWork);
			System.out.println("출석 점수(20) : " + attendance);
			System.out.println("총점 : " + totalScore);
			if(totalScore <= 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("PASS");
			}
		}
	}
	public void practice2() {
//		for(double i=10; i<=20; i+=0.5) {
//			System.out.println(i);
//		}
//		int sum = 0;
//		
//		for(int i=1; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
	
	public void practice3() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력된 정수 : ");
//		int input = sc.nextInt();
//		
//		for(int i=input; i>=1; i--) {
//			for(int x=i; x>=1; x--) { 
//				System.out.print(x);
//			} System.out.println();
//		}

		int count = 1;
		for(int x=1; x<=3; x++) {
			for(int i=1; i<=4; i++) {
				System.out.printf("%3d", count++);
			} System.out.println();
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
//		
//		int sum=0;
//		int input=-1;
//		
//		while(input!=0) {
//			System.out.print("입력 : ");
//			input = sc.nextInt();
//			
//			sum += input;
//		}
//		
//		System.out.println(sum);

		
		int input = 0;
		int sum = 0;
		String menu = "";
		boolean flag = false;
		// 첫주문에
		
		while(input!=9) {
			
			System.out.println("--- 메뉴 ---");
			System.out.println("1. 떡볶이(5000원)");
			System.out.println("2. 김밥(3000원)");
			System.out.println("3. 라면(4000원)");
			System.out.println("4. 돈까스(8000원)");
			System.out.println("9. 주문 완료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			
			switch(input) {
			case 1 : 
				if(flag) {
					menu += ",";
				}
				menu += "떡볶이"; 
				sum += 5000;
				break;
			case 2 : 
				if(flag) {
					menu += ",";
				}
				menu += "김밥";
				sum += 3000;
				break;
			case 3 : 
				if(flag) {
					menu += ",";
				}
				menu += "라면";
				sum += 4000;
				break;
			case 4 : 
				if(flag) {
					menu += ",";
				}menu += "돈까스";
				sum += 8000;
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			if(!flag) {
				flag = true;
			}
			System.out.println();
		}
		System.out.println(menu + "을/를 주문하셨습니다.");
		System.out.println("총 가격은 " + sum + "원 입니다.");
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		
//		while(true) {
//			System.out.print("정수 입력: ");
//			int input = sc.nextInt();
//			sum += input;
//			
//			if(input==0) {
//				break;
//			}
//		} 
//		System.out.println(sum);
		
//		String str = "";
//		
//		while(true) {
//			System.out.print("문자입력 : ");
//			String input = sc.nextLine();
//			
//			if(input.equals("exit@")) {
//				break;
//			}
//			str += input + "\n";
//		}
//		System.out.println(str);
		
		for(int i=0; i<=100; i++) { 
			if(i%5==0) {
				if(i==40) {
					System.out.println(i);
					break;
				}
				continue;
			} 
			System.out.println(i);
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int input = 0;
		
		int ran = (int)(Math.random()*50+1);
		
		while(input!=ran) {
			System.out.print(count+"번 입력 : ");
			input=sc.nextInt();
			
			if(ran>input) {
				System.out.println("UP");
			} else {
				System.out.println("DOWN");
			}
			count++;
		}
		System.out.printf("정답 입니다! (총 입력 횟수 : %d회\n)", count-1);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇판? : ");
		int round = sc.nextInt();
		
		System.out.println();
		
		// 0: 가위 / 1 : 바위 / 2 : 보
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i=1; i<=round; i++) {
			System.out.println(i+ "번째 게임");
			
			System.out.print("가위/바위/보 중 하나를 입력해주세요 : ");
			String player = sc.next();

			int ran = (int)(Math.random()*3);
			String com = null;
			
			switch(ran) {
			case 0 : com="가위"; break;
			case 1 : com="바위"; break;
			case 2 : com="보"; break;
			}
			
			System.out.println("컴퓨터는 [" + com + "]를 선택했습니다.");
			
			if(player.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else {
				boolean win1 = player.equals("가위") && com.equals("보");
				boolean win2 = player.equals("바위") && com.equals("가위");
				boolean win3 = player.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("이겼습니다!");
					win++;
				} else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패", win, draw, lose);
			System.out.println();
			System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		double[] arr= new double[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) +"번 키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sum = 0;
		
		System.out.print("입력 받은 키 : ");
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		
		System.out.printf("\n평균 : %.2fcm", sum/arr.length);
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번 점수 입력 : ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / arr.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}
	
	public void practice10() {
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++)	{ 
			if(arr[i]==input) {
				System.out.println((i+1)+"번째 인덱스에 존재합니다.");
				flag=false;
				
//				break;
			}
		}
		if(flag) {
			System.out.println("존재하지 않습니다.");	
		}
//		char[][] arr = {
//				 {'a', 'b', 'c' },
//				 {'d', 'e', 'f' },
//				 {'g', 'h', 'i' }
//				};
//		
//		System.out.print("검색할 알파벳을 입력해주세요 : ");
//		char input = sc.next().charAt(0);
//		
//		boolean flag = true;
//		
//		for(int row=0; row<arr.length; row++) {
//			for(int col=0; col<arr[row].length; col++) {
//				if(arr[row][col]==input) {
//					System.out.printf("%c는 %d행 %d열에 존재합니다.", input, row, col);
//				flag=false;
//				}
//			}
//		}
//		if(flag) {
//			System.out.println("존재하지 않습니다.");
//		}
	}
	public void practice11() {
		
		int[][] arr = new int[3][3];
		
		for(int row=0; row<arr.length-1; row++) {
			for(int col=0; col<arr[row].length-1; col++) {
				int ran = (int)(Math.random()*10);
				arr[row][col] = ran;
				
				arr[row][arr[row].length-1] += ran;
				arr[arr.length-1][col] += ran;
				arr[arr.length-1][arr[row].length-1] += ran;
			}
		}
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();  // 개행
		}

	}
}



