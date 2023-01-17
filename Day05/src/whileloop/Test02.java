package whileloop;

public class Test02 {
	
	public static void main(String[] args) {
		//[ 아이템 강화 시뮬레이션 ]
		//1. 아이템은 1번 강화하는데 현금 1000원이 필요하다.
		//2. 아이템은 처음에 레벨이 0이다.
		//3. 강화가 성공할 확률은 35%이고 성공하면 레벨이 1 증가
		//4. 강화가 실패할 확률은 30%이고 실패하면 레벨이 1 감소
		//	- 단, 아이템은 0레벨 밑으로 감소가 불가능하다.
		//5. 그 외의 경우에는 아무런 변화가 없다.
		
		//0레벨의 아이템을 10레벨로 만들기 위해 내가 쏟아부어야하는 현금을 계산하세요.
		int level = 0;
		int cnt = 0;
		int cash = 1000;
		
		//double po = (double)(Math.random()/100) + 0.01;
		//System.out.printf("%.4f", po);
		//확률을 0.0001~0.0100까지 사용하도록 하는 것
		
		while(true) {
			int power = (int)(Math.random() * 100) + 1;
			if (power >= 1 && power <= 35) {
				System.out.println("강화 성공!");
				level+=1;
			}
			else if(power > 35 && power <= 65 ) {
				if(level > 0) {
					System.out.println("강화 실패!");
					level-=1;
				}
			}
			else {
				System.out.println("변화 없음!");
			}
			cnt++;
			
			if(level == 10) {
				break;
			}
		}
		System.out.println("현금: " + (cash * cnt));
		
	}

}
