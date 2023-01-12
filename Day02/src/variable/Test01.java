package variable;

public class Test01 {

	public static void main(String[] args) {
		//예) 현금이 1000원이 있다. 200원짜리 과자를 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println(잔돈);
		
		//1. 월급이 100원이다. 연봉은? (조건 : 세금 10%제외)
		int month = 100;
		double salary = (month * 12) * 0.9;
		System.out.println((int)salary);
		
		//2. 시험점수를 30, 50, 4점을 받았다. 평균은?(실수)
		int sub1 = 30, sub2 = 50, sub3 = 4;
		double ave = (double)(sub1 + sub2 + sub3)/3;
		System.out.println(ave);
		
		//3. 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int w = 3, l = 6;
		double wide = w*l/2;
		System.out.println(wide);	
		
		//4. 100초를 1, 40으로 출력
		int sec1 = 100;
		int min = sec1/60;
		int sec2 = sec1%60;
		System.out.printf("100초는 %d분 %d초입니다.", min, sec2);
		System.out.println();
		
		//5. 800원에서 500원짜리의 개수, 100원짜리 개수
		int num1 = 800;
		int num2 = 500;
		int num3 = 100;
		int five = num1/num2;
		int one = (num1%num2)/num3;
		System.out.printf("800원은 500원짜리 %d개, 100원짜리 %d개입니다.", five, one);
		
	}

}
