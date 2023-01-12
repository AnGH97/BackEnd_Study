package variable;

public class StringTest01 {
	
	public static void main(String[] args) {
		//String - 문자열
		// - 참조형
		// - 현재는 일반 변수처럼 사용
		// - 문자열을 구분하기 위해서 ""(쌍따옴표) 안에 저장한다.
		String name = "안가현";
		System.out.println(name);
		
		//문자열은 연산이 불가능하다.
		//단, 문자열 더하기는 가능하다.
		// - 문자열 더하기는 문자열 뒤에 문자열을 붙여준다.
		System.out.println(name + "더하기");
		System.out.println(name + 10);
		
		System.out.println(name + (10 + 20));		//답: name30
		System.out.println(10+20+name);				//답: 30name
		
		int time = 100;
		int min = 100/60;
		int sec = time%60;
		System.out.println(min + "분 " + sec + "초");
		
	}

}
