package ifelse;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//로그인
		int dbID = 1234;
		int dbPw = 1111;
		
		//1. id와 pw를 입력받는다.
		System.out.print("ID 와 PW를 입력하세요: ");
		
		//2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
		int ID = sc.nextInt();
		int PW = sc.nextInt();
		
		//예) 로그인 성공 or 로그인 실패
		if ((dbID == ID) && (dbPw == PW)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}	

	}

}
