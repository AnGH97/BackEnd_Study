package ifelse;

import java.util.Scanner;

public class IfTest02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴번호 입력: ");
		int menu_num = sc.nextInt();
		if (menu_num == 1) {
			System.out.println("떡볶이");
		}
		else if(menu_num == 2) {
			System.out.println("우동");
		}
		else if(menu_num == 3){
			System.out.println("순대");
		}
		//사용자에게 메뉴번호를 입력받아
		//1. 떡볶이
		//2. 우동
		//3. 순대
		//번호에 맞는 메뉴를 출력하세요.
		
		
		
	}

}
