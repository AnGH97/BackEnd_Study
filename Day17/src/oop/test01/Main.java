package oop.test01;

public class Main {
	
	public static void main(String[] args) {	
		//오버로딩 ?
		//사용자 측면에서 편하게 사용하기 위해서
		
		//개발 -> 생성 + 사용
		//오버로딩은 -> 메소드, 생성자
		// - 오버로딩은 함수명을 똑같이 해서 사용하면 됩니다.
		
		Test01 t1 = new Test01();
		System.out.println(t1.add(1, 1));
		System.out.println(t1.add(1.1, 2.1));
		
		//매개변수의 개수가 다르거나 또는 타입이 다르면 같은 메소드명을 써도 상관 x
		// - 리턴 타입은 무관
		
	}

}
