package method;

import java.util.Scanner;

public class Test01 {
	
	static int[][] fish() {
		int[][] lake = new int[5][5];
		int cnt = 0;
		while(true) {
			int num1 = (int)(Math.random()*5);
			int num2 = (int)(Math.random()*5);
			if(lake[num1][num2] == 0) {
				lake[num1][num2] = 1;
				cnt++;
			}
			if(cnt == 3) {
				break;
			}
		}
		System.out.println("게임을 시작합니다.");
		return lake;
	}
	
	static int[] castingInput(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		int[] loc = new int[2];
		System.out.println("미끼의 위치를 입력하세요!");
		System.out.print("행 : ");
		loc[0] = sc.nextInt();
		System.out.print("열 : ");
		loc[1] = sc.nextInt();
		
		return loc;
	}
	
	static boolean castingRange(int n1, int n2) {
		boolean ch = true;
		if(n1 > 5 || n1 < 1 || n2 > 5 || n2 < 1) {
			ch = false;
		}
		return ch;
	}
	
	static int[] castingEnd(int arr[][]) {
		int[] l;
		while(true) {
			l = castingInput(arr);
			boolean c = castingRange(l[0], l[1]);
			if(c == false) {
				System.out.println("호수의 범위를 벗어났습니다.");
			}
			else if(c == true) {
				l[0]-=1;
				l[1]-=1;
				break;
			}
		}
		return l;
	}
	
	static boolean fishCheck(int arr[][], int l[]) {
		boolean ch = true;
		if(arr[l[0]][l[1]] == 1) {
			ch = false;
		}
		return ch;
	}
	
	static void lakePrint(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					System.out.print("○\t");
				}
				else if(arr[i][j] == 1) {
					System.out.print("☆\t");
				}
				else if(arr[i][j] == 2) {
					System.out.print("●\t");
				}
				else if(arr[i][j] == 3) {
					System.out.print("★\t");
				}
			}
			System.out.println();
		}
	}
	
	static int movingInput() {
		System.out.println("1.위 2.아래 3.왼쪽 4.오른쪽");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	static void movingRange(int[]l,  int n) {
		switch(n) {
		case 1:
			if(l[0] - 1 < 0) {
				System.out.println("호수의 범위를 벗어났습니다.");
			}
			else {
				l[0]--;
			}
			break;
		case 2:
			if(l[0] + 1 >= 5){
				System.out.println("호수의 범위를 벗어났습니다.");
			}
			else {
				l[0]++;
			}
			break;
		case 3:
			if(l[1] - 1 <0) {
				System.out.println("호수의 범위를 벗어났습니다.");
			}
			else {
				l[1]--;
			}
			break;
		case 4:
			if(l[1] + 1 >=5) {
				System.out.println("호수의 범위를 벗어났습니다.");
			}
			else {
				l[1]++;
			}
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}	
	}
	
	static void movingLocation(int arr[][], int l[]) {
		if(arr[l[0]][l[1]] == 1) {
			arr[l[0]][l[1]] = 3;
			System.out.println("물고기를 잡았습니다.");
		}
		else if(arr[l[0]][l[1]] == 0) {
			arr[l[0]][l[1]] = 2;
		}

	}
	
	static void startGame() {
		int[][] lake = new int[5][5];
		int[] loc = new int[2];
		int cnt = 0;
		lake = fish();
		loc = castingEnd(lake);
		while(true) {
			boolean ch = fishCheck(lake, loc);	
			if(ch == false) {
				cnt++;
			}
			movingLocation(lake, loc);
			lakePrint(lake);
			if(cnt == 3) {
				System.out.println("물고기를 모두 잡았습니다. 시스템을 종료합니다.");
				return;
			}
			int n = movingInput();
			movingRange(loc, n);
		}	
	}
	
	public static void main(String[] args) {
		startGame();
		//낚시게임을 함수화로 구현을 하세요.
		//함수화 진행시 함수 하나의 기능만 존재하도록 구현을 해주세요
		//메인 함수는 명령어가 무조건 하나여야합니다.
		
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
	}

}
