package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
			
			if(i%2==0) {
				sum += arr[i];
			}
		} System.out.println("\n짝수 번째 인덱스의 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = 9-i;
			System.out.print(arr[i] + " ");
		
			if(i%2!=0) {
				sum += arr[i];
			}
		} System.out.println("\n홀수 번째 인덱스의 합 : " + sum);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
//		System.out.println(Arrays.toString(arr));
		
		boolean flag = true;
	
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(search==arr[i]) {
				System.out.print("인덱스 : " + i);
				
			flag=false;
			}
		}
		
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.next();
		
		char[] arr = new char[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			arr[i] = word.charAt(i);
		}
//		System.out.println(Arrays.toString(arr));
		
		System.out.print("문자 : ");
		char input = sc.next().charAt(0);
		
		int count = 0;
		String sum = "";
		
		for(int i=0; i<word.length(); i++) {
			if(arr[i]==input) {
				count++;
				sum += i + " ";
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", word, input);
		System.out.println(sum);
		System.out.println("i 개수 : " + count);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int amount = sc.nextInt();
		
		int[] arr = new int[amount];
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arr[i] = input;
			sum += input;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i=0; i<input.length(); i++) {
			if(i<8) {
				arr[i] = input.charAt(i);				
			} else {
				arr[i] = '*';
			}			
			System.out.print(arr[i]);
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		int[] arr = null;
		
		while(true) {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			if(input<3 || input%2==0) {
				System.out.println("다시 입력하세요.");
			} else {
				
				arr = new int[input];
				
				for(int i=0; i<arr.length; i++) {
					if(i<(input/2)) {
						arr[i] = i+1;			
					} else {
						arr[i] = input-i;
					}
				}
				break;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
				
		for(int i=0; i<arr.length; i++) {

			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
		}

		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
		}
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
			
			for(int x=0; x<i; x++) {
				if(arr[x]==arr[i]) {
					i--;
				break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			int ran = (int)(Math.random()*45+1);
			lotto[i]=ran;
			
			for(int x=0; x<i; x++) {
				if(lotto[x]==lotto[i]) {
					i--;
				break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.next();
		
		char[] letter = new char[word.length()];
		
		String sum = "";
		int count = 0;
		
		for(int i=0; i<letter.length; i++) {
			
			letter[i] = word.charAt(i) ;
		}
		for(int i=0; i<letter.length; i++) {
			for(int x=0; x<i; x++) {
				if(letter[x]==letter[i]) {
				
				}
				
			}
			count++;
			sum += letter[i] + ", ";
		}
		
		System.out.print("문자열에 있는 문자 : ");
		System.out.print(sum);
		System.out.println("\n문자 개수 : " + count);
		
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("배열의 크기를 입력하세요 : ");
		int amount = sc.nextInt();
		
		String[] arr = new String[amount];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		char moreInput = sc.next().charAt(0);			
	
		
		
		
	}
	public void practice15() {
		
		int[][] arr = new int[3][3];
	
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("(%d, %d)", row, col);
			}
			System.out.println();
		} 

	}
	public void practice16() {
		
		int[][] arr = new int[4][4];
		
		int count=0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = count++;
			System.out.printf("%3d", count);
			} 
			System.out.println();
		}
		
	}
	public void practice17() {
		int[][] arr = new int[4][4];
		
		int count=17;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = count--;
			System.out.printf("%3d", count);
			} 
			System.out.println();
		}
	}
	
	public void practice18() {
		
		int[][] arr = new int[4][4];
		
		for(int row=0; row<arr.length-1; row++) {
			for(int col=0; col<arr[row].length-1; col++) {
				
				int ran = (int)(Math.random()*10+1);
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
			System.out.println();
		}
	}
	public void practice19() {
		
	}
	
	
	
	
	
}
