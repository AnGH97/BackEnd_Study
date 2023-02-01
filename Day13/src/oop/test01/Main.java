package oop.test01;

public class Main {
	public static void main(String[] args) {
		//개 - 색깔, 무게, 짖는다
		//고양이 - 색깔, 무게, 야옹한다.
		//새 - 색깔, 무게, 날아다닌다.
		
		
		
		//개 2마리
		Dog d1 = new Dog();
		//d1.color = "검정색";
		d1.weight = 1.3;
		d1.Print();
		Dog d2 = new Dog();
		//d2.color = "하얀색";
		d2.weight = 2.2;
		d2.Print();
		System.out.println();
		//고양이 2마리
		Cat c1 = new Cat();
		//c1.color = "줄무늬";
		c1.weight = 0.6;
		c1.Print();
		Cat c2 = new Cat();
		//c2.color = "점박이";
		c2.weight = 2.8;
		c2.Print();
		System.out.println();
		//새 1마리
		Bird b1 = new Bird();
		//b1.color = "빨간색";
		b1.weight = 500;
		b1.Print();
	}
}
