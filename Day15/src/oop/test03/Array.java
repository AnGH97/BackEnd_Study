package oop.test03;

//Array라는 클래스를 구현하여 데이터가 저장될 수 있도록 구현
public class Array {
	//구성 항목			배열, length( 배열 데이터의 개수 ), size( 배열의 총 크기 )
	int[] data;
	int length, size;
	
	Array(int size){
		this.size = size;
		data = new int[this.size];
	}
	
	Array(int[] arr) {
		data = new int[arr.length];
		size = arr.length;
		for(; arr[length] !=0; length++) {
			this.data[length] = arr[length];
		}
	}
	
	Array(Array arr){
		this.data = new int[arr.size];
		this.size = arr.size;
		this.length = arr.length;
		
		for(int i = 0; i < length; i++) {
			this.data[i] = arr.data[i];
		}
	}
	
	void add(int v) {
		if(length == size) {
			return;
		}
		else {
			for(int i = 0; i < size-1; i++) {
				if(data[i] == 0) {
					data[i] = v;
					length+=1;
					return;
				}
			}
		}
	}
	
	int get(int i) {
		if(i > length || i <= 0) {
			System.out.println("인덱스 범위를 벗어났습니다.");
			return -1;
		}
		
		int n = data[i-1]; 
		return n;
	}
	
	void remove() {
		for(int i = size - 1; i >= 0; i--) {
			if(data[i] != 0) {
				data[i] = 0;
				length-=1;
				return;
			}
		}
	}
	
	int size() {
		return length;
	}
	
	void add(int i, int data) {
		if(length == size) {
			System.out.println("배열이 꽉 차있습니다.");
			return;
		}
		else if(i > size || i <= 0) {
			System.out.println("인덱스 범위를 벗어났습니다.");
		}
		else {
			
		}
	}
	
	void disp() {
		System.out.println("데이터의 개수 : " + size() + " 총 크기 : " + size);
	}
	
	//기능				add(v)
	//				- v라는 데이터를 마지막 칸에 추가
	//				- 최대 10개까지만 ..
	//					get(i)
	//				- 특정 위치의 데이터를 추출
	//				- i 번째 데이터를 번째
	//					remove()
	//				- 마지막 데이터를 삭제
	//				- 데이터 없으면 실행 중지
	//					size()
	//				- 현재 데이터의 개수를 반환
	
	//					add(int i, int data)
	//				- i라는 인덱스와 data인 데이터를 받아와서
	//				  그 인덱스에 그 값을 추가
	//				-그 인덱스에 값이 추가되면 추가된 자리부터 한칸씩 데이터가 뒤로 밀린다.
	
	//					disp()
	//				- 배열안에 있는 값, 데이터 개수, 총 크기

}
