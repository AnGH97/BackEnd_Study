package switchcase;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//메뉴 선택하기
		//1. 떡볶이
		//2. 자장면
		//3. 파스타
		//그 외의 숫자는 잘못입력하셨습니다. 를 출력
		System.out.print("1, 2, 3번 중 메뉴 선택 : ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("떡볶이");
			break;
		case 2:
			System.out.println("자장면");
			break;
		case 3:
			System.out.println("파스타");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}

	}

}
