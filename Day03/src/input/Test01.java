package input;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		//앞 예제를 참고하셔서 사용자에게 입력을 받아 다음을 계산하세요
		//(결과화면)
		//자바 시험 점수 입력하세요
		//95 <- 입력
		//파이썬 시험 점수를 입력하세요
		//80
		//이름을 입력하세요
		//홍길동
		//---------------------------------
		//홍길동님의 성적 합계 = 175점, 평균 = 87.5
		
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자바 시험 점수 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("파이썬 시험 점수를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		sum = num1 + num2;
		double avg = (double)sum / 2;
		System.out.println("=======================================");
		System.out.println(name + "님의 성적 합계 = " + sum + "점, 평균 = " + avg);
		
		//====================================================================/
		//nextLine()을 사용하는 경우
		/*int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자바 시험 점수 입력하세요: ");
		num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("파이썬 시험 점수를 입력하세요: ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		sum = num1 + num2;
		double ave = (double)sum / 2;
		System.out.println("================================================");
		System.out.println(name + "님의 성적 합계 = " + sum + "점, 평균 = " + ave);*/
		
		sc.close();
		

		

		
	}

}
