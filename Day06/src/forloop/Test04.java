package forloop;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//두 수를 입력받아 최대 공약수와 최소 공배수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a = num1;
		int b = num2;
		int r = a%b;
		
		if(num1 > num2) {
			a = num1;
			b = num2;			
			while(true) {
				r = a%b;
				if(r == 0) {
					break;
				}				
				a = b;
				b = r;
			}
		}
		else if(num2 > num1) {
			a = num2;
			b = num1;			
			while(true) {
				r = a%b;
				if(r == 0) {
					break;
				}				
				a = b;
				b = r;
			}
		}
		System.out.println("최대 공약수: " + b);
		System.out.println("최소 공배수: " + (num1 * num2)/b);
		
		
		
		
		

	}
}
