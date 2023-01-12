package variable;

public class CharTest01 {
	
	public static void main(String[] args) {
		//문자
		// - ''(외따움표)안에 적어야 문자형 데이터로 인식된다.
		
		//char 2byte	0 ~ 65535
		
		//컴퓨터에서 정수만 처리할 수 있다.
		//컴퓨터에서 문자를 처리하기 위해 고유한 약속을 정해 놓았다.
		//문자마다 고유한 정수 값을 정해놓고 문자 사용시 정수값으로 읽는다.
		
		//1. 아스키 코드 - 1byte
		// - 가장 처음 만들어진 문자 체계
		// - 총 128가지의 문자들을 처리하였다.
		// - 키보드 위에 있는 문자들
		// - 키보드의 키 값으로도 사용된다.
		// - C계열의 언어는 기본 문자 체계가 아스키코드이다.
		
		/*
		 * 2. 유니코드 - 2byte
		 * - 아스키코드 + 이세상의 모든 문자 = 약 6만개
		 * - 자바는 기본 문자형식을 유니코드로 만들어 놓았다.
		 * - 오늘날에 가장 널리 쓰이는 문자체계(UTF-8)
		 */
		
		//아스키 코드
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		//유니코드
		ch = '가';
		System.out.println(ch);
		System.out.println((int)ch);
	}

}
