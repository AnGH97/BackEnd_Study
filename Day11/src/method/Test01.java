package method;

public class Test01 {

	static int randomMake() {
		int A = (int) (Math.random() * 26);
		return A;
	}

	static int add() {
		int A = 65;
		int B = randomMake();
		return A + B;
	}

	static char makeChar() {
		int A = add();
		char B = (char) (A);
		return B;
	}

	static String makeString() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			char A = makeChar();
			s += A;
		}
		return s;
	}

	// 배열 없는 버전
	static void printString() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			s = makeString();
			System.out.println(s);
		}
	}

	// 배열 있는 버전
	static String[] Stringloop() {
		String s = "";
		String[] arr = new String[10];
		for (int i = 0; i < 10; i++) {
			s = makeString();
			arr[i] = s;
		}
		return arr;
	}

	static void arrprint() {
		String[] s;
		s = Stringloop();
		for (int i = 0; i < 10; i++) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		// 문자 A(65)에서 랜덤에서 0~25값을 추출 이후에
		// 더하기 연산해서 문자를 만듭니다.

		// 이 랜덤한 문자를 만드는 작업을 10번 실행하여 10개의 문자를 더하기 연산
		// 10개의 문자열을 출력해주세요.
		System.out.println("+++배열 있는 버전+++");
		System.out.println("================");
		arrprint();
		System.out.println("================");
		System.out.println("+++배열 없는 버전+++");
		printString();
		System.out.println("================");
	}

}
