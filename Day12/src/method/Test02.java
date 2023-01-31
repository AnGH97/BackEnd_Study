package method;

public class Test02 {
	
	static int function(int n1) {
		if(n1 == 1) {
			return 1;
		}
		else {
			return n1 + function(n1-1);
		}
	}
	
	public static void main(String[] args) {
		//제가 원하는 숫자까지의 전체 합을 재귀함수로 나타내보세요.
		System.out.println(function(5));
		
//		static int function(5) {
//			if(n1 == 1) {
//				return 1;
//			}
//			else {
//				return 5  + 10	
//		static int function(4) {
//			if(n1 == 1) {
//				return 1;
//			}
//			else {
//				return 4 	+ 6
//		static int function(3) {
//			if(n1 == 1) {
//				return 1;
//			}
//			else {
//				return 3 + 3	
//		static int function(2) {
//			if(n1 == 1) {
//				return 1;
//			}
//			else {
//				return 2 + 1	
//		static int function(1) {
//			if(n1 == 1) {
//				return 1;
//			}
//			else {
//				return n1 + function(n1-1);
//			}
//		}
//			}
//		}
//		}
//			}
//		}
//			}
//		}		
	}

}
