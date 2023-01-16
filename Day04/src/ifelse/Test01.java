package ifelse;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		//3 6 9 게임
		//1 ~ 50 사이의 숫자를 입력한다.
		//십의 자리수가 3 6 9 - 3 6 9 세는 개수 변수 1 증가
		//일의 자리수가 3 6 9 - 3 6 9 세는 개수 변수 1증가
		
		//두번째 비교
		//위 수에 3, 6, 9 개수가
		//2개이면 짝짝을 출력
		//1개이면 짝을 출력
		//0개이면 해당 숫자를 출력
		//33 : 짝짝
		//16 : 짝
		//7 : 7
		
		if(num/10 > 0) {		//num이 두 자리수이면서
			if(num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {	//num이 30대라면 (범위가 1-50기 때문에 60, 90은 무시됨)
				cnt++;			//cnt 증가
			}		
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
								//num의 일의 자리가 3, 6, 9라면
				cnt++;			//cnt 증가
			}
			if(cnt == 2) {		//cnt == 2(3, 6, 9의 갯수가 2개인 경우)
				System.out.println("짝짝");	
			}
			else if(cnt == 1) {	//cnt == 1(3, 6, 9의 갯수가 1개인 경우)
				System.out.println("짝");
			}
			else {				
				System.out.println(num);
			}
		}
		else if(num/10 == 0) {	//num이 한 자릿수이면서
			if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {	
								//num의 일의 자리가 3, 6, 9라면
				cnt++;			//cnt 증가
			}	
			if(cnt == 1) {		//cnt == 1(3, 6, 9의 갯수가 1개인 경우)	
				System.out.println("짝");
			}
			else {
				System.out.println(num);
			}
		}

	}

}
