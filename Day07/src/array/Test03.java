package array;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) throws InterruptedException {
		//선택 장애 치료 프로그램
		
		//사용자에게 5가지 항목을 입력받아 배열에 저장
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		int num = (int)(Math.random()*arr.length);
		//무작위로 1가지를 추첨하여 화면에 출력
		System.out.println("- 메뉴를 입력하세요 - ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("항목: ");
			String menu = sc.next();
			arr[i] = menu;
		}
		//예)	항목: 김밥
		//		항목: 라면
		//		항목: 떡볶이
		//		항목: 자장면
		//		항목: 순대국
		//		추첨중 입니다.. (3초정도 보이게 하고)
		//		추첨된 항목은 떡볶이 입니다.
		
		System.out.println("추첨중 입니다..");
		Thread.sleep(3000);
		System.out.println("추첨된 항목은 " + arr[num] + " 입니다.");
		

	}

}
