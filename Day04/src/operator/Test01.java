package operator;

public class Test01 {
	
	public static void main(String[] args) {
		//단축 연산자
		int a = 10;
		
		a = a + 5; // a+=5;
		
		//a += 5 -> a = a + 5;
		//a -= 5 -> a = a - 5;
		//a *= 5 -> a = a * 5;
		//a /= 5 -> a = a / 5;
		//a %= 5 -> a = a % 5;
		
		//삼항연산자
		//조건 ? 참 : 거짓
		
		int b = a == 10 ? 1:0;		
		System.out.println(b);
		
		String st = a == 15 ? "값이 같다" : "값이 다르다";
		System.out.println(st);
		
	}
}
