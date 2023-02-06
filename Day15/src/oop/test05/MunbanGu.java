package oop.test05;

public class MunbanGu {
	
	Pencil[] pn = new Pencil[4];
	Eraser[] e = new Eraser[2];
	Pen[] p = new Pen[4];
	
	String[] color1 = new String[] {"주황색", "초록색", "노란색", "파란색"};
	String[] color2 = new String[] {"회색", "빨간색"};
	
	
	MunbanGu(){
		for(int i = 0; i < pn.length; i++) {
			pn[i] = new Pencil(color1[i]);
		}
		for(int i = 0; i < e.length; i++) {
			e[i] = new Eraser(color2[i]);
		}
		for(int i = 0; i < p.length; i++) {
			p[i] = new Pen(color1[i]);
		}
	}

}
