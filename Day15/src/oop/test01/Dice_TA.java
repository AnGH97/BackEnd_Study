package oop.test01;

public class Dice_TA {
	
	String name;
	int tot;
	
	Dice_TA(String _name){
		name = _name;
	}
	
	int randomDice() {
		return (int)(Math.random() * 6) + 1;
	}
	
	void randomTot() {
		tot += randomDice();
	}
	
	int getTot() {
		return tot;
	}
	
	void Print() {
		System.out.println(name + "주사위");
	}
}

