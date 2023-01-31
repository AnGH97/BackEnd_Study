package method;

public class MethodTest02 {
	static int abc(int a) {
		a = 5;
		return a;
	}
	
	public static void main(String[] args) {
		int a = 10;
		a = abc(a); // 기본 자료형은 Call by value
		//참조형 Call by reference
		//New ... -> Call by reference
		System.out.println(a);
		
	}

}
