package method;

import java.util.Scanner;

public class Test01 {
	
	static int plus(int n1, int n2) {		//1. 돈을 빌림받고 돌려주는
		return n1 + n2;
	}
	
	static int multiply() {					//2. 돈을 빌려주는
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 :" + num1 +", num2 : " + num2);
		return num1 * num2;
	}
	
	static void minus(int n1, int n2) {		//3. 돈을 빌림 받았다
		System.out.println(n1 - n2);
	}
	
	static void divide() {		//return을 안쓸시에는(보낼 값이 없으면) void 쓰면 된다.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 1: ");
		double num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		double num2 = sc.nextInt();
		
		double tot = num1/num2;
		System.out.println("num1 :" + (int)num1 +", num2 : " + (int)num2);
		System.out.printf("%.1f", tot);
	}
	
	public static void main(String[] args) {	//4. 빌림x 돌려 x, 거래 x
		//계산기 함수화
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("연산자를 입력하세요: ");
		String op = sc.next();
		
		switch(op) {
		case "+":
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자 1: ");
			num1 = sc.nextInt();
			System.out.print("숫자 2: ");
			num2 = sc.nextInt();
			
			int dab = plus(num1, num2);
			System.out.println("num1 :" + num1 +", num2 : " + num2);
			System.out.println(dab);
			break;

		case "-":
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자 1: ");
			num1 = sc.nextInt();
			System.out.print("숫자 2: ");
			num2 = sc.nextInt();
			
			System.out.println("num1 :" + num1 +", num2 : " + num2);
			minus(num1, num2);
			break;
			
		case "*":
			System.out.println(multiply());
			break;
		case "/":
			divide();
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}

		//예)연산자 입력: +
		//숫자 1 입력 : 9
		//숫자 2 입력 : 6
		//결과값 : 15입니다.
		//단, 연산자가 잘못 입력되면 잘못된 연산자 입니다(출력)
		
		//예) 연산자 입력 : a (엔터)
		//잘못된 연산자 입니다(출력)
		//단, 나눗셈은 소수점 첫자리까지 출력해주세요.
		
		//1.더하기 연산		1. 주고 받고
		//2.곱하기 연산		2. 주고 안받고
		//3.빼기 연산		3. 안주고 받고
		//4.나누기 연산		4. 안주고 안받고
	}

}
