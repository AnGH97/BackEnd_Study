package variable;

public class BooleanTest01 {
	
	public static void main(String[] args) {
		//논리형 - boolean	1byte	true/false
		//참과 거짓을 관리하는 자료형
		// - 어떤 대상을 표현할 때 상태가 값이 두 가지인 경우
		
		boolean a = true;
		System.out.println(a);
		
		//관계 연산자 - 데이터의 관계를 연산하는 연산자
		// <	>	<=	>=	== !=
		//a > b : a가 b보다 크다
		//a < b : a가 b보다 작다
		//a >= b : a가 b보다 크거나 같다
		//a <= b : a가 b보다 작거나 같다
		//a == b : a와 b가 같다.
		//a != b : a와 b가 다르다.
		int n1 = 3, n2 = 5;
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		//논리 연산자
		// - 조건식에 대한 참과 거짓을 판별하는 연산자
		// && = and(논리곱)	: 양쪽 모두 참일때 참을 발생
		// || = or(논리합)	: 둘중 하나라도 참이면 참을 발생
		System.out.println(n1 < n2 && n1 != n2);
		System.out.println(n1 > n2 && n1 != n2);
		
		System.out.println(n1 < n2 || n1 != n2);
		System.out.println(n1 > n2 || n1 != n2);	
		System.out.println(n1 > n2 || n1 == n2);
		
		//- ! = not(부정) : 참->거짓, 거짓->참
		System.out.println(!(n1 > n2));
		
	}

}
