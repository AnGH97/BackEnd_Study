package ifelse;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//중국집 주문 프로그램
		//사용자에게 자장면, 짬뽕, 주문 수량 입력받아 결제 금액을 계산하여 출력
		int ap = 5000, bp = 6000, rate1 = 3000, cnt1 = 7, cnt2 = 15;
		double sum, rate2 = 0.85;
		
		//자장면 - 5000원
		System.out.print("짜장면 갯수: ");
		int a = sc.nextInt();
		//짬뽕 - 6000원
		System.out.print("짬뽕 갯수: ");
		int b = sc.nextInt();
		//10그릇 이상 주문하면 10%할인 처리
		if ( a + b >= cnt2) {
			sum = (a*ap + b*bp)*rate2;
			System.out.println("총 금액: " + (int)sum);
		}
		//5그릇 이상 주문하면 3천원 할인되도록 금액을 계산하여 출력
		else if( a + b >= cnt1) {
			sum = (a*ap + b*bp) - rate1;
			System.out.println("총 금액: " + (int)sum);
		}
		else {
			sum = (a*ap + b*bp);
			System.out.println("총 금액: " + (int)sum);
		}
	}
}
