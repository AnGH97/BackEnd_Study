package oop;

public class Mtest01 {
	
	public static void main(String[] args) {
		Pencil ct1 = new Pencil();
		ct1.color = "빨강색";
		ct1.Print();
		Pencil ct2 = new Pencil();
		ct2.color = "파랑색";
		ct2.Print();
		Pencil ct3 = new Pencil();
		ct3.color = "주황색";
		ct3.Print();
		Pencil ct4 = new Pencil();
		ct4.color = "노랑색";
		ct4.Print();
		
		System.out.println();
		Eraser e1 = new Eraser();
		e1.mf = "잠자리";
		e1.Print();
		Eraser e2 = new Eraser();
		e2.mf = "모닝글로리";
		e2.Print();
		
		System.out.println();
		Ballpen b1 = new Ballpen();	
		//b1.color = "검정색";
		b1.mf = "모나미";
		b1.print();
		Ballpen b2 = new Ballpen();
		//b2.color = "초록";
		b2.mf = "제트스트림";
		b2.print();
		Ballpen b3 = new Ballpen();
		//b3.color = "베이비 블루";
		b3.mf = "워터맨"; 
		b1.print();
		
		
	}

}
