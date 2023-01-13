package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 숫자 2개를 입력받아, 첫번째 숫자가 더 크면 true를 출력
		System.out.println("숫자 2개를 입력하세요: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		System.out.println(num1 > num2);
		
		//2. 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자 1개를 입력하세요: ");
		int num3 = sc.nextInt();
		System.out.println(num3 % 2 != 0);
		
		//3. 성적을 3개를 입력 받아 평균이 60정 이상이고 100점 이하이면 true출력
		System.out.println("성적 3개를 입력하세요: ");
		int kor = sc.nextInt(), eng = sc.nextInt(), mat = sc.nextInt();
		int avg = (kor + eng + mat)/3;
		System.out.println((avg >= 60) && (avg <= 100));
		
	}

}
