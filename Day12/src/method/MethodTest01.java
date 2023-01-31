package method;

public class MethodTest01 {
	
	static int[] a() {
		int[]n = new int[3];
		return n;
	}
	
	static void b(int[] n) {
		n[0] = 10;
	}
	static void c(int[] n) {
		n[1] = 20;
	}
	
	public static void main(String[] args) {
		//Call by reference, Call by Value
		int[] c = new int[3];
		int[] b = a();
		b(c);
		c(b);
		System.out.println(b[0] + ", " + b[1] + " , "+b[2]);
	}

}
