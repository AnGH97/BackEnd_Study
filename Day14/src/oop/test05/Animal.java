package oop.test05;

import java.util.Scanner;

public class Animal {
	//동물이 4마리가 있습니다.
	//동물이 원숭이, 개, 닭, 돼지가 있습니다.
	//동물들은 자기가 무슨 동물인지와 음식을 들고 있습니다.	
	//(단, 여기서 무슨 동물과 음식은 함수로 통해서만 값을 넣고 사용할 수 있습니다)
	String name;
	String food;
	
	
	void Input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("동물 이름 : ");
		name = sc.next();
		System.out.print("먹이 : ");
		food = sc.next();
	}
	
	void Print() {
		System.out.println(name + "는 " + food +"를 갖고 있습니다.");
	}
	

}
