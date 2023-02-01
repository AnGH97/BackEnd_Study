package oop.test03;

public class Test01 {
	int n;
	double d;
	B b;	//객체 생성 x, 선언만..
	Test01(){//디폴트 생성자
		
	}
	
	Test01(int a){//생성자
		n = a;
		print();
	}
	Test01(int a, double b){//생성자
		n = a;
		d = b;
		print();
	}
	
	void print() {
		System.out.println(n + "\t" + d);
	}
}

class B{
	
}
class C{
	B b = new B();
}