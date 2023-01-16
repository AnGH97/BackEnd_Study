package random;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		// 화면에 무작위로 구구단 1문제를 출제(2단 ~ 15단)
		// 2 x 1 = 부터		15 x 9 = 까지
		// 사용자가 정답을 입력할 수 있도록 프로그래밍 코드를 구현(Scanner)
		//[1] 맞춘 경우		정답! 10점 획득! 출력
		//[2] 틀린 경우		오답! 5점 감점! 출력
		
		//추가적으로, 어려운 문제(11단 이상)을 맞추면 10점 추가 획득!
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 14) + 2;
		int num2 = (int)(Math.random() * 9) + 1;
		
		System.out.print(num1 + " x " + num2 + " = ");
		
		int dab = sc.nextInt();
		int mul = num1 * num2;
		
		if(dab == mul) {
			System.out.println("정답! 10점 획득!");
			if(num1 >= 11 ) {
				System.out.println("어려운 문제! 10점 추가 획득!");
			}	
		}
		else {
			System.out.println("오답! 5점 감점!");
		}

	}
}
