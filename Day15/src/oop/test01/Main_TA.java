package oop.test01;

public class Main_TA {
	
	public static void main(String[] args) {
		Dice_TA[] di = new Dice_TA[2];
		
		di[0] = new Dice_TA("파란색");
		di[1] = new Dice_TA("빨간색");
		
		while(di[0].getTot() < 50 && di[1].getTot()<50) {
			di[0].randomTot();
			di[1].randomTot();
		}
		
		if(di[1].getTot() > di[0].getTot()) {
			di[1].Print();
		}
		else if(di[1].getTot() < di[0].getTot()) {
			di[0].Print();
		}
		else {
			System.out.println("두개의 값이 동일하다.");
		}
	}

	
}
