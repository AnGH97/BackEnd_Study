package random;

public class Test01 {

	public static void main(String[] args) {
		//주사위 2개 던지는 코드를 구현하시고
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		//두개의 주사위 합계에 따라 아래와 같이 코드를 구현
		int sum = dice1 + dice2;
		//1. 합계가 짝수일 경우 짝! 출력
		//2. 합계가 홀수일 경우 홀! 출력
		//3. 두 사위가 같은 값일 경우 더블! 출력	
		System.out.println("dice1: " + dice1 + ", dice2: " + dice2);
		
		/*if(dice1 == dice2) {
			System.out.println("더블!");
		}
		else if(sum % 2 == 0) {
			System.out.println("짝!");
		}
		else {
			System.out.println("홀!");
		}*/
		
		if(sum % 2 == 0) {
			if(dice1 == dice2) {
				System.out.println("더블!");
			}
			else {
				System.out.println("짝!");
			}
		}
		else {
			System.out.println("홀!");
		}
		

	}
	
}
