package method;

import java.util.Scanner;

public class Test02 {
	static int square() {
		int [] arr = input();
		int dab = arr[0] * arr[1];
		return dab;
	}

	static int triangle() {
		int [] arr = input();
		int dab = (arr[0] * arr[1])/2;
		return dab;
	}
	
	static int[] input() {
		Scanner sc = new Scanner(System.in);
		int[] length = new int[2];
		System.out.print("가로 : ");
		length[0] = sc.nextInt();
		System.out.print("세로 : ");
		length[1] = sc.nextInt();
		return length;
	}
	
	static boolean start(int num) {
		boolean check = true;
		switch(num) {
		case 1:
			int answer1 = square();
			System.out.println("사각형의 넓이는 " + answer1 + "입니다.");
			break;
		case 2:
			int answer2 = triangle();
			System.out.println("삼각형의 넓이는 " + answer2 + "입니다.");
			break;
		case 3:
			System.out.println("\"종료\"를 선택하셨습니다. 프로그램을 종료합니다.");
			check = false;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			System.out.println("프로그램을 강제 종료합니다.");
			check = false;
			break;
		}
		return check;
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. 사각형 넓이\t 2. 삼각형 넓이\t 3. 종료");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			boolean c = start(n);
			if(c == false) {
				break;
			}
		}
		//1. 사각형 넓이 2. 삼각형 넓이 3. 종료			<첫화면>
		
		//만약에 1 또는 2번 입력시 -> 1. 가로 : / 2. 세로:
		//결과값을 출력합니다. 예) 사각형 넓이 : 25
		//첫화면으로 이동합니다.
		//(단, 1 ~ 3 이외의 값을 입력하면 잘못된 입력입니다. 출력)
		
		//사각형 넓이 구하는 함수
		//삼각형 넓이 구하는 함수
		//입력 함수.
	}

}
