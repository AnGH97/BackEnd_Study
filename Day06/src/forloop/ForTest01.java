package forloop;

public class ForTest01 {
	
	public static void main(String[] args) {
		
		//반복문 2개를 사용해서 직사각형의 데이터를 표현할 수 있다.
		// 1) 첫번째 반복문 (i)가 세로를 담당한다.
		// 2) 두번째 반복문 (j)가 가로를 담당한다.
		
		for(int i = 0; i< 4; i++) {	//외부 반복문	
			for(int j = 0; j < 3; j++) { //내부 반복문
				System.out.println("[i] = " + i + " [j] = " + j);
			}
		}
		
		//외부 반복문이 한번 돌때 내부 반복문은 조건식에 만족할때까지 반복이 돈다.
		// i = 0 j = 0 ~ 2	i = 1 j = 0 ~ 2	i = 2 j = 0 ~ 2 i = 3 j = 0 ~ 2
		//반복이 돌아간 총 횟수
		//외부 반복문 : 4번 	내부 반복문 : 외부 반복문 횟수 4 * 내부 반복문의 횟수 3 -> 12

	}

}
