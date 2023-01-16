package whileloop;

public class Test02 {
	
	public static void main(String[] args) {
		//문제1) 1 ~ 10까지 반복해 5~9 출력
		//정답1) 5, 6, 7, 8, 9
		System.out.println("문제 1");
		int num1 = 1;
		while(num1 <= 10) {
			if(num1 >=5 && num1 < 10) {
				System.out.println(num1);
			}
			num1++;
		}
		
		//문제2)10~1까지 반복해 6~3거꾸로 출력
		//정답2)6, 5, 4, 3
		System.out.println("문제 2");
		int num2 = 10;
		while(num2 > 0) {
			if(num2 >= 3 && num2 < 7) {
				System.out.println(num2);
			}
			num2--;
		}
		
		//문제3)1~10까지 반복해 짝수만 출력
		//문제3)2, 4, 6, 8, 10
		System.out.println("문제 3");
		int num3 = 1;
		while(num3 <= 10) {
			if(num3 % 2 == 0) {
				System.out.println(num3);
			}
			num3++;
		}
		
		//문제4)1~15까지의 합 출력
		//정답4)120
		System.out.println("문제 4");
		int num4 = 1;
		int sum = 0;
		while(num4 <= 15) {
			sum+=num4;
			num4++;
		}
		System.out.println("합계: " + sum);
		
		
	}

}
