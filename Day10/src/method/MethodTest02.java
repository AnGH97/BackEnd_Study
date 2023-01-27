package method;

public class MethodTest02 {
	static int[] setScore() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		int[] d = new int[3];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		return d;
	}
	public static void main(String[] args) {
		int[] score = setScore();
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}

}
