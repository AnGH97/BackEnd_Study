package oop.test03;

public class Main {
	public static void main(String[] args) {
		Array array = new Array(5);		//배열 5칸이 생긴다..
		array.add(1);
		array.add(2);
		array.add(3);
		array.remove();
		
		System.out.println(array.length);
		System.out.println(array.size());
		
		int[] arr = new int[10];
		
		arr[0] = 1;
		arr[1] = 2;
		
		Array a2 = new Array(arr);		//생성자 2번 배열을 넘겨줬을때
		
		Array a3 = new Array(array);	//생성자 3번 객체를 넘겨줬을때
		
		
	}
	


}
