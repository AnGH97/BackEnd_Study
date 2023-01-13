package input;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 값 : " + (num1 + num2));
		System.out.println("빼기 결과 값 : " + (num1 - num2));
		System.out.println("곱하기 결과 값 : " + (num1 * num2));
		System.out.println("나누기 결과 값 : " + (num1 / num2));
		System.out.println("나머지 연산자 결과 값 : " + (num1 % num2));
		//숫자 2개를 입력받습니다
		//입력 받은 숫자를 더하기, 빼기, 곱하기, 나누기, 나머지 연산자로 연산한 결과 값을 출력해주세요.

		//숫자1 : 10(엔터)
		//숫자2 : 5(엔터)
		//더하기 결과 값 : 15
		//빼기 결과 값 : 5
		//곱하기 결과 값 : 50
		//나누기 결과 값 : 2
		//나머지 연산자 결과 값 : 0

	}

}
