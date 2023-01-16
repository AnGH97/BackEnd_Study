package random;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		/*
	    * # 연산자 기호 맞추기 게임
	    * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
	    * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
	    * 3. 위 숫자는 연산자 기호에 해당된다.
	    *      1) 덧셈     2)  뺼셈     3) 곱셈    4) 나머지
	    * 4. 사용자는 연산자 기호를 맞추는 게임이다.
	    * 예) 3 ? 4  = 7
	    *    1) + 2) - 3) * 4) %
	    *    정답 : 1번
	    */
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random() * 10) + 1;
		int num2 = (int)(Math.random() * 10) + 1;
		int num3 = (int)(Math.random() * 4) + 1;
		
		switch(num3) {
		case 1:
			System.out.println(num1 + " ? " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " ? " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " ? " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println(num1 + " ? " + num2 + " = " + (num1%num2));
			break;
		default:
		}
		System.out.println("1) + 2) - 3) * 4) %");
		System.out.print("알맞는 연산자 번호를 입력하십시오: ");
		int dab = sc.nextInt();
		if (num3 == dab) {
			System.out.println("정답 : " + dab + "번 입니다.");
		}
		else {
			System.out.println("오답입니다, 정답은: " + num3 +"번 입니다." );
		}
	}

}
