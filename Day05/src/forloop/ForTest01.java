package forloop;

public class ForTest01 {
	
	public static void main(String[] args) {
		//while 1 ~ 10까지 반복하여 출력
		int num1 = 1;
		while(true) {
			System.out.println(num1);
			if(num1 == 10) {
				break;
			}
			num1++;
		}
		System.out.println("=========================");
		
		//for
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("=========================");
		num1 = 1;
		for(;true;) {
			System.out.println(num1);
			if(num1 == 6) {
				break;
			}
			num1++;
		}
	}

}
