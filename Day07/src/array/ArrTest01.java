package array;

public class ArrTest01 {

	public static void main(String[] args) {

		// 참조형변수와 일반변수의 구별법
		// 일반변수는 null초기화가 되지 않는다.

		// int a = null; - 기본형
		// int[] arr = null; - 참조형
		int[] arr = null;
		System.out.println(arr);

		arr = new int[] { 1, 2, 3, 4, 5 };
		int a = 0;
		System.out.println(arr[a]);
		System.out.println(arr[++a]);
		System.out.println(arr[++a]);
		System.out.println(arr[++a]);
		System.out.println(arr[++a]);

		System.out.println("=================");
		// 반복문으로 출력으로 변경
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i+ "] = " + arr[i] );
		}
	}

}
