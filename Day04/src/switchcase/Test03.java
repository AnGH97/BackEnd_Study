package switchcase;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1을 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2를 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력: ");
		String s = sc.next();
		int sum = num1 + num2;
		int mul = num1 * num2;
		int minus = num1 - num2;
		double div = (double)num1/num2;
		
		
		switch(s) {
		case "+":
			System.out.println("결과 값: " + sum + "입니다." );
			break;
		case "-":
			System.out.println("결과 값: " + minus + "입니다." );
			break;
		case "*":
			System.out.println("결과 값: " + mul + "입니다." );
			break;
		case "/":
			System.out.printf("결과 값: %.1f 입니다.\n", div);
			break;	
		default:
			System.out.println("잘못된 연산자 입니다.");
		}
		//계산기 만들기
		//예) 숫자1 입력: 5
		//	 숫자2 입력: 10
		//	 연산자 입력 : + 
		//	 결과 값 : 15 입니다.
		
		// - 연산자: +, *, -, /
		//단, 연산자가 잘못 입력되면 잘못된 연산자 입니다. 출력.
		//			나눗셈 소수점 첫번째 자리까지 출력해주세요.
		
	}
}
