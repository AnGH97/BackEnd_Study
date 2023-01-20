package array;

public class Test04 {

	public static void main(String[] args) {
		// 주사위를 1000번 던져서 각각의 눈금이 나온 횟수를 세보려합니다.
		// 아래와 같이 결과가 나올 수 있도록 배열을 이용한 적절한 코드를 구현
		int[] arr = new int[6];

		for (int i = 0; i < 1000; i++) {
			int dice = (int) (Math.random() * 6) + 1;
			arr[dice - 1] += 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + " 나온 횟수 : " + arr[i]);
		}

		// (예상결과)
		// 1 나온 횟수 : 170번
		// 2 나온 횟수 : 180번
		// 3 나온 횟수 : 205번
		// ..
		// 6나온 횟수 : 155번

	}

}
