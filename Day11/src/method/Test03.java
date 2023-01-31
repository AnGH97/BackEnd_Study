package method;

import java.util.Scanner;

public class Test03 {
	
	static int startPage() {
		System.out.println("1. 구구단 출력");
		System.out.println("2. 별찍기 출력");
		System.out.println("3. 종료");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static int gugudanInput() {
		System.out.println("1. 원하는 구구단 출력, 2. 전체 구구단 출력 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static int danInput() {
		System.out.println("출력하고 싶은 단을 선택하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static void gugudan1(int n) {
		if(n > 10 || n < 2) {
			errorPrint();
		}
		else {
			for(int i = 1; i < 10; i++) {
				System.out.println(n + " x " + i + " = " + (n*i));
			}
		}
	}
	
	static void gugudan2() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("===============");
		}
	}
	
	static void gugudanPrint(int d) {
		switch(d) {
		case 1:
			int n = danInput();
			gugudan1(n);
			break;
		case 2:
			gugudan2();
			break;
		default:
			errorPrint();
			break;
		}
	}

	static int starnum() {
		System.out.println("원하는 모양을 선택하세요");
		System.out.println("1. 네모, 2. 직삼각형 정방향, 3. 직삼각형 역방향, 4. 피라미드, 5. 다이아몬드");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static void starPrint(int n) {
		switch(n) {
		case 1:
			square();
			break;
		case 2:
			triangle1();
			break;
		case 3:
			triangle2();
			break;
		case 4:
			piramid();
			break;
		case 5:
			diamond();
			break;
		default:
			errorPrint();
			break;
		}
	}
	static void square() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangle1() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangle2() {
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= 5 ; j++) {
				if(j >= i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void piramid() {
		int l = (9/2) + 1;
		int n = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j >= (l-n) && j <= (l+n) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			n+=1;
			System.out.println();
		}
	}
	
	static void diamond() {
		int l = (9/2) + 1;
		int n = -1;
		for(int i = 1; i <= 5; i++) {
			n+=1;
			for(int j = 1; j <= 9; j++) {
				if(j >= (l-n) && j <= (l+n) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i = 1; i < 5; i++) {
			n-=1;
			for(int j = 1; j <= 9; j++) {
				if(j >= (l-n) && j <= (l+n) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void errorPrint() {
		System.out.println("잘못된 입력입니다.");
	}
	
	static void start() {
		while(true) {
			int num = startPage();
			switch(num) {
			case 1: 
				int d = gugudanInput();
				gugudanPrint(d);
				break;
			case 2:
				int s = starnum();
				starPrint(s);
				break;
			case 3:
				System.out.println("\"3. 종료\"를 선택하셨습니다. 프로그램을 종료합니다.");
				return;
			default:
				errorPrint();
			}
		}
	}
	
	public static void main(String[] args) {
		start();
		//무한반복으로 프로그램 구성
		//<첫화면>
		//1. 구구단 출력
		//2. 별찍기 출력
		//3. 종료
		
		//1번 입력시
		//1. 원하는 구구단 출력
		//원하는 구구단을 입력하세요:
		//2. 전체 구구단 출력
		
		//2번 입력시
		//1. 네모
		//2. 직삼각형 정방향
		//3. 직삼각형 역방향
		//4. 피라미드
		//5. 다이아몬드
		
		//무조건 실행 이후에 첫화면 이동/ 잘못된 번호 입력시 잘못된 입력 출력
	}

}
