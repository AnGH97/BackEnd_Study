package input;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		//System.in - 표준 입력 객체
		
		//Scanner - 데이터를 읽어오기 위한 도구
		// - 파일, 문자열, 입력스트림, URL...
		
		//Scanner 만들기(c언어 == scanf, c++ == cin, python == input())
		Scanner sc = new Scanner(System.in);
		
		//.next() - 한 단어를 읽어오는 명령 - 다음 데이터를 문자열 형태로 읽어오는 명령(띄어쓰기 전까지만 읽어옴)		
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println("이름: " + name);
		
		//buffer
		// - 데이터의 단위, 데이터의 처리 속도, 형식등이 서로 다른 두 장치나 프로그램 사이에서 
		//	 데이터를 주고 받기 위한 목적으로 사용되는 임시 기억 장치
		// - 컴퓨터에서 키보드 입력시에는 데이터를 공백문자 기준으로 데이터를 구분
		//  -스페이스, 탭, 엔터..
		
		//JAVA에서 메소드명은 첫글자는 소문자, 달라지는 단어의 첫글자는 대문자
		
		//정수, 실수..
		//.next자료형();
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("나이: " + age + "살");
		
		//.nextLine();
		// - 공백문자기준으로 데이터를 읽어오는것이 아니라.. enter기준으로 데이터를 읽어온다.
		// - 무엇인가 입력받은 후에 nextLine을 사용하면 버퍼에 enter값이 남아있기 때문에 데이터를 입력받은걸로 인식한다.
		//그렇기 때문에 버퍼안에 엔터값을 제거해주어야한다..
		// - 제가 방식: .nextLine()을 한번 더 써서 버퍼를 비워준다.
		
		sc.nextLine();
		System.out.println("메모를 적어보세요..");
		String str = sc.nextLine();
		System.out.println("str = " + str);
	}

}
