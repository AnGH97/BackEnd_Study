package oop.test03;

public class Main {
	
	public static void main(String[] args) {
		Test01 t1 = new Test01();	//디폴트 생성자 호출
		//t1.print();
		System.out.println(t1.b);	//객체 new를 하기 전..null(공간 생성 x)
		t1.b = new B();
		System.out.println(t1.b);	//객체 new를 하고 난 후..(공간 생성된 상태)
		
		Test01 t2 = new Test01(1);	// 1번 생성자 호출(정수만 받는 생성자)
		//t2.print();
		System.out.println(t2.b);
		
		Test01 t3 = new Test01(1, 1.1);	// 2번 생성자 호출(정수, 실수 받는 생성자)
		//t3.print();
		
		//Scanner sc = new Scanner(); // 디폴트 생성자 x
		
		C c = new C();
		System.out.println(c.b);	//이미 C라는 클래스에 b를 new 했기 때문에
		C c1 = new C();
		System.out.println(c1.b);	//위 c와 c1은 b라는 객체 생성이 된 상태가 된다.(공간 생성된 상태)
	}

}
