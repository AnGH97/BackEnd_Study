package array;

public class Test05 {
	
	public static void main(String[] args) {
		//배열의 크기가 5인 배열이 있습니다.
		//랜덤으로 1 ~ 9까지 값을 각 배열에 저장합니다. 단 같은 값이 들어갈 수 없습니다.
		//각각 다른 값으로 배열 5개의 값을 랜덤으로 채워주세요.
		//이렇게 랜덤값을 채워 준 뒤에 값을 오름차순으로 정렬해주세요.
		
		//초기 들어간 값과 정렬된 값을 출력이 되도록 구현해주세요.
		int[] arr = new int[5];
		int n = 0;
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 9) + 1;
			if (i != 0) {
				while(true) {
					if(arr[j] == num) {
						num = (int)(Math.random() * 9) + 1;
						j = 0;
					}
					else if(j == i-1) {
						if(arr[j] != num) {
							arr[i] = num;
							j = 0;
							break;
						}
					}
					else {
						j++;
					}
				}
			}
			else {
				arr[i] = num;
			}
		}
		
		System.out.println("- 정렬 전 -");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 수: " + arr[i]);
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int k = i+1; k < arr.length; k++) {
				if(arr[i] > arr[k]) {
					n = arr[i];
					arr[i] = arr[k];
					arr[k] = n;
				}
			}
		}
		
		System.out.println("- 오름차순 정렬 후 -");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 수: " + arr[i]);
		}
		
		
		
	}

}
