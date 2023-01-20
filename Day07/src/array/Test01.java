package array;

public class Test01 {
	
	public static void main(String[] args) {
		//주사위를 10번 던진 결과를 저장하려고 합니다.
		//배열을 이용하여 저장을 구현하시고 아래 결과를 출력하세요
		int[] arr = new int[10];	//arr배열의 모든 요소는 0으로 초기화 되어 있다.
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int dice = (int)(Math.random() * 6) + 1;
			arr[i] = dice;
		}
		
		//[1] 전체 주사위 기록을 출력
		System.out.println("- 전체 주사위 기록 -");
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length-1) {
				System.out.print(i + "번째 숫자: " + arr[i] + ", ");
			}
			else {
				System.out.println(i + "번째 숫자: " + arr[i]);
			}
		}
		//[2] 짝수 주사위 기록 출력
		System.out.println("- 짝수 주사위 기록 출력 -");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(i + "번째 짝수:" + arr[i]);
			}
		}
		System.out.println();
		
		//[3] 주사위 값들의 합계
		System.out.println("- 주사위 값들의 합계 -");
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("합: " + sum);
		
	}

}
