package whileloop;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
//	   업다운 게임을 구현하려 합니다.
//	   컴퓨터에게 1부터 100 사이의 정답을 생성하도록 코드를 구현한 뒤
//	   사용자가 숫자를 입력하여 정답을 맞추도록 프로그래밍하세요
//	  
//	   <게임의 상태>
//	   [ 업 ] 사용자가 정답보다 낮은 값을 입력한 경우
//	   [ 다운 ] 사용자가 정답보다 높은 값을 입력한 경우
//	   [ 정답 ] 사용자가 정답과 같은 값을 입력한 경우, 게임 종료
//	  
//	   게임 종료시 총 입력한 횟수를 화면에 출력

		//무한 반복문을 사용한 경우
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1;
		int cnt = 0;
		
//		while(true) {
//			System.out.print("숫자를 입력하세요: ");
//			int mynum = sc.nextInt();
//			cnt++;
//			if (mynum > com) {
//				System.out.println("[ 다운 ]");
//			}
//			else if(mynum < com) {
//				System.out.println("[ 업 ]");
//			}
//			else if(mynum == com) {
//				System.out.println("[ 정답 ]" + '\t' + "총 입력 횟수: " + cnt + "번" );
//				break;
//			}
//		}
		while(true) {
			int user;
			//do~while
			// - 무조건 한번은 실행을 해야 하며 잘못된 데이터를 걸러낼때 사용한다.
			// - 형식적으로 종속문장이 먼저 실행되고 그 후에 조건식을 비교하는 형식
			// - 반복문 안에서 만들어진 결과를 조건식에서 비교하기 좋다.
			// - 제일 마지막에 ;을 적어야 한다.
			
			// - 주로 조건식에서는 내가 원하는 데이터 아닌 잘못된 데이터를 걸러내는 용도의 조건식을 적는다.
			
			//형식
		
			/*
			 * do{
			 * 		종속문장;
			 * }while(조건식);
			 */
			do {
				System.out.println("정답 입력: ");
				user = sc.nextInt();
			}while(user < 1 || user > 100);
			break;
		}
		
	}

}
