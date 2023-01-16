package random;

public class RanTest01 {
	
	public static void main(String[] args) {
		
		//Math.random()
		// - 0부터 1미만의 임의의 실수를 구하는 명령
		// - 0.00000000 ~ 0.9999999
		
		// 내가 원하는 범위의 임의의 수 구하기
		// - (int)(Math.random() * 개수) + 시작수
		
		//9 ~ 11
		int su = (int)(Math.random() * 3) + 9;
		System.out.println("su: " + su);
		
		//9 ~ 11
		//위에 것을 풀어쓴 것임.
		double a = Math.random();		//0.0000~0.9999
		double b = a * 3;	//0.0000~2.9999
		
		int c = (int)b;
		int d = c + 9;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println("d: "+ d);
	}

}
