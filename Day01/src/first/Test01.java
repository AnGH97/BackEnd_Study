package first;//현재 파일이 속한 패키지를 적는 부분..
//패키지는 항상 가장 위에 적혀야 한다.
//package - import - class

public class Test01 {
	
	public static void main(String[] args) {
		//System.out.println(출력 내용);
		// - JAVA에서의 표준 출력 명령
		System.out.println("main(String[] args)");
		//모든 프로그래밍 언어에서 문장을 문자열이라고 부른다.
		//""안에 적으면 문자열 데이터로 인식된다.
		
		//정수
		System.out.println(10);
		System.out.println(20);
		System.out.println("30");	//컴퓨터에서는 문자열로 인식하고 있음.
		
		//실수
		System.out.println(2.34);
		System.out.println(1.0);	//소수점이 붙으면 전부 실수로 인식
		System.out.println(1);		//1.0 == 1이지만 실수 != 정수가 된다.
		
		//문자' '
		System.out.println('A');
		//System.out.println(A); - ''없으면 오류
		
		//문자열" "
		System.out.println("A");	//출력은 같지만, ''는 문자(char)로 인식하고 ""는 문자열(string)으로 인식함.
		
		
		
	}

}
