package oop.test04;

import java.util.Scanner;

public class Shop {
	colorPen cp;
	eraser	e;
	Pen p;
	
	int[] colorpench;
	int[] eraserch;
	int[] pench;
	
	
	String[] colorpen() {
		cp.color = new String[] {"주황색", "초록색", "노란색", "파란색"};
		this.colorpench = new int[cp.color.length];
		return cp.color;
	}
	
	String selectColorpen(Student st) {
		System.out.print(st.name + "학생 색연필 색깔을 골라주세요 : ");
		Scanner sc = new Scanner(System.in);
		String cPen = sc.next();
		return cPen;
	}
	
	void choosingCPen(Student st1, Student st2, Shop s) {
		for(int i = 0; i < 2; i++) {
			String c1 = selectColorpen(st1);
			if(checkCpen(c1, s) == -1) {
				dupCpen(c1, st1, s);
			}
			else {
				st1.pCase.pcase[i] = c1;
			}
			String c2 = selectColorpen(st2);
			if(checkCpen(c2, s) == -1) {
				dupCpen(c2, st2, s);
			}
			else {
				st2.pCase.pcase[i] = c2;
			}
		}
		System.out.println("선택 완료!");
	} 

	int checkCpen(String c, Shop s) {
		for(int i = 0; i < s.colorpench.length; i++) {
			if(c.equals(s.cp.color[i]) == true) {
				if(s.colorpench[i] == 0) {
					System.out.println(c + " 색연필 구입이 성공적으로 완료되었습니다.");
					s.colorpench[i] = 1;
					return i;
				}
				else if(s.colorpench[i] == 1) {
					System.out.println("팔렸습니다.");
					return -1;
				}
			}
		}
		System.out.println("잘못된 색깔 입력입니다.");
		return -1;
	}
	
	String dupCpen(String c1, Student st1, Shop s) {
		while(true) {
			c1 = selectColorpen(st1);
			if(checkCpen(c1, s) != -1) {
				return c1;
			}
		}
	}

	String[] eraser() {
		e.color = new String[] {"회색", "빨간색"};
		this.eraserch = new int[e.color.length];
		return e.color;
	}
	
	String selectEraser(Student st) {
		System.out.print(st.name + "학생 지우개 색깔을 골라주세요 : ");
		Scanner sc = new Scanner(System.in);
		String er = sc.next();
		return er;
	}

	void choosingEraser(Student st1, Student st2, Shop s) {
		String e1 = selectEraser(st1);
		if(checkCpen(e1, s) == -1) {
			dupEr(e1, st1, s);
		}
		
		String e2 = selectEraser(st2);
		if(checkCpen(e2, s) == -1) {
			dupEr(e2, st2, s);
		}
		st1.pCase.pcase[2] = e1;
		st2.pCase.pcase[2] = e2;
		System.out.println("선택 완료!");
	} 

	int checkEraser(String c, Shop s) {
		for(int i = 0; i < s.eraser().length; i++) {
			if(c.equals(s.e.color[i]) == true) {
				if(s.eraserch[i] == 0) {
					System.out.println(c + " 지우개 구입이 성공적으로 완료되었습니다.");
					s.eraserch[i] = 1;
					return i;
				}
				else if(s.eraserch[i] == 1) {
					System.out.println("팔렸습니다.");
					return -1;
				}
			}
		}
		System.out.println("잘못된 색깔 입력입니다.");
		return -1;
	}
	
	String dupEr(String c1, Student st1, Shop s) {
		while(true) {
			c1 = selectEraser(st1);
			if(checkEraser(c1, s) != -1) {
				return c1;
			}
		}
	}
	
	String[] pen() {
		p.color = new String[] {"주황색", "초록색", "노란색", "파란색"};
		this.pench = new int[p.color.length];
		return p.color;
	}
	
	String selectPen(Student st) {
		System.out.print(st.name + "학생 연필 색깔을 골라주세요 : ");
		Scanner sc = new Scanner(System.in);
		String Pen = sc.next();
		return Pen;
	}
	
	void choosingPen(Student st1, Student st2, Shop s) {
		for(int i = 3; i < 5; i++) {
			String c1 = selectPen(st1);
			if(checkpen(c1, s) == -1) {
				duppen(c1, st1, s);
			}
			
			String c2 = selectPen(st2);
			if(checkpen(c2, s) == -1) {
				duppen(c2, st2, s);
			}
			st1.pCase.pcase[i] = c1;
			st2.pCase.pcase[i] = c2;
		}
		System.out.println("선택 완료!");
	} 

	int checkpen(String c, Shop s) {
		for(int i = 0; i < s.p.color.length; i++) {
			if(c.equals(s.p.color[i]) == true) {
				if(s.pench[i] == 0) {
					System.out.println(c + " 연필 구입이 성공적으로 완료되었습니다.");
					s.pench[i] = 1;
					return i;
				}
				else if(s.pench[i] == 1) {
					System.out.println("팔렸습니다.");
					return -1;
				}
			}
		}
		System.out.println("잘못된 색깔 입력입니다.");
		return -1;
	}
	
	String duppen(String c1, Student st1, Shop s) {
		while(true) {
			c1 = selectPen(st1);
			if(checkpen(c1, s) != -1) {
				return c1;
			}
		}
	}


}

class penCase{
	String[] pcase;
}

class colorPen{
	String[] color;
}

class eraser{
	String[] color;
}

class Pen{
	String[] color;
}

class Student{
	String name;
	penCase pCase;
	
	Student(String name){
		this.name = name;
	}
	
	String[] penCase() {
		pCase.pcase = new String[5];
		return pCase.pcase;
	}
	
	void Print() {
		System.out.print("필통 안에는 ");
		for(int i = 0; i < pCase.pcase.length; i++) {
			if(i == 0 || i == 1) {
				System.out.print(pCase.pcase[i] + " 색연필 ");
			}
			else if(i == 2) {
				System.out.print(pCase.pcase[i] + " 지우개 ");
			}
			else {
				System.out.print(pCase.pcase[i] + " 연필 ");
			}
		}
		System.out.println("이 있습니다.");
	}

}
