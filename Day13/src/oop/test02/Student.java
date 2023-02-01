package oop.test02;

import java.util.Scanner;

public class Student {
	String name;
	int age;
	int kor;
	int math;
	int eng;
	int sum;
	double avg;
	
	void Input() {
		int[] sub = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	int Total() {
		int tot = kor + eng + math;
		return tot;
	}
	
	double Average() {
		return sum/3.0;
	}

	void Print1() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	void Print2() {
		sum = Total();
		avg = Average();
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	void Print3() {
		sum = Total();
		avg = Average();
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
