package method;

import java.util.Scanner;

public class Test02 {
	
	static String inputString() {
		System.out.print("문자열을 입력하여 주세요: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		//띄어쓰기를 원하는 경우 nextLine();을 사용하면 됨.
		return n;
	}
	
	static int inputnum() {
		System.out.print("1. 짝수, 2. 홀수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static String extract(String n, int num) {
		String s = "";
		if(num == 1) {
			for(int i = 0; i < n.length(); i++) {
				if (i % 2 == 0) {
					s+=n.charAt(i);
				}
			}
		}
		else if(num == 2) {
			for(int i = 0; i < n.length(); i++) {
				if(i % 2 != 0) {
					s+=n.charAt(i);
				}
			}
		}
		return s;
	}
	
	static void print(String s) {
		if(s.equals("")) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			System.out.println(s);
		}
	}
	
	static void start() {
		String s = inputString();
		int n = inputnum();
		String d = extract(s, n);
		print(d);
	}
	
	
	public static void main(String[] args) {
		//문자열을 입력받습니다. 그리고 난 후에 1. 짝수, 2. 홀수를 선택합니다.
		//그러면 문자열의 홀수나 짝수 인덱스의 값을 추출해서 출력을 해주는 프로그램을 구현하세요.
		
		//korea
		//홀수 - > str.charAt(1), str.charAt(3)
		//짝수 - > str.charAt(0), str.charAt(2),  str.charAt(4)
		
		//문자열을 입력하세요 : korea
		//1. 짝수 2. 홀수 : 1
		//kra 출력됨.
		//함수화 main에는 한줄에 있어야 합니다. 입력 출력 연산 불리해서 함수화 시켜주세요.
		//잘못된 입력도 해주세요. 한번만 실행되도록.
		start();
	}

}
