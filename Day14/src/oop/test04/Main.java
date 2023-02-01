package oop.test04;

public class Main {
	public static void main(String[] args) {
//		Test01 t1 = new Test01();
//		Test01 t2 = new Test01();
		
		//클래스 배열(참조 자료형 배열)
		// - 객체 하나 쓰면 계속 만들어야 하기 때문에 힘들기 때문에
		//	보안하기 위해 하나가 여러 객체를 관리하면 좋겠다..
		
		Test01[] t = new Test01[5];	//배열 객체를 만든것..
		for(int i = 0; i < t.length; i++) {
			t[i] = new Test01();	//인덱스 한곳마다 객체 생성
			t[i].a = i+1;
			System.out.println(t[i].a);
		}
	}

}
