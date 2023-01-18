package Teacher_answer;

public class Test03 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {
				if(i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//    *
		//   ***
		//  *****
		// *******
		//*********
		int n = 1;
		for(int i = 0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<n;k++) {
				System.out.print("*");
			}
			System.out.println();
			n+=2;
		}
		for(int i=0;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i*2+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		//  *
		// ***
		//*****
		// ***
		//  *
		int cnt = 0;
		for(int i = 1 ; i<=5 ;i++) {
			if(i<=3) {
				cnt++;
			}
			else {
				cnt--;
			}
			
			for(int j=1;j<=3-cnt;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*cnt-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
