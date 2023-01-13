package ifelse;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//시험 점수 3개 입력받고 학점 출력
		//조건1) 3과목의 평균을 가지고 점수를 매긴다.
		//조건2) 3과목의 평균이 100~90 --> A
		//조건3) 3과목의 평균이 89~90 --> B
		//조건4) 3과목의 평균이 79~70 --> C
		//조건5) 그 외 --> F
		System.out.println("3과목의 점수를 입력하세요: ");
		int kor = sc.nextInt(), eng = sc.nextInt(), mat = sc.nextInt();
		int avg = (kor + eng + mat)/3;
		if(avg >= 90 && avg <= 100) {
			System.out.println('A');
		}
		else if(avg >= 80) {
			System.out.println('B');
		}
		else if(avg >= 70) {
			System.out.println('C');
		}
		else {
			System.out.println('F');
		}
		
	}

}
