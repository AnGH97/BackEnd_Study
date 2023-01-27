package method;

import java.util.Scanner;

public class Test01_home_ver {
	
	static double input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("세과목의 점수를 입력하세요.");
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		double avg = average(kor, eng, math);
		return avg;
	}
	
	static double average(int k, int e, int m) {
		double avg = 0.0;
		boolean check = error(k, e, m);
		if(check == true) {
			avg = (k + e + m)/3.0;
		}
		else {
			error_print(k, e, m);
		}
		return avg;
	}
	
	static String score(double avg) {
		String grade = "";
		if(avg >= 95) {
			grade = "A+";
		}
		else if(avg >= 90) {
			grade = "A";
		}
		else if(avg >= 85) {
			grade = "B+";
		}
		else if(avg >= 70) {
			grade = "C";
		}
		else if(avg >= 60) {
			grade = "D";
		}
		else if(avg < 60) {
			grade = "F";
		}
		return grade;
	}
	
	static boolean error(int k, int e, int m) {
		boolean check = true;
		if(k > 100 || k< 0 || e > 100|| e < 0) {
			System.out.println("잘못된 입력입니다.");
			check = false;
		}
		return check;
	}
	
	static void error_print(int k, int e, int m) {
		if(k > 100 || k < 0) {
			System.out.println("국어 점수를 " + k + "로 잘못 입력하였습니다.");
		}
		if(e > 100 || e < 0) {
			System.out.println("국어 점수를 " + e + "로 잘못 입력하였습니다.");
		}
		if(m > 100 || m < 0) {
			System.out.println("국어 점수를 " + m + "로 잘못 입력하였습니다.");
		}
	}
	
	static void score_print(double avg) {
		String grade = score(avg);
		if(avg != 0.0) {
			System.out.printf("평균 : %.1f, 학점 : %s", avg, grade );
		}
		else {
			return;
		}
	}
	
	static void start() {
		double avg = input();
		score_print(avg);
	}
	public static void main(String[] args) {
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
		start();
		
		
	}

}
