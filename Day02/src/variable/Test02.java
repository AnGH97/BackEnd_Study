package variable;

public class Test02 {
	
	public static void main(String[] args) {		
		//1. 3의 배수이면서 짝수이면 true 출력
		int num = 12;
		int three = num%3;
		int even = num%2;		
		System.out.println(three == 0 && even == 0);
		
		//2. 3과목의 평균이 60점 이상이면, true
		//단, 어느 한 과목이라도 50점 미만이면 false
		int kor = 100;
		int eng = 87;
		int math = 47;
		int sum = (kor + eng + math)/3;		
		System.out.println(kor >= 50 && eng >= 50 && math >= 50 && sum >= 60);
				
		//3. 키가 200cm 이상이거나 몸무게가 200kg 이상이면 입장 가능(true)
		int hei = 188;
		int wei = 200;		
		System.out.println(hei >= 200 || wei >= 200);
	}

}
