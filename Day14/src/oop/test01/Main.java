package oop.test01;

public class Main {
	
	public static void main(String[] args) {
		Player p1 = new Player("공유");
		p1.checkLevel(20);
		System.out.println();
		Player p2 = new Player("아이유");
		p2.checkLevel(20);
		p2.checkLevel(15);
		System.out.println();
		Player p3 = new Player("유인나");
		p3.checkLevel(20);
	}

}
