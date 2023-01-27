package method;

import java.util.Scanner;

public class Test01 {
	static double input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목의 점수를 입력하세요: ");
		System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		double a;
		a = average(korean, english, math);
		return a;
	}
	
	static double average(int n1, int n2, int n3) {
		double avg = 0.0;
		if(n1 <= 100 && n1 >=0 && n2 <= 100 && n2 >=0 && n3 <= 100 && n3 >=0) {
			avg = (double)(n1 + n2 + n3)/3;
		}
		else {
			confirm(avg, n1, n2, n3);
		}
		return avg;
	}
	
	static String grade(double a) {
		String g = "";
		
		if(a >= 95) {
			g = "A+";
		}
		else if(a >= 90) {
			g = "A";
		}
		else if(a >= 85) {
			g = "B+";
		}
		else if(a >= 70) {
			g = "C";
		}
		else if(a >= 60) {
			g = "D";
		}
		else if(a < 60) {
			g = "F";
		}
		return g;
	}
	
	static void confirm(double avg, int k, int e, int m) {
		if(avg == 0.0) {
			confirm_print(k, e, m);
		}
	}
	
	static void confirm_print(int k, int e, int m) {
		if(k > 100 || k < 0) {
			System.out.println("잘못 입력된 과목은 국어이며 점수는 " + k + "입니다." );
		}
		if(e > 100 || e < 0) {
			System.out.println("잘못 입력된 과목은 영어이며 점수는 " + e + "입니다." );
		}
		if(m > 100 || m < 0) {
			System.out.println("잘못 입력된 과목은 수학이며 점수는 " + m + "입니다." );
		}
		
	}
	
	static void print(double g) {
		String dab = grade(g);
		System.out.printf("평균은 값은 %.1f 이며,학점은 %s 입니다.", g, dab);
	}

	public static void main(String[] args) {
		double grade;
		grade = input();
		if (grade == 0.0) {
			return;
		}
		else {
			print(grade);
		}
		//세과목의 점수 입력(국어 영어 수학) 정수로 입력받으세요.
		//( ?	주고 안받고)
		//평균(소수점 첫번째자리까지) 학점 연산
		//( ?	주고 받고)
		//그 이후에 평균의 학점을 출력해주세요
		//A+ 95점 이상	/ A 90점 이상
		//B+ 85점 이상	/ C 70점 이상
		//D 60점 이상		/ F 60점 미만
		//( ?	주고 받고)
		//단, 각 점수마다 100점을 초과하는 점수를 입력하면 평균을 계산하지 않고
		//입력된 과목과 함께 점수를 잘못입력했습니다. 출력후 프로그램 종료
		//잘못된 입력값 확인( ?	안주고 받고)
		//잘못된 입력입니다. 출력( ?	안주고 받고)
		//평균 학점 출력( ?	안주고 받고)

	}

}
