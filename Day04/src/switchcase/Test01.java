package switchcase;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		//q w e r
		Scanner sc = new Scanner(System.in);
		System.out.print("q, w, e, r 중에 입력 하세요! ");
		String s = sc.next();
		//사용자에게 문자열 q, w, e, r 중에 입력을 받고
		//q -> SKILL1
		//w -> SKILL2
		//e -> SKILL3
		//r -> SKILL4
//		switch(s) {
//		case "q": case "Q": //(case "q", "Q")도 가능(이번 버전부터)
//			System.out.println("SKILL1");
//			break;			
//		case "w": case "W":
//			System.out.println("SKILL2");
//			break;			
//		case "e": case "E":
//			System.out.println("SKILL3");
//			break;			
//		case "r": case "R":
//			System.out.println("SKILL4");
//			break;			
//		default:
//			System.out.println("잘못된 문자 입력 입니다.");
//		}
		
		char key = sc.next().charAt(0);	//첫번째 글자를 문자로 변형(0) 여기서 0은 index(첫번째 글자)
		//Character.toUpperCase(key);
		switch(Character.toLowerCase(key)) {		//모든 영문자를 소문자로 바꿔주는 것
		case 'q': //(case "q", "Q")도 가능(이번 버전부터)
		System.out.println("SKILL1");
		break;			
		case 'w':
			System.out.println("SKILL2");
			break;			
		case 'e':
			System.out.println("SKILL3");
			break;			
		case 'r':
			System.out.println("SKILL4");
			break;			
		default:
			System.out.println("잘못된 문자 입력 입니다.");	
		
		}
	}

}
