package method;
//call by reference 배우기 전
import java.util.Scanner;

public class Test05 {
	//아무것도 없는 곳은 0, 생선 위치 1, 내가 다녀간 위치 2, 물고기를 잡은 위치 3
	//선택은 1, 2, 3, 4, 5로 가능
	
	static int[] fishes() {
		int[] fish = new int[2];
		fish[0] = (int)(Math.random() * 5);
		fish[1] = (int)(Math.random() * 5);
		return fish;
	}
	
	static boolean fishloc(int l[], int arr[][]) {
		boolean ch = true;
		if(arr[l[0]][l[1]] == 0) {
			ch = false;
		}
		return ch;
	}
	
	static int[][] fishingStart(int arr[][]) {
		int cnt = 0;
		boolean ch;
		int[] l;
		while(true) {
			l = fishes();
			ch = fishloc(l, arr);
			if(ch == false) {
				arr[l[0]][l[1]] = 1;
				cnt++;
			}
			else {
				continue;
			}
			if(cnt == 3) {
				break;
			}
		}
		System.out.println("!!낚시 게임을 시작합니다!!");
		return arr;
	}
	
	static int[] casting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("미끼의 위치를 선택하세요!");
		int loc[] = new int[2];
		System.out.print("행 : ");
		int r = sc.nextInt();
		System.out.print("열 : ");
		int c = sc.nextInt();
		loc[0] = r-1;
		loc[1] = c-1;
		
		return loc;
	}
	
	static boolean castingRange(int l[]) {
		boolean ch = true;
		if(l[0] >= 5 || l[0] < 0 || l[1] >= 5 || l[1] < 0) {
			ch = false;
		}
		return ch;
	}
	
	static int[] castingOk() {
		int[] loc;
		while(true) {
			loc = casting();
			boolean ch = castingRange(loc);
			if(ch == false) {
				System.out.println("위치를 다시 선택하세요.");
				continue;
			}
			else {
				System.out.println("!!캐스팅 완료!!");
				break;
			}
		}
		return loc;
	}
	
	static int[][] castingloc(int l[], int arr[][]){
		if(arr[l[0]][l[1]] == 0) {
			arr[l[0]][l[1]] = 2;
		}
		else if(arr[l[0]][l[1]] == 1) {
			arr[l[0]][l[1]] = 3;
			System.out.println("물고기를 잡았습니다!");
		}
		return arr;
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
	
	static int select() {
		System.out.println("1. 위, 2. 아래, 3. 왼쪽, 4. 오른쪽");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	static boolean movingRange(int[]l,  int n) {
		boolean ch = true;
		switch(n) {
		case 1:
			if(l[0] - 1 < 0) {
				ch = false;
			}
			break;
		case 2:
			if(l[0] + 1 >= 5){
				ch = false;
			}
			break;
		case 3:
			if(l[1] - 1 <0) {
				ch = false;
			}
			break;
		case 4:
			if(l[1] + 1 >=5) {
				ch = false;
			}
			break;
		default:
			ch = false;
			System.out.println("잘못입력하셨습니다.");
			break;
		}	
		return ch;
	}
	
	static int[] movingUp(int[] l, int n) {
		l[0]--;
		return l;
	}
	
	static int[] movingDown(int[] l, int n) {
		l[0]++;
		return l;
	}
	
	static int[] movingLeft(int[] l, int n) {
		l[1]--;
		return l;
	}
	
	static int[] movingRight(int[] l, int n) {
		l[1]++;
		return l;
	}
	
	static int[][] movinglocation(int[] l, int[][] arr){
		if(arr[l[0]][l[1]] == 0) {
			arr[l[0]][l[1]] = 2;
		}
		else if(arr[l[0]][l[1]] == 1) {
			arr[l[0]][l[1]] = 3;
		}
		
		return arr;
	}
	
	static void gameStart() {
		int[][] lake = new int[5][5];
		int[] loc = new int[2];
		int cnt = 0;
		
		lake = fishingStart(lake);
		loc = castingOk();
		lake = castingloc(loc, lake);
		while(true) {
			 boolean ch = true;
			 lakePrint(lake);
			 int n = select();
			 ch = movingRange(loc, n);
			 if(ch == true) {
				 switch(n) {
				 case 1:
					 loc = movingUp(loc, n);
					 break;
				 case 2:
					 loc = movingDown(loc, n);
					 break;
				 case 3:
					 loc = movingLeft(loc, n);
					 break;
				 case 4:
					 loc = movingRight(loc, n);
					 break;
				 default:
					 break;				 
				 }
			 } 
			 else {
				 System.out.println("호수의 범위를 벗어나 이동할 수 없습니다.");
				 continue;
			 }
			 if(lake[loc[0]][loc[1]] == 1) {
				 System.out.println("물고기를 잡았습니다.");
				 cnt++;
			 }
			 lake = movinglocation(loc, lake);
			 if(cnt == 3) {
				 System.out.println("물고기를 모두 잡았습니다. 게임을 종료합니다.");
				 return;
			 }
		 }
	}
	
	public static void main(String[] args) {
		gameStart(); 
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
