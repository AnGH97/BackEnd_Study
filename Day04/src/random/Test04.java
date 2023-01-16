package random;

public class Test04 {
	
	public static void main(String[] args) {	
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 *       249      : 4
		 */
		int num1 = (int)(Math.random() * 101) + 150;
		int ten = num1 / 10;
		int one = ten % 10;
		System.out.println(num1 + " : " + one);
		
	}
	
}
