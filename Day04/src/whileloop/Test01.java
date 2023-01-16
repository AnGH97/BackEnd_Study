package whileloop;

public class Test01 {
	
	public static void main(String[] args) {
		int i = 1;
		
		while(true) {
			System.out.println("i = " + i);
			if (i == 3) {
				break;		//반복문 강제 종료 ( 종료 지점 )
			}
			i++;
		}
		
		i = 1;		
		while(i <= 3) {
			System.out.println("i = " + i);
			i++;
		}
		
	}
}
