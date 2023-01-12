package first;

public class Test02 {
	
	public static void main(String[] args) {
		
		//IO - input/output - 입출력
		
		//System.out - 표준 출력 객체
		// - 자바에서 출력하기 위해 미리 만들어진 통로
		
		//.println() - 내용 출력 후 엔터
		//.print() - 내용만 출력
		//.printf() - 형식을 지정하여 원하는 위치에 출력
		
		System.out.print("Hello Java");
		//System.out.println();
		System.out.println("Hello JAVA");
		System.out.println("HELLO JAVA");
		
		//형식 지정자
		// %d - 부호가 있는 10진수 출력.(byte, short, int, long)
		// %x, %X - 16진수를 출력(양수만 가능)을 하고 X의 경우 대문자로 출력을 한다.
		// %o - 8진수를 출력(양수만 가능하다)
		// %c - 한개의 문자 출력( char )
		// %f - 고정 소수점 실수 출력 ( float )
		// %s - 문자열 출력합니다. ( String )
		// %% - %를 출력합니다.
		System.out.printf("-%s- \n", "안녕하세요");
		System.out.printf("제 성적은 %d점 입니다. \n", 100);
		System.out.printf("제 키는 %.1f입니다. \n", 154.9);
		//%f - 기본적으로 소수점 6번째자리까지 출력된다.
		//원하는 자리수 출력 - %.원하는숫자 f
		System.out.printf("%d", 10);
		
	}

}
