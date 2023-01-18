package forloop;

public class Test03 {
	
	public static void main(String[] args) {
		  //*
	      //**
	      //***
	      //****
	      //*****
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(cnt == j) {
					for(int k = 0; k <= j; k++) {
						System.out.print("*");
					}
				}
			}
			cnt++;
			System.out.println();
		}
	      
	      //    *
	      //   **
	      //  ***
	      // ****
	      //*****
		
		cnt = 4;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(cnt == j) {
					for(int k = j; k < 5; k++) {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			cnt--;
			System.out.println();
		}
	      //    *
	      //   ***
	      //  *****
	      // *******
	      //*********
		cnt = 9/2;
		int back = 1;
		int front = 1;	
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= 9; j++) {
				if(i == 0) {
					if(j == cnt) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}	
				}
				else {
					if(j == (cnt-back + 1)) {
						for(int k = j+1; k <= cnt+front; k++) {
							System.out.print("*");
						}
					}
					else if(j <= cnt-back) {
						System.out.print(" ");
					}
					
				}
			}
			back++;
			front++;
			System.out.println();
		}
		
	   
	      //  *
	      // ***
	      //*****
	      // ***
	      //  *
		int n = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j-- ) {
				System.out.print(" ");
			}
			for(int k = 0; k < n; k++) {
				System.out.print("*");
			}
			n+=2;
			System.out.println();
		}
		n = 3;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < n; k++) {
				System.out.print("*");
			}
			n-=2;
			System.out.println();
		}

	}

}
