package oop.test02;

import java.util.Scanner;

public class User {
	
	int num;
	
	int Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		return num;
	}
}
