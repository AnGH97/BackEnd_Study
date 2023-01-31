package method;

public class MethodTest03 {
	
	static void abc(int a) {
		if(a == 0) {
			System.out.println(a);
			return;
		}
		else {
			System.out.println(a);
			abc(a-1);
		}
	}
	
	static int ab(int a) {
		if(a == 0) {
			System.out.println(a);
			return 0;
		}
		else {
			System.out.println(a);
			return ab(a-1);
		}
	}
	
	public static void main(String[] args) {
		//재귀 함수 - 자기 자신 호출 
		//주의 사항 : 종료지점이 없을 시 무한..
		
		abc(5);
		System.out.println("================");
		ab(5);
		
		// - void가 아닌 return 바꾸어서 출력해보세요.
	}

}
