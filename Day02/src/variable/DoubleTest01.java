package variable;

public class DoubleTest01 {
	
	public static void main(String[] args) {
		//실수
		//실수형 자료형 - double
		//float		4byte		유효자리수: 7자리
		//double	8byte		유효자리수: 15자리
		
		float a = 123.456f;
		//실수형 상수는 기본적으로 double형
		//float로 인식하려면 상수 뒤에 f를 적어주면 된다.
		
		//1. 자료형이 큰쪽에서 작은쪽으로 이동할때는 error가 발생한다.
		// - 같은 크기라면 정수보다 실수가 더 크다.
		// - 조금이라도 데이터 손실이 발생될 수 있는 상황이라면
		// 	 오류가 발생..
		
		//double > long > float > int > short == char > byte
		
		//CAST연산자
		//(자료형)상수, 변수, (연산식)
		// - 내가 원하는 데이터 타입으로 일시적으로 변환시키는 연산자
		
		double d = a;
		System.out.println(d);
		float f = (float)d;
		System.out.println(f);
		
		int n1 = 10;	// int형인 10
		byte n2 = (byte)n1;
		System.out.println(n2);	// byte형 1byte 크기인 10
		
		//float형인 123.456을 int형 새로운 변수에 대입하여 출력해보세요
		float num1 = 123.456f;
		int num2 = (int)num1;	//답: 123
		System.out.println(num2);
		
		//2. 실수가 한개라도 포함된 연산에서는 실수값이 나온다.
		int kor = 60, eng = 13, math = 98;	//과목: 국어, 영어,수학
		int sub = 3;	//과목 수
		
		//실수형태인 평균 값이 나올 수 있도록 바꾸어보세요/
		System.out.println((kor + eng + math)/(double)sub);
		System.out.println((double)(kor + eng + math)/sub);
		
		//3. 정밀한 계산에서는 실수를 사용하지 않는다.
		System.out.println(1.3%0.2);	//나머지연산은 정수로만.
		
		
	}
}
