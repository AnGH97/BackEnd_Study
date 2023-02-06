package oop.test05;

import java.util.Scanner;

public class Main {

	static void buy(MunbanGu m, String color, Student a) {
		int i;
		for (i = 0; i < m.pn.length; i++) {
			if (m.pn[i] != null) {
				if (m.pn[i].color.equals(color)) {
					if (a.p.pn1 == null) {
						a.p.pn1 = m.pn[i]; // 객체이동
					} else {
						a.p.pn2 = m.pn[i];
					}
					m.pn[i] = null;
					System.out.println(a.name + " 학생이 샀습니다");
					break;
				}
			}
		}
		if (i == m.pn.length) {
			System.out.println("팔렸습니다");
		}
	}

	static void buyE(MunbanGu m, String color, Student a) {
		int i;
		for (i = 0; i < m.e.length; i++) {
			if (m.e[i] != null) {
				if (m.e[i].color.equals(color)) {
					if (a.p.e == null) {
						a.p.e = m.e[i]; // 객체이동
					}
					m.e[i] = null;
					System.out.println(a.name + " 학생이 샀습니다");
					break;
				}
			}
		}
		if (i == m.e.length) {
			System.out.println("팔렸습니다");
		}
	}

	static void buyP(MunbanGu m, String color, Student a) {
		int i;
		for (i = 0; i < m.p.length; i++) {
			if (m.p[i] != null) {
				if (m.p[i].color.equals(color)) {
					if (a.p.p1 == null) {
						a.p.p1 = m.p[i]; // 객체이동
					} else {
						a.p.p2 = m.p[i];
					}
					m.p[i] = null;
					System.out.println(a.name + " 학생이 샀습니다");
					break;
				}
			}
		}
		if (i == m.p.length) {
			System.out.println("팔렸습니다");
		}
	}

	public static void main(String[] args) {
		// A학생 -> 필통 - 색연필2, 지우개1, 펜2

		// B학생 -> 필통 - 색연필2, 지우개1, 펜2
		// 실질적인 객체는 없습니다

		// 색연필 : 주황색,초록색,노란색,파란색
		// 지우개 : 회색 , 빨간색
		// 펜 : 색연필 색깔과 동일
		// A학생 색연필을 색깔을 골라주세요 : 주황색엔터
		// B학생 색연필 색깔을 골라주세요 : 주황색엔터
		// - 팔렸습니다.
		Student a = new Student("A학생");
		Student b = new Student("B학생");
		Scanner sc = new Scanner(System.in);
		MunbanGu m = new MunbanGu();

		boolean checkA = true;
		boolean checkB = true;

		while (checkA != false && checkB != false) {
			checkA = a.p.checkColorPencil();

			if (checkA) {
				System.out.println(a.name + " 색연필 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
					buy(m, color, a);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}
			checkB = b.p.checkColorPencil();
			if (checkB) {
				System.out.println(b.name + " 색연필 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
					buy(m, color, b);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}

			if (checkA != false || checkB != false) {
				continue;
			}

			checkA = a.p.checkEraser();
			if (checkA) {
				System.out.println(a.name + " 지우개 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("회색") || color.equals("빨간색")) {
					buyE(m, color, a);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}
			checkB = b.p.checkEraser();
			if (checkB) {
				System.out.println(b.name + " 지우개 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("회색") || color.equals("빨간색")) {
					buyE(m, color, b);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}

			if (checkA != false || checkB != false) {
				continue;
			}

			checkA = a.p.checkPen();
			if (checkA) {
				System.out.println(a.name + " 연필 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
					buyP(m, color, a);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}
			checkB = b.p.checkPen();
			if (checkB) {
				System.out.println(b.name + " 연필 색깔을 골라주세요");
				String color = sc.next();
				if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
					buyP(m, color, b);
				} else {
					System.out.println("잘못된 입력입니다");
				}
			}
		}
	}

}