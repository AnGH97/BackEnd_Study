package oop.test03;

public class Test01 {
	public static void main(String[] args) {
		A a = new A();
		B b = a.makeB();	//쓰는건 가능		
		//b.k = 10;	// NullPoint Error 발생
		
		C c = new C();
		D d = c.makeD();
		D d1 = c.makeD();
		//d와 d1은 같은 객체 일까요?? 다른 객체 일까요??
		//메소드에서 new를 두번 진행하였기 때문에 서로 다른 객체
		System.out.println(d);
		System.out.println(d1);
		B b1 = c.makeB();
		B b2 = c.makeB();
		System.out.println(b1);
		System.out.println(b2);
		
	}
}

class A{
	B b;
	B makeB() {
		//b = new B();
		return b;
	}
}

class B{
	int k;
	
}

class C{
	B b = new B();
	D makeD() {
		D d = new D();
		return d;
	}
	B makeB() {
		return b;
	}
}

class D{
	
}