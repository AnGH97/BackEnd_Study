package forloop;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) throws InterruptedException {
		//	타이머 만들기
		//	사용자에게 분을 입력받아서 해당하는 시간이 흐른 뒤 메시지가 출력되도록 코드 구현
		
		//	( 예상 결과 )
		//	분 입력: 3
		//	3분 0초 남음
		//	2분 59초 남음
		//	...
		//	0분 2초 남음
		//	0분 0초 남음
		//	타이머 끝 !
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		
		for(int i = (60*minute); i >= 0 ; i--) {
			int m = i / 60;
			int s = i % 60;
			System.out.println(m + "분 " + s + "초 남음");
			Thread.sleep(1000);
			//내가 원하는 시간만큼 코드를 멈추는 메소드
			//밀리언초 단위를 지정하여 시간을 설정한다.
			// 1000ms == 1s
		}
		System.out.println("타이머 끝!");
	}
}
