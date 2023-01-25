package array;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		//낚시게임
		//호수가 5x5의 호수가 있습니다.
		//호수에는 물고기가 3마리가 있습니다.
		//물고기 3마리는 랜덤으로 좌표에 위치해있습니다.
		//물고기 위치가 지정이 되면 낚시게임이 시작됩니다.
		//(단, 물고기는 같은 위치에 있으면 안됩니다.)
		//그리고 낚시꾼은 미끼가 달린 바늘을 던집니다.(캐스팅)
		//(단, 좌표의 범위를 넘어가지 않게 던져야합니다.)
		//좌표범위를 넘으면 다시 캐스팅해주세요. 하고 출력이 됩니다.
		//그리고 1.위 2.아래 3.왼쪽 4.오른쪽의 명령을 받아서 낚시 바늘 위치를 이동시킵니다.
		//(위 이동시 0보다 작아지면 이동X, 아래 이동시 4보다 크면 이동 X, 
		//왼쪽 이동시 0보다 작아지면 이동x, 오른쪽 이동시 4보다 크면 이동 x)
		//낚시바늘이 이동을 하다가 물고기가 있는 좌표에 같아지면 물고기를 잡게 됩니다.
		//그리고 물고기 3마리를 잠을때까지 낚시게임은 계속 진행됩니다.
		//캐스팅을 하였는데 거기에 물고기가 있으면 바로 잡히고 시작하게 돕니다.
		
		int[][]lake = new int[5][5];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;

		//물고기 위치 정하기.
		while(cnt< 3) {
			int num1 = (int)(Math.random() * 5);
			int num2 = (int)(Math.random() * 5);
			if(lake[num1][num2] == 0) {
				lake[num1][num2] = 1;
				cnt++;
			}
		}
		System.out.println("!!!물고기 잡기 게임을 시작합니다!!!");
		
		//캐스팅	
		int x;
		int y;
		while(true) {
			System.out.println("바늘의 위치를 선택해 주세요: ");
			System.out.print("x: ");
			x = sc.nextInt();
			System.out.print("y: ");
			y = sc.nextInt();
			if((x-1 >= 0 && x-1 <lake.length) && (y-1 >= 0 && y-1 < lake.length)) {
				if(lake[x-1][y-1] == 1) {
					System.out.println("물고기를 잡았습니다!");
					lake[x-1][y-1] = 3;
					x-=1;
					y-=1;
					cnt--;
				}
				else {
					lake[x-1][y-1] = 2;
				}
				break;
			}
			else {
				System.out.println( "선택 범위를 벗어났습니다. 바늘의 위치를 다시 선택해 주세요: ");
			}
		}

		//위치 이동
		//기본 값	0
		//물고기가 존재하는 자리 1
		//물고기가 없을 때 내가 지나간 자리	2
		//물고기를 잡은 자리 3
		
		while(true) {
			//출력
			for(int i = 0; i < lake.length; i++) {
				for(int j = 0; j < lake[i].length; j++) {
					//기본 값
					if(lake[i][j] == 0) {
						System.out.print("○\t");
					}
					//물고기가 있는 위치
					else if(lake[i][j] == 1) {
						System.out.print("☆\t");
					}
					//지나간 자리
					else if(lake[i][j] == 2) {
						System.out.print("●\t");
					}
					//물고기를 잡은 위치
					else if(lake[i][j] == 3) {
						System.out.print("★\t");
					}
				}
				System.out.println();
			}	
			System.out.println("이동 하실 위치를 선택하세요. 1.위 2.아래 3.왼쪽 4.오른쪽");
			int loc = sc.nextInt();
			switch(loc) {
			//위
			case 1:
				if(x > 0) {
					x--;
				}
				else {
					System.out.println("호수를 벗어났습니다. 위치를 다시 선택하세요.");
				}
				break;
			//아래
			case 2:
				if(x < lake.length - 1) {
					x++;
				}
				else {
					System.out.println("호수를 벗어났습니다. 위치를 다시 선택하세요.");
				}
				break;
			//왼쪽
			case 3:
				if(y > 0) {
					y--;
				}
				else {
					System.out.println("호수를 벗어났습니다. 위치를 다시 선택하세요.");
				}
				break;
			//오른쪽
			case 4:
				if(y < lake.length - 1) {
					y++;
				}
				else {
					System.out.println("호수를 벗어났습니다. 위치를 다시 선택하세요.");
				}
				break;
				
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 위치를 다시 선택하세요.");
				break;
			}
			
			if(lake[x][y] == 0) {
				lake[x][y] = 2;
			}
			else if(lake[x][y] == 1) {
				lake[x][y] = 3;
				cnt--;
				if(cnt == 0) {
					System.out.println("물고기를 다 잡았습니다!");
					break;
				}
				else {
					System.out.println("물고기를 잡았습니다!");
				}
			}
		}

	}

}
