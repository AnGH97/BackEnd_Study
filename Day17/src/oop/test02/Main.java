package oop.test02;

public class Main {
	public static void main(String[] args) {
		
		//업다운 31
		//컴퓨터가 랜덤으로 1 ~ 31까지의 수를 받습니다.
		Computer c = new Computer(); 
		//유저가 1 ~ 31까지 입력을 해야합니다. - > 1 ~ 31이 아니면 잘못된 입력입니다.
		User u = new User();
		//출력 이후 다시 입력받습니다.
		while(true) {
			int n = u.Input();
			
			if(n > 31 || n < 1) {
				c.Error();
			}
			else if(n == c.num) {
				c.Correct();
				break;
			}
			else if(n > c.num) {
				c.Down();
			}
			else if(n < c.num) {
				c.Up();
			}

		}
		
		//컴퓨터 12
		
		//유저 10 -> 컴퓨터 업
		//유저 20 -> 컴퓨터 다운
		
		//컴퓨터의 랜덤 숫자를 맞추면 게임이 끝납니다.
		
		
	}

}
