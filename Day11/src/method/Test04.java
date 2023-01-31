package method;

import java.util.Scanner;

public class Test04 {
	
	static int[] reserve() {
		int[] s = new int[2];
		System.out.println("예약할 좌석을 선택해 주세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");		
		s[0] = sc.nextInt();
		System.out.print("열 : ");
		s[1] = sc.nextInt();

		return s;
	}
	
	static boolean range(int s[]) {
		boolean ch = true;
		if(s[0] < 1 || s[0] > 9 || s[1] < 1 || s[1] > 2) {
			ch = false;
		}
		else {
			ch = true;
		}
		return ch;
	}
	
	static void rangefailPrint() {
		System.out.println("행, 열을 잘못 입력하였습니다. 다시 입력해주세요.");
	}
	
	static boolean seatCheck(int s[], int arr[][]) {
		boolean check = true;
		if (arr[s[0]-1][s[1]-1] == 1) {
			check = false;
		}
		return check;
	}
	
	static void failPrint() {
		System.out.println("예약이 완료된 자리 입니다. 다시 예약해주세요.");
	}
	
	static void okPrint() {
		System.out.println("예약이 성공적으로 완료되었습니다.");
	}
	
	static void finishiPrint() {
		System.out.println("예약이 모두 완료되었습니다. 시스템을 종료합니다.");
	}
	
	static void seatPrint(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					System.out.println((i+1) + "행 " + (j+1)+ "열");
				}
			}
		}
	}
	
	static void start() {
		int[][] plane = new int[9][2];
		int[] seat;
		int cnt = 18;
		while(true) {
			seat = reserve();
			int r = 0;
			int c = 0;
			boolean rch = range(seat);
			
			if(rch == false) {
				rangefailPrint();
				continue;
			}
			else if(rch == true) {
				r = seat[0]-1;
				c = seat[1]-1;
			}
			boolean sch = seatCheck(seat, plane);
			
			if(sch == false) {
				failPrint();
				seatPrint(plane);
				continue;
			}
			else if(sch == true) {
				okPrint();
				plane[r][c] = 1;
				cnt--;
			}
			
			if(cnt == 0){
				finishiPrint();
				return;
			}
		}
	}

	public static void main(String[] args) {
		//비행기 예약 시스템 만드리 함수화해주세요
		//단, 배열관련 함수가 하나 이상 존재해야 합니다.
		//비행기 예약 시스템 만들기
		//좌석은 총 18자리 입니다.
		//예약할 좌석을 행의 위치, 예약할 좌석의 열의 위치
		//두 값을 입력받습니다.
		//좌석은 9행 2열로 이루어졌습니다.
		//좌석의 행과 열을 입력시
		//예약 좌석이 0이 되면 프로그램 종료
		//(예약이 끝났습니다.)
		//예) 예약하실 좌석을 입력해주세요 ( 총 18석 ):
		//	5(엔터)	행
		//	1(엔터)	열
		//5행 1열에 아무도 예약을 하지 않을시 예약이 완료됐습니다. 출력
		//만약에 5행 1열에 예약한 사람이 있을시 예약이 완료된 자리입니다. 다시 예약해주세요
		//출력 후 비어있는 좌석을 출력해서 알려줍니다.
		//비어있는 좌석은 1행 1열 입니다.(이런 타입으로 전체를 다 알려주어야합니다.)
		//(행과 열을 입력시 행은 8보다 크거나 0보다 작거나
		// 열은 1보다 크거나 0보다 작으면 잘못된 입력입니다. 출력)
		start();
		
	}
}
