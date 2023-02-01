package oop.test02;

public class Main {
	public static void main(String[] args) {
		//3명의 학생
		//이름, 나이, 국어, 영어, 수학, 총점, 평균
		//이름 나이 출력
		//모든 성적 총점 평균 출력
		//이름 나이 성적 총점 평균 출력
		
		for(int i = 0; i < 3; i++) {
			Student st = new Student();
			st.Input();
			
			st.Print1();
			System.out.println();
			st.Print2();
			System.out.println();
			st.Print3();
			System.out.println();
		}
		
	} 
	
}
