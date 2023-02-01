package oop.test01;

class Dog {
	String color;
	double weight;
	
	void Print() {
		color = select();
		System.out.println(color + ", " + weight + "kg의 강아지가 짖는다.");
	}
	
	String select() {
		String[] color = {"주황색", "흰색", "갈색", "검정색", "노란색"};
		int num = (int)(Math.random()* 5);
		return color[num];
	}


}

class Cat{
	String color;
	double weight;
	
	void Print() {
		color = select();
		System.out.println(color + ", " + weight + "kg의 고양이가 야옹한다.");
	}
	
	String select() {
		String[] color = {"주황색", "흰색", "갈색", "검정색", "노란색"};
		int num = (int)(Math.random()* 5);
		return color[num];
	}
	
}

class Bird{
	String color;
	double weight;
	
	void Print() {
		color = select();
		System.out.println(color + ", " + weight + "g의 새가 날아다닌다.");
	}
	
	String select() {
		String[] color = {"주황색", "흰색", "갈색", "검정색", "노란색"};
		int num = (int)(Math.random()* 5);
		return color[num];
	}
	
}
