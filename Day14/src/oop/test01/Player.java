package oop.test01;

public class Player {
	
	String id;
	int level, hp, mp;
	
	Player(){
		
	}
	
	Player(String n){
		id =  n;
		level = 1;
		hp = 5;
		mp = 20;
	}
	
	void checkLevel(int l) {
		if(l < level) {
			System.out.println("레벨은 감소할 수 없습니다.");
			return;
		}
		else {
			setLevel(l);
			Print();
		}
	}
	
	void setLevel(int l) {
		hp += (l - level) * 5;
		mp += (l - level) * 10;
		level = l;
	}
	
	
	void Print() {
		System.out.println("ID: " + id + ", 레벨: " + level + ", 공격력: " + hp + ", 체력: " + mp);
	}
	
	
	//아래 항목을 만드시고 정보 출력
	//[1]	공유		레벨 20으로 변경 후 정보 출력
	//[2]	아이유	레벨 15로 변경 후 정보 출력
	//[3]	유인나	레벨 30으로 변경후 정보 출력
	
	//1. 캐릭터 생성시 레벨은 1, 공격력 5, 체력 20
	//2. 레벨이 증가할 경우 공격력 3, 체력은 10씩 증가
	//단, 예) 20레벨로 바꿨는데 -> 15 레벨 x, 레벨 감소 x

}
