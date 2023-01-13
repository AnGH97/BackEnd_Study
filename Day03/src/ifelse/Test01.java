package ifelse;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 입력받은 숫자가 양수, 0, 음수인지 출력
		System.out.print("숫자를 입력하시오: ");
		int num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("양수");
		}
		if (num1 < 0) {
			System.out.println("음수");
		}
		if (num1 == 0) {
			System.out.println('0');
		}
		
		//2. 입력받은 숫자가 4의 배수인지 아닌지
		System.out.print("숫자를 입력하시오: ");
		int num2 = sc.nextInt();
		if (num2 % 4 == 0) {
			System.out.println("4의 배수 입니다.");
		}
		else {
			System.out.println("4의 배수가 아닙니다.");
		}		
		
		//3. 성적 한개를 입력받고 입력 받은 성적이 80점 이상이면 합격, 아니면 불합격
		System.out.print("성적을 입력하시오: ");
		int score = sc.nextInt();
		if (score >= 80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
