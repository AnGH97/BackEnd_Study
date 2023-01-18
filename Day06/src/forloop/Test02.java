package forloop;

public class Test02 {
	
	public static void main(String[] args) {
		
		//1. 
		// ***
		// ***
		// ***
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
		
		//2.
		// *****
		// *****
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
		//3.
		// *****
		//  *****
		//	 *****
		for(int i = 0; i < 3; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
		//4.
		// ***
		// ***
		// ***
		// ***
		// ***
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}

}
