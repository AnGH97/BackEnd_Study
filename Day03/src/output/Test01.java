package output;

public class Test01 {
	
	public static void main(String[] args) {
		
		//제어 문자
		/*
		 * - 특수한 기능을 하는 문자들
		 * - 주로 콘솔창을 제어하는 문자
		 * - 실행 하고자하는 위치에 적으면 된다.
		 * - \뒤에 기능에 맞는 문자를 적으면 된다.
		 * - 약 30가지
		 * 
		 */
		
		System.out.println((int)'\n');
		
		/*
		 * \n ( New Line, LineFeed)
		 * - 커서를 다음줄로 이동시키는 제어 문자
		 */
		System.out.println("가 \n나");
		
		/*
		 * \t ( Tab )
		 * - 커서를 탭 크기만큼 이동시키는 제어문자
		 * - 주로 줄 맞출때 사용
		 */
		System.out.println("이름\t:안가현");
		System.out.println("전화번호\t:010-1234-5678");	
		
		//\r, \b, \a
		
		//문자열에서 특수한 기능을 하는 문자들을 출력을 할 때 지장이 생긴다.
		// \뒤에 적으면 문자로 인식이 된다.
		// "Hi"
		System.out.println("\"Hi\"");
		
		//C:\안소연\Java\WorkSpace
		System.out.println("C:\\안소연\\Java\\WorkSpace");

	}

}
