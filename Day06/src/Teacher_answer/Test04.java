package Teacher_answer;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		//두 수를 입력받아 최대 공약수와 최소 공배수를 구하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int n2 = sc.nextInt();
		int max = 0;
//		if(n1 <= n2) {
//			for(int i=1;i<=n1;i++) {
//				if(n1 % i == 0 && n2 % i == 0) {
//					max = i;
//				}
//			}
//		}
//		else {
//			for(int i=1;i<=n2;i++) {
//				if(n1 % i == 0 && n2 % i == 0) {
//					max = i;
//				}
//			}
//		}
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				max = i;
			}
		}
		
		int min = (n1 * n2) / max;
		System.out.println("최대 공약수 : "+max);
		System.out.println("최소 공배수 : "+min);
		
		int a = 36;
		int b = 120;
		int r = 1;
		
		while(r>0) {
			r = a % b;
			a = b;
			b = r;
		}
		int gcd = a;
		System.out.println(gcd);//최대공약수
		
		
		
		
		
		
		
		
		
	}

}
