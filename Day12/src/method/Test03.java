package method;

public class Test03 {
	
	static void topPrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static void hanoiTop(int[] A, int[]B, int[]C) {
		
	}
	
	static void start(int[] A) {
		int a = 1;
		for(int i =0; i < A.length; i++) {
			A[i] = a++;
		}
	}
	public static void main(String[] args) {
		//하노이탑
		//0->2로 넘기기
		int A[] = new int[3];
		int B[] = new int[3];
		int C[] = new int[3];
		start(A);
		
		
		//1. 
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[2][2] = hanoi[0][0];
		hanoi[0][0] = 0;
		//2. 
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[2][1] = hanoi[1][0];
		hanoi[1][0] = 0;
		//3. 
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[1][1] = hanoi[2][2];
		hanoi[2][2] = 0;
		//4.
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[2][2] = hanoi[2][0];
		hanoi[2][0] = 0;
		//5.
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[2][0] = hanoi[1][1];
		hanoi[1][1] = 0;
		//6.
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[1][2] = hanoi[2][1];
		hanoi[2][1] = 0;
		//7.
		topPrint(hanoi);
		System.out.println("=====================");
		hanoi[0][2] = hanoi[2][0];
		hanoi[2][0] = 0;		
		topPrint(hanoi);
		System.out.println("=====================");
		
		
	}

}
