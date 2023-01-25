package method;

public class MethodTest01 {
	//1. 주고 받고
//	int abc(int a,...) {
//		return 자료형 int;
//	}
	//2. 주고 안받고			//get
//	int abc{
//		return 자료형 int;
//	}
	
	//3. 안주고 받고			//set		
//	void abc(int a,...) {	
//		
//	}
	
	//4. 안주고 안받고	//출력	
//	void abc{
//		
//	}
	//1. 주고받고
	static String abc(String name){			//2. 매개변수 name이 "홍길동"이라는 문자열을 받는다.
		return "안녕하세요 " + name + "님!";	//3. 안녕하세요 홍길동님!이라는 문자열을 보내준다.
	}
	
	//2. 주고 안받고
	static int sum() {	//매개변수가 없는 이유 : 받을 값 x
		int a = 10;
		int b = 20;
		return a+b;
	}
	
	//3. 안주고 받고
	static void outputName(String name) {
		System.out.println("안녕하세요 " + name +"님");
	}
	
	//4. 안주고 안받고
	static void printHello() {
		System.out.println("Hello~~~~~~~~~~");
	}

	public static void main(String[] args) {
		//메소드(함수) - 기능을 담당
		// - 만드는 이유 : 코드의 재사용성
		
		//프로그램 메소드
		// 1. 주고 받고
		// 2. 주고 안받고
		// 3. 안주고 받고
		// 4. 안주고 안받고
		
		//자료형(void) 함수명(매개변수){
		//(return)->1, 2
		//}
		
		//메소드 특징
		// - 매개변수 또는 인자는 무한하게 됩니다. 100개 받을수 있고 1000개 받을 수도 있다.
		// - 리턴은 자료형 타입 기본형 참조형 다 됩니다.
		// 	- 하나만 됩니다. -> 자료형으로 하나만 됩니다.
		//	- 값이 하나 x
		// 
		
		//static : 아무 영향도 안받고 바로 메모리에 올라갑니다.
		
		String name = "홍길동";
		String print = abc(name);	//1. abc 메소드 호출(인자 값 홍길동을 넘겨준다)
		//4. 메소드에서 보내준 문자열을 print 변수에 저장된다.
		System.out.println(print);	//5. print안에 있는 변수값을 출력한다.
		
		int tot = sum();
		System.out.println(tot);
		
		outputName(name);	//값을 넣어줄 변수가 필요 x: 메소드에서 보내주는 값이 없기 때문에
		printHello();
		
	}

}
