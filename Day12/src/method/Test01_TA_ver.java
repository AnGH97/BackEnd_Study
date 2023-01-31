package method;

import java.util.Scanner;

public class Test01_TA_ver {
   static void start() {
      Scanner sc = new Scanner(System.in);
      int[][] hosu = new int[5][5];// 1. 5x5 호수
      int fishcount = 0;
      int[] fishHuman = new int[2];

      // 2.랜덤을 통해서 호수에 값을 세팅
      fishcount = randomHosu(hosu, fishcount);
      // 캐스팅
      casting(fishHuman, sc);
      // 물고기 확인
      fishcount-=fishCheck(hosu, fishHuman);

      // 출력
      allPrint(hosu, fishHuman);
      
      while(fishcount > 0) {
         // 위, 아래, 왼쪽,오른쪽
         move(inputNews(sc),fishHuman);
         // 물고기 체크
         fishcount-=fishCheck(hosu, fishHuman);

         // 출력
         allPrint(hosu, fishHuman);
      }
      System.out.println("물고기 게임을 종료합니다");
   }

   static int randomHosu(int[][] hosu, int fishcount) {
      while (fishcount < 3) {
         int h = (int) (Math.random() * 5);
         int y = (int) (Math.random() * 5);
         if (hosu[h][y] == 0) {
            hosu[h][y] = 1;
            fishcount++;
         }
      }
      return fishcount;
   }

   static void casting(int[] fishHuman, Scanner sc) {
      while (true) {
         System.out.print("행 입력 : ");
         fishHuman[0] = sc.nextInt();
         System.out.print("열 입력 : ");
         fishHuman[1] = sc.nextInt();
         if (fishHuman[0] > -1 && fishHuman[0] < 5 && fishHuman[1] > -1 && fishHuman[1] < 5) {
            break;
         } else {
            System.out.println("잘못된 입력입니다.");
         }
      }
      System.out.println(fishHuman[0] + " , " + fishHuman[1]);
   }

   static int fishCheck(int[][] hosu, int[] fishHuman) {
      if (hosu[fishHuman[0]][fishHuman[1]] == 1) {
         System.out.println("물고기를 잡았습니다");
         hosu[fishHuman[0]][fishHuman[1]] = 0;
         return 1;
      } else {
         return 0;
      }
   }
   
   static void allPrint(int[][] hosu,int[] fishHuman) {
      for(int i=0;i<hosu.length;i++) {
         
         for(int j=0;j<hosu[i].length;j++) {
            //fishHuman[0] -> 행 ( 세로인덱스 ) fishHuman[1] -> 열( 가로인덱스 )
            if(fishHuman[0] == i && fishHuman[1] == j) {
               System.out.print("x ");
            }
            else if(hosu[i][j] == 0) {
               System.out.print("○ ");
            }
            else {
               System.out.print("● ");
            }
         }
         System.out.println();
      }
   }
   static int inputNews(Scanner sc) {
      System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
      return sc.nextInt();
   }
   static void move(int num,int[] fishHuman) {
      if(num==1) {
         fishHuman[0]--;
         if(fishHuman[0] < 0) {
            fishHuman[0] = 0;
            System.out.println("더이상 위로 움직일 수 없습니다");
         }
      }
      else if(num==2) {
         fishHuman[0]++;
         if(fishHuman[0] > 4) {
            fishHuman[0] = 4;
            System.out.println("더이상 아래로 움직일 수 없습니다");
         }
      }
      else if(num==3) {
         fishHuman[1]--;
         if(fishHuman[1] < 0) {
            fishHuman[1] = 0;
            System.out.println("더이상 왼쪽으로 움직일 수 없습니다");
         }
      }
      else if(num==4) {
         fishHuman[1]++;
         if(fishHuman[1] > 4) {
            fishHuman[1] = 4;
            System.out.println("더이상 오른쪽으로 움직일 수 없습니다");
         }
      }
      else {
         System.out.println("잘못된 입력입니다 !");
      }
   }

   public static void main(String[] args) {
      // 낚시게임을 함수화로 구현을 하세요.
      // 함수화 진행시 함수 하나의 기능만 존재하도록 구현을 해주세요
      // 메인 함수는 명령어가 무조건 하나여야합니다.

      // 낚시게임
      // 호수가 5x5의 호수가 있습니다.
      // 호수에는 물고기가 3마리가 있습니다.
      // 물고기 3마리는 랜덤으로 좌표에 위치해있습니다.
      // 물고기 위치가 지정이 되면 낚시게임이 시작됩니다.
      // (단, 물고기는 같은 위치에 있으면 안됩니다.)
      // 그리고 낚시꾼은 미끼가 달린 바늘을 던집니다.(캐스팅)
      // (단, 좌표의 범위를 넘어가지 않게 던져야합니다.)
      // 좌표범위를 넘으면 다시 캐스팅해주세요.하고 출력이 됩니다.
      // 그리고 1.위 2.아래 3.왼쪽 4.오른쪽의 명령을 받아서 낚시바늘 위치를 이동시킵니다.
      // (위 이동시 0보다 작아지면 이동x,아래 이동시 4보다크면 이동x,
      // 왼쪽 이동시 0보다 작아지면 이동x, 오른쪽 이동시 4보다 크면 이동x )
      // 낚시바늘이 이동을 하다가 물고기가 있는 좌표에 같아지면 물고기를 잡게됩니다.
      // 그리고 물고기 3마리를 잡을때까지 낚시게임은 계속 진행됩니다.
      // 캐스팅을 하였는데 거기에 물고기가 있으면 바로 잡히고 시작하게 됩니다.
      start();
   }

}