package oop.test01;

public class Dice {
	int num, sum;
	String name;
	
	Dice(){
		
	}
	
	Dice(String _name){
		name = _name;
	}

	void randomNum() {
		int n = (int)(Math.random() * 6) + 1;
		num = n;
	}

	void getSum() {
		sum+=num;
	}
	
	void Print() {
		System.out.println(name);
	}
	
}
