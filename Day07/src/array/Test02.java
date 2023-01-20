package array;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 배열의 크기가 10개인 배열을 만드세요.
		// 그리고 각각의 배열안에 값이 0 ~ 10까지 랜덤수를 추출하여 넣어줍니다.
		// 배열안의 값 중에 가장 큰 값이 몇번째 index에 있는지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		// 단, 가장 큰 값이 같은 값이 있으면 index를 같이 출력해주세요.

		while (true) {
			System.out.println("번호를 선택하세요: ");
			int num1 = sc.nextInt();
			switch (num1) {
			case 1:
				for (int i = 0; i < arr.length; i++) {
					int num = (int) (Math.random() * 11);
					arr[i] = num;
				}
				break;
			case 2:
				int cnt = 0;
				int max = 0;
				for (int i = 0; i < arr.length; i++) {
					if (max < arr[i]) {
						max = arr[i];
					}
				}
				for (int i = 0; i < arr.length; i++) {
					if (max == arr[i]) {
						cnt++;
					}
				}
				if (cnt == 1) {
					for (int i = 0; i < arr.length; i++) {
						if (max == arr[i]) {
							System.out.println("최대값: " + arr[i]);
						}
					}
				} else if (cnt > 1) {
					for (int i = 0; i < arr.length; i++) {
						if (max == arr[i]) {
							System.out.println(i + "번째 숫자, 최대값: " + arr[i]);
						}
					}
				}
				break;
			case 3:
				for (int i = 0; i < arr.length; i++) {
					System.out.println(i + "번째 수: " + arr[i]);
				}
				break;
			default:
				System.out.println("숫자를 잘못 입력하셨습니다. 시스템을 종료합니다.");
				return;
			}

		}
		// 1. 랜덤값 받기
		// 2. 최대값 찾기
		// 3. 출력
	}

}
