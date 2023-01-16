package random;

public class RanTest02 {
	
	public static void main(String[] args) {
		
		//주사위 1 ~ 6을 뽑아서 짝수, 홀수인지 확인
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		if(dice % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	}

}
