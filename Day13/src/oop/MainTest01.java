package oop;

public class MainTest01 {
	
	public static void main(String[] args) {
		ClassTest01 t1 = new ClassTest01();	//t1: 객체
		t1.a = 10;
		t1.print();
		
		ClassTest01 t2 = new ClassTest01();
		//변수 초기화를 안했는데 쓰레기 값이 아니라 0이 출력되는 이유는 무엇? => 객체가 생성되면서 0으로 초기화 됨!
		t2.print();
		
		//t1과 t2는 서로 다른 객체이다.
	}

}
