package forloop;

public class Test01 {
	
	public static void main(String[] args) {
		//아래의 구간을 for문을 이용하여 화면에 출력
		//[1] 2자리 정수
		int j = 10;
		for(int i = 10; i < 100; i++) {
			System.out.println("2자리 정수: " + i);
		}
		System.out.println("+++++++++++++++++++++++++");
		while(j < 100) {
			System.out.println("2자리 정수: " + j);
			j++;
		}
		System.out.println("===========================");
		//[2] 1부터 100사이의 홀수
		j = 1;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println("1부터 100 사이의 홀수: " + i);
			}
		}
		System.out.println("+++++++++++++++++++++++++");
		while(j <= 100) {
			if(j % 2 != 0) {
				System.out.println("1부터 100 사이의 홀수: " + j);
			}
			j++;
		}
		System.out.println("===========================");
		//[3] 대문자 알파벳
		j = 65;
		for(int i = 65; i <= 90; i++) {
			System.out.println("대문자: " + (char)(i));
		}
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
		System.out.println("+++++++++++++++++++++++++");
		while(j <= 90) {
			System.out.println("대문자: " + (char)(j));
			j++;
		}
		System.out.println("===========================");
		//[4] 1000보다 작은 3의 배수			감소식(1000부터 시작)
		j = 1000;
		for(int i = 1000; i >= 1; i--) {
			if(i % 3 == 0) {
				System.out.println("1000보다 작은 3의 배수: " + i);
			}
		}
		System.out.println("+++++++++++++++++++++++++");
		while(j >= 1) {
			if(j % 3 == 0) {
				System.out.println("1000보다 작은 3의 배수: " + j);
			}
			j--;
		}
		System.out.println("===========================");
		//[5] 1000보다 작은 2의 제곱수		증감식(1부터 시작)
		int a = 1;
		for(int i = 1; i<= 1000; i++) {			
			if(i == a) {
				System.out.println("1000보다 작은 2의 제곱수: " +i);
				a*=2;
			}
		}
		System.out.println("+++++++++++++++++++++++++");
		j = 1;
		a = 1;
		while(j <= 1000) {
			if(j == a) {
				System.out.println("1000보다 작은 2의 제곱수: " + j);
				a*=2;
			}
			j++;
		}
	}
}
