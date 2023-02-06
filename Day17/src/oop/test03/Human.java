package oop.test03;

import java.util.Scanner;

public class Human {
	
	Fish[] fish;
	int x, y;
	
	Human(){
		fish = new Fish[3];
	}
	// 그리고 낚시꾼은 미끼가 달린 바늘을 던집니다.(캐스팅)	
	void casting(Lake lake) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("바늘의 위치를 입력하세요");
			System.out.print("행 : ");
			x = sc.nextInt();
			System.out.print("열 : ");
			y = sc.nextInt();
			if(x > 5 || x < 1 || y > 5 || y < 1) {
				System.out.println("호수의 범위를 벗어났습니다. 캐스팅을 다시 해주세요.");
				continue;
			}
			x-=1;
			y-=1;
			if(lake.fishlake[x][y] == null) {
				lake.fishlake[x][y] = new Fish();
				lake.fishlake[x][y].loc = 2;
				System.out.println("캐스팅을 완료하였습니다.");
				break;
			}
			else if(lake.fishlake[x][y] != null) {
				if(lake.fishlake[x][y].loc == 1) {
					lake.fishlake[x][y].loc = 3;
					System.out.println("물고기를 잡았습니다.");
					System.out.println("캐스팅을 완료하였습니다.");
					break;
				}
			}
		}
		System.out.println(lake.fishlake[x][y]);
	}
	
	// 그리고 1.위 2.아래 3.왼쪽 4.오른쪽의 명령을 받아서 낚시바늘 위치를 이동시킵니다.
	void moving(Lake lake) {
		while(true) {
			int cnt = 0;
			Print(lake);
			Scanner sc = new Scanner(System.in);
			System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				movingUp(lake);
				break;
			case 2:
				movingDown(lake);
				break;
			case 3:
				movingLeft(lake);
				break;
			case 4:
				movingRight(lake);
				break;
			default:
				System.out.println("잘못된 입력입니다!");
				break;
			}
			for(int i = 0; i < fish.length; i++) {
				if(fish[i] != null) {
					cnt++;
				}
			}
			if(cnt == 3) {
				System.out.println("물고기를 모두 잡았습니다.");
				System.out.println("게임을 종료합니다!");
				return;
			}
		}
	}
	
	void movingUp(Lake lake) {
		if(this.x - 1 < 0) {
			System.out.println("범위를 벗어나 이동할 수 없습니다.");
		}
		else {
			this.x -= 1;
			if(lake.fishlake[this.x][this.y] == null) {
				lake.fishlake[this.x][this.y] = new Fish();
				lake.fishlake[this.x][this.y].loc = 2;
			}
			else if(lake.fishlake[this.x][this.y] != null) {
				if(lake.fishlake[this.x][this.y].loc == 1) {
					lake.fishlake[this.x][this.y].loc = 3;
					System.out.println("물고기를 잡았습니다.");
					for(int i = 0; i < fish.length; i++) {
						if(fish[i] == null) {
							fish[i] = lake.fishlake[this.x][this.y];
							break;
						}
					}
				}
			}
		}
	}
	
	void movingDown(Lake lake) {
		if(this.x+1 > 4) {
			System.out.println("범위를 벗어나 이동할 수 없습니다.");
		}
		else {
			this.x += 1;
			if(lake.fishlake[this.x][this.y] == null) {
				lake.fishlake[this.x][this.y] = new Fish();
				lake.fishlake[this.x][this.y].loc = 2;
			}
			else if(lake.fishlake[this.x][this.y] != null) {
				if(lake.fishlake[this.x][this.y].loc == 1) {
					lake.fishlake[this.x][this.y].loc = 3;
					System.out.println("물고기를 잡았습니다.");
					for(int i = 0; i < fish.length; i++) {
						if(fish[i] == null) {
							fish[i] = lake.fishlake[this.x][this.y];
							break;
						}
					}
				}
			}
		}
	}
	
	void movingLeft(Lake lake) {
		if(this.y-1 < 0) {
			System.out.println("범위를 벗어나 이동할 수 없습니다.");
		}
		else {
			this.y-=1;
			if(lake.fishlake[this.x][this.y] == null) {
				lake.fishlake[this.x][this.y] = new Fish();
				lake.fishlake[this.x][this.y].loc = 2;
			}
			else if(lake.fishlake[this.x][this.y] != null) {
				if(lake.fishlake[this.x][this.y].loc == 1) {
					lake.fishlake[this.x][this.y].loc = 3;
					System.out.println("물고기를 잡았습니다.");
					for(int i = 0; i < fish.length; i++) {
						if(fish[i] == null) {
							fish[i] = lake.fishlake[this.x][this.y];
							break;
						}
					}
				}
			}
		}
	}
	
	void movingRight(Lake lake) {
		if(this.y+1 > 4) {
			System.out.println("범위를 벗어나 이동할 수 없습니다.");
		}
		else {
			this.y+=1;
			if(lake.fishlake[this.x][this.y] == null) {
				lake.fishlake[this.x][this.y] = new Fish();
				lake.fishlake[this.x][this.y].loc = 2;
			}
			else if(lake.fishlake[this.x][this.y] != null) {
				if(lake.fishlake[this.x][this.y].loc == 1) {
					lake.fishlake[this.x][this.y].loc = 3;
					System.out.println("물고기를 잡았습니다.");
					for(int i = 0; i < fish.length; i++) {
						if(fish[i] == null) {
							fish[i] = lake.fishlake[this.x][this.y];
							break;
						}
					}
				}
			}
		}
	}
	
	void Print(Lake lake) {
		for(int i = 0; i < lake.fishlake.length; i++) {
			for(int j = 0; j < lake.fishlake[i].length; j++) {
				if(lake.fishlake[i][j] == null) {
					System.out.print("○\t");
				}
				else if(lake.fishlake[i][j] != null) {
					if(lake.fishlake[i][j].loc == 1) {
						System.out.print("☆\t");
					}
					else if(lake.fishlake[i][j].loc == 2) {
						System.out.print("●\t");
					}
					else if(lake.fishlake[i][j].loc == 3) {
						System.out.print("★\t");
					}
				}
			}
			System.out.println();
		}
	}

	// 낚시꾼 물고기를 낚시꾼에게 주는 (null 또는 Fish 객체 리턴이 되어야 한다.)

	
	 
	 
}
