package oop.test02;

public class Computer {
	
	int num;
	
	Computer(){
		num = (int)(Math.random() * 31) + 1;
	}
	
	void Up() {
		System.out.println("업");
	}
	
	void Down() {
		System.out.println("다운");
	}
	
	void Error() {
		System.out.println("잘못된 입력입니다.");
	}
	
	void Correct() {
		System.out.println(num + " 정답입니다.");
	}
}
