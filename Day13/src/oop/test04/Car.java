package oop.test04;

class Car {
	//자동차가 존재합니다. 자동차는 색깔과 제조사 최고 속력을 가지고 있고
	//운전하는 기능을 가지고 있습니다.
	String color;
	String mf;
	int speed;
	Car(){	//디폴트 생성자
		
	}
	
	Car(String c, String m, int s) {
		color = c;
		mf = m;
		speed = s;
		
		Print();
	}
	
	void Print() {
		System.out.println("자동차는 " + color +"색, " + mf + " 제조사, " + speed + "속력을 가지고 있고 "
				+ "운전하는 기능을 가지고 있습니다.");
	}
}

class Bike{
	//자전거가 존재합니다. 자전거는 제조사와 어떤 기능의 자전거인 종류와
	//타다의 기능을 가지고 있습니다.
	String mf;
	String type;
	
	Bike(){	//디폴트 생성자
		
	}
	
	Bike(String m, String t) {
		mf = m;
		type = t;
		
		Print();
	}
	
	void Print() {
		System.out.println("자전거는 " + mf + " 제조사, " + type + "의 기능을 가지고 있고 "
				+ "타다의 기능을 가지고 있습니다.");
	}
}

class Motorcycle{
	//오토바이가 존재합니다. 오토바이는 색깔과 제조사 최고 속력을 가지고 있습니다.
	//자동차와 똑같이 운전하는 기능을 가지고 있습니다.
	String color;
	String mf;
	int speed;
	
	Motorcycle(){	//디폴트 생성자
		
	}
	
	Motorcycle(String c, String m, int s) {
		color = c;
		mf = m;
		speed = s;
		
		Print();
	}
	
	void Print() {
		System.out.println("오토바이는 " + color +"색, " + mf + " 제조사, " + speed + "속력을 가지고 있고 "
				+ "자동차와 똑같이 운전하는 기능을 가지고 있습니다.");
	}
	
}

class Person1{
	//첫번째 사람
	Car c1;
	//1번차 : 검정, BMW, 240
	Car c2;
	//2번차 : 형광, 현대, 180
}

class Person2{
	//두번째 사람
	Bike b;
	//자전거 : 삼천리, 산악용
	Motorcycle m;
	//오토바이 : 대림, 빨간, 180
}