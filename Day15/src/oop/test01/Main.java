package oop.test01;

public class Main {
	
	public static void main(String[] args) {
		//파란 주사위와 빨간주사위 중에 먼저 50이 되는 주사위를 출력
		
		//랜덤으로 나오는 값을 계속 더합니다.
		//두 주사위 중 먼저 50 이상이 되는 주사위를 출력하시면 됩니다.
		
		Dice[] d = new Dice[2];
		
		d[0] = new Dice("파란 주사위");
		d[1] = new Dice("빨간 주사위");
		
		while(true) {
			d[0].randomNum();
			d[1].randomNum();
			
			d[0].getSum();
			d[1].getSum();
			
			System.out.println(d[0].sum + "\t" + d[1].sum);

			if(d[0].sum >= 50) {
				d[0].Print();
				break;
			}
			else if(d[1].sum >= 50) {
				d[1].Print();
				break;
			}
			
			
		}
	}

}
