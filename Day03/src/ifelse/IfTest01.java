package ifelse;

public class IfTest01 {
	
	public static void main(String[] args) {
		int a = 10, b = 10;
		
		if (a == b) {
			System.out.println("값이 같다.");
		}
		
		//값이 다르다if
		if (a != b) {
			System.out.println("값이 다르다.");
		}
		
		//if ~ else
		//예 ) 홀짝
		int num = 20;
		if ( num % 2 == 0) {
			System.out.println("짝수");
		}
		else {	// 위 조건이 거짓일 때 false 일 때 실행한다.
			System.out.println("홀수");
		}
		
		//위 조건 값이 같다, 다르다를 if ~ else 문으로
		if ( a == b ) {
			System.out.println("값이 같다.");
		}
		else {
			System.out.println("값이 다르다.");
		}
	}

}
