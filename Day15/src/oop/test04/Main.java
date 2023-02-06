package oop.test04;

public class Main {
	
	public static void main(String[] args) {
		//문방구
		Shop sh = new Shop();
		//색연필
		sh.cp = new colorPen();
		String[] colorpen = sh.colorpen();
		//지우개
		sh.e = new eraser();
		String[] eraser = sh.eraser();
		//펜
		sh.p = new Pen();
		String[] pen = sh.pen();
		
		//A학생 -> 필통 - 색연필2, 지우개 1, 펜2
		Student A = new Student("A");
		A.pCase = new penCase();
		String[] pencilA = A.penCase();

		//B학생 -> 필통 - 색연필2, 지우개 1, 펜2
		Student B = new Student("B");
		B.pCase = new penCase();
		String[] pencilB = B.penCase();
		
		//sh.choosingCPen(A, B, sh);
		sh.choosingEraser(A, B, sh);
		sh.choosingPen(A, B, sh);
		
		A.Print();
		B.Print();
		//실질적인 객체는 없습니다.
		//색연필 : 주황색, 초록색, 노란색, 파란색
		//지우개 : 회색, 빨간색
		//펜 : 색연필 색깔과 동일
		//A학생 색연필을 색깔을 골라주세요 : 주황색 엔터
		//B학생 색연필 색깔을 골라주세요 : 주황색 엔터
		// - 팔렸습니다.
	}


}
