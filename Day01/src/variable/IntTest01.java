package variable;

public class IntTest01 {
	
	public static void main(String[] args) {
		//정수형
		System.out.println(10); //단발성 데이터
		System.out.println(20);
		//byte		1byte =>-128~127까지만 저장 가능
		//short		2byte =>-32768~32767까지만 저장 가능
		//int 		4byte =>-2^31~2^31-1
		//long		8byte =>-2^63~2^63-1
		//1bit - 0 or 1 둘중 하나를 저장할 수 있는 컴퓨터의 최소 데이터 단위
		//1bit * 8 = 1byte
		
		byte a = 1;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		byte c = a;
		System.out.println(c);
	}
}
