package method;

import java.util.Scanner;

public class HW1 {
	static int[] computer() {
		int[] com = new int[3];

		for(int i = 0; i < com.length; i++) {
			int num = (int)(Math.random()*9) + 1;
			com[i] = num;
		}
		return com;
	}
	
	static void computerPrint() {
		System.out.println("!컴퓨터 선택 완료!");
	}
	
	static boolean numCheck(int c[]) {
		boolean ch = true;
		for(int i = 0; i < c.length - 1; i++) {
			for(int j = i+1; j< c.length; j++) {
				if(c[i] == c[j]) {
					ch = false;
				}
			}
		}
		return ch;
	}
	
	static int[] comNum() {
		int[]c = computer();
		
		while(true) {
			boolean ch = numCheck(c);
			if(ch == true) {
				break;
			}
			else if(ch == false) {
				c = computer();
			}
		}
		computerPrint();
		return c;
	}
	
	static int[] myNum() {
		int[] my = new int[3];
		boolean ch;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			System.out.print("숫자 1 : ");
			my[0] = sc.nextInt();
			System.out.print("숫자 2 : ");
			my[1] = sc.nextInt();
			System.out.print("숫자 3 : ");
			my[2] = sc.nextInt();
			
			ch = mynumRange(my);
			if(ch == false) {
				System.out.println("입력하신 숫자는 범위를 벗어났습니다. 다시 입력해주세요.");
				continue;
			}
			
			ch = mynumCheck(my);
			if(ch == false) {
				System.out.println("숫자가 중복되었습니다.다시 입력해주세요.");
			}
			else {
				break;
			}
		}
		return my;
	}
	
	static boolean mynumCheck(int m[]) {
		boolean mch = true;
		for(int i = 0; i < m.length -1; i++) {
			for(int j = i+1; j< m.length; j++) {
				if(m[i] == m[j]) {
					mch = false;
				}
			}
		}
		return mch;
	}
	
	static boolean mynumRange(int m[]) {
		boolean rch = true;
		for(int i = 0; i <m.length; i++) {
			if(m[i] >= 10 || m[i] < 0) {
				rch = false;
			}
		}
		return rch;
	}
	
	static int[] gameCheck(int c[], int m[]) {
		//out	ball	strike	
		int[] answer = new int[3];
		boolean a = true;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < m.length; j++) {
				if(c[i] == m[j]) {
					if(i == j) {
						answer[2]++;
						a = true;
						break;
					}
					else {
						answer[1]++;
						a = true;
						break;
					}
				}
				else {
					a = false;
				}
			}
			if(a == false) {
				answer[0]++;
			}
		}
		return answer;
	}
	
	static boolean strikeCheck(int a[]) {
		boolean ch = true;
		if(a[2] == 3) {
			ch = false;
		}
		return ch;
	}
	
	static void answerPrint(int a[]) {
		System.out.println(a[0] + "out, "+a[1] + "ball, " + a[2] + "strike 입니다.");
	}
	
	static void gameStart() {
		int[] com = new int[3];
		int[] my = new int[3];
		int[] answer = new int[4];
		boolean ch;
		com = comNum();
		
		while(true) {
			my = myNum();
			answer = gameCheck(com, my);
			ch = strikeCheck(answer);
			if(ch == false) {
				System.out.println("!!홈런!!");
				System.out.println("게임을 종료합니다.");
				return;
			}
			else {
				answerPrint(answer);
			}
		}
	}

	public static void main(String[] args) {
//		배열 숫자 야구게임(함수화)
//		숫자 야구게임이란?
//		랜덤 3자리 수를 com이 가지고있습니다
//		5(첫번째자리) 6(두번째자리) 7(세번째자리)
//		1~9까지만 들어갈 수 있습니다.또한 각 자리별로 같은 수가 있으면 안됩니다.
//		4 4 2(x) 1 1 2 (x)
		
//		예) com 5 6 7
//		첫째자리 : 4     첫째자리 : 6      첫째자리 : 5
//		둘째자리 : 3     둘째자리 : 3      둘째자리 : 4
//		셋째자리 : 2     셋째자리 : 5      셋째자리 : 3
//		Out입니다.       2ball입니다.      1Strike입니다.
//		첫째자리 : 5
//		둘째자리 : 6
//		셋째자리 : 7
//		홈런입니다. 
//		out / 1,2 Strike / 1,2,3 ball / 홈런
		
//		1.컴퓨터 랜덤 숫자 생성 단,중복제거
//		2. 유저 숫자 입력 단,중복 x 1 ~9안에 값만 허용
//		3. 컴퓨터 숫자와 유저가 입력한 숫자를 비교
//		  자리와 숫자가 같으면 Strike
//		  숫자는 같지만 자리가 다르면 ball
//		  입력한 숫자중에 똑같은 숫자가 하나도 없으면 out
//		4.출력
//		5. 만약에 3strike 나오면 게임종료
		
		gameStart();
		
		
	}
}
