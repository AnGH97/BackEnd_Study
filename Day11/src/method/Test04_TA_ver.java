package method;

import java.util.Scanner;

public class Test04_TA_ver {
   static int[] input() {
      Scanner sc = new Scanner(System.in);
      int[] n = new int[2];
      n[0] = sc.nextInt();
      n[1] = sc.nextInt();
      return n;
   }

   static boolean checkSeat(int[][] seat, int[] n) {
      boolean check = true;

      if (seat[n[0] - 1][n[1] - 1] == 0) {
         // 예약이 되어 있지 않은 경우
//            seat[n[0]-1][n[1]-1]++;
//            System.out.println(n[0]+"행 "+n[1]+"열 예약이 완료되었습니다");
         // count--;//예약 가능한 좌석수 감소
         return check;
      } else {
         System.out.println(n[0] + "행 " + n[1] + "열 예약이 완료된 자리입니다. 다시 예약해주세요");
         // 비어있는 좌석 출력
         check = false;
         return check;
      }

   }

   static void dispSeat(int[][] seat) {
      for (int i = 0; i < seat.length; i++) {
         for (int j = 0; j < seat[0].length; j++) {
            if (seat[i][j] == 0) {// seat배열의 값이 0인것을 확인
               System.out.println("비어있는 좌석 : " + (i + 1) + "행 " + (j + 1) + "열");
            }
         }
      }
   }

   static boolean checkInput(int[] n, int[][] seat) {
      if (n[0] <= seat.length && n[0] > 0 && n[1] <= seat[0].length && n[1] > 0) {
         return true;
      } else {
         return false;
      }
   }

   static void start() {
      int[][] seat = new int[9][2];
      int count = seat.length * seat[0].length;
      while (count != 0) {
         System.out.print("예약하실 좌석을 입력해주세요 (총 " + count + "석) : ");
         int[] n = input();//n[0] - 행 , n[1] - 열
         System.out.println(n[0] + "행");
         System.out.println(n[1] + "열");
         if (checkInput(n, seat)) {
            if (checkSeat(seat, n)) {//true일때는 예약코드 실행
               seat[n[0] - 1][n[1] - 1]++;
               System.out.println(n[0] + "행 " + n[1] + "열 예약이 완료되었습니다");
               count--;// 예약 가능한 좌석수 감소
            } else {//false일대는 비어있는좌석 전체출력 메소드 호출
               dispSeat(seat);
            }
         } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
         }
      }
   }

   public static void main(String[] args) {
      // 비행기 예약 시스템만들기 함수화해주세요.
      // 단,배열관련 함수가 하나 이상 존재해야합니다.

      // 비행기 예약 시스템 만들기
      // 좌석은 총 18자리 입니다.
      // 예약할 좌석을 행의 위치, 예약할 좌석의 열의 위치
      // 두 값을 입력받습니다.
      // 좌석은 9행 2열로 이루어졌습니다.
      // 좌석의 행과 열을 입력시
      // 예약좌석이 0이되면 프로그램 종료
      // (예약이 끝났습니다.)
      // 예) 예약하실 좌석을 입력해주세요 (총 18석):
      // 5(엔터) 행
      // 1(엔터) 열
      // 5행 1열에 아무도 예약을 하지 않을시 예약이 완료됐습니다. 출력
      // 만약에 5행 1열에 예약한 사람이 있을시 예약이 완료된 자리입니다. 다시 예약해주세요.
      // 출력 후 비어있는 좌석을 출력해서 알려줍니다.
      // 비어있는 좌석은 1행 1열 입니다.(이런 타입으로 전체를 다 알려주어야합니다.)
      // (행과 열을 입력시 행은 8보다 크거나 0보다 작거나
      // 열은 1보다 크거나 0보다 작으면 잘못된 입력입니다.출력 )
//      Scanner sc = new Scanner(System.in);
//      int[][] seat = new int[9][2];
//      int count = 18;
//      while (count != 0) {
//         System.out.print("예약하실 좌석을 입력해주세요 (총 " + count + "석) : ");
//         int h = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(h + "행");
//         System.out.println(y + "열");
//         if (h <= seat.length && h > 0 && y <= seat[0].length && y > 0) {
//            // 올바른 입력
//            if (seat[h - 1][y - 1] == 0) {
//               // 예약이 되어 있지 않은 경우
//               seat[h - 1][y - 1]++;
//               System.out.println(h + "행 " + y + "열 예약이 완료되었습니다");
//               count--;// 예약 가능한 좌석수 감소
//            } else {
//               // 예약이 되어 있는 경우
//               System.out.println(h + "행 " + y + "열 예약이 완료된 자링비니다. 다시 예약해주세요");
//               // 비어있는 좌석 출력
//               for (int i = 0; i < seat.length; i++) {
//                  for (int j = 0; j < seat[0].length; j++) {
//                     if (seat[i][j] == 0) {// seat배열의 값이 0인것을 확인
//                        System.out.println("비어있는 좌석 : " + (i + 1) + "행 " + (j + 1) + "열");
//                     }
//                  }
//               }
//            }
//         } else {
//            // 잘못된 입력
//            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
//         }
//      }
      start();

   }

}