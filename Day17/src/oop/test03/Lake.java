package oop.test03;

public class Lake {
	
	Fish[][] fishlake;
	// 호수가 5x5의 호수가 있습니다.
	
	Lake(){
		fishlake = new Fish[5][5];
	}
	// 호수에는 물고기가 3마리가 있습니다.
	// 물고기 3마리는 랜덤으로 좌표에 위치해있습니다.
	void selectFish() {
		for(int i = 0; i < 3; i++) {
			int x = (int)(Math.random() * 5);
			int y = (int)(Math.random() * 5);
			if(fishlake[x][y] == null) {
				fishlake[x][y] = new Fish();
				fishlake[x][y].loc = 1;
			}
			else {
				i--;
			}
		}
		System.out.println("물고기 위치 선정이 완료되었습니다.");
		System.out.println("게임을 시작합니다.");
	}


}
