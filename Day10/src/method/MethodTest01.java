package method;

public class MethodTest01 {
	static void a() {
		b();
		System.out.println("A");
	}
	static void b() {
		c();
		System.out.println("B");
	}
	static void c() {
		d();
		System.out.println("C");
	}
	static void d() {
		e();
		System.out.println("D");
	}
	static void e() {
		System.out.println("E");
	}
	
	static void f() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		a();	//stack - LIFO(Last In First Out)
	}

}
