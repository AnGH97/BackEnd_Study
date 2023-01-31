package method;

import java.util.Scanner;

public class Test03_TA_ver {
   static int numInput() {
      Scanner sc = new Scanner(System.in);
      return sc.nextInt();
   }

   static void gugudan(int n) {
      if (n == 1) {
         gugudan1();
      } else if (n == 2) {
         gugudan2();
      } else {
         errorPrint();
      }
   }

   static void errorPrint() {
      System.out.println("잘못된 입력 !");
   }

   static void gugudan1() {
      System.out.print("원하는 단 입력 : ");
      int dan = numInput();
      for (int i = 1; i < 10; i++) {
         System.out.println(dan + " x " + i + " = " + (dan * i));
      }
   }

   static void gugudan2() {
      for (int i = 2; i <= 9; i++) {
         for (int j = 1; j <= 9; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
         }
      }
   }

   static void star(int n) {
      if (n == 1) {
         star1();
      } else if (n == 2) {
         star2();
      } else if (n == 3) {
         star3();
      } else if (n == 4) {
         star4();
      } else if (n == 5) {
         star5();
      } else {
         errorPrint();
      }
   }

   static void star1() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   static void star2() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   static void star3() {
      for (int i = 0; i < 5; i++) {
         for (int k = 4; k > i; k--) {
            System.out.print(" ");
         }
         for (int j = 0; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   static void star4() {
      for (int i = 1; i <= 5; i++) {
         for (int k = 4; k >= i; k--) {
            System.out.print(" ");
         }
         for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   static void star5() {
      int cnt = 0;
      for (int i = 1; i <= 5; i++) {
         if (i <= 3) {
            cnt++;
         } else {
            cnt--;
         }
         for (int j = 1; j <= 3 - cnt; j++) {
            System.out.print(" ");
         }
         for (int k = 1; k <= 2 * cnt - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   static void start() {
      while (true) {
         System.out.println("1.구구단 출력 2.별찍기 3.종료");
         int n = numInput();
         if (n == 1) {
            System.out.println("1.원하는 구구단 출력\n2. 전체 구구단 출력");
            gugudan(numInput());
         } else if (n == 2) {
            System.out.println("1.네모\n2.직삼각형 정방향\n3.직삼각형 역방향\n4.피라미드\n5.다이아몬드");
            star(numInput());
         } else if (n == 3) {
            break;
         } else {
            errorPrint();
         }
      }
   }

   public static void main(String[] args) {
      // 무한반복으로 프로그램 구성
      // <첫화면>
      // 1. 구구단 출력
      // 2. 별찍기 출력
      // 3. 종료

      // 1번입력시
      // 1. 원하는 구구단 출력
      // 원하는 구구단을 입력하세요 :
      // 2. 전체 구구단 출력

      // 2번입력시
      // 1.네모
      // 2.직삼각형 정방향
      // 3.직삼각형 역방향
      // 4.피라미드
      // 5.다이아몬드
      // 무조건 실행 이후에 첫 화면이동 / 잘못된 번호 입력시 잘못된 입력 출력 함수화
      start();
   }

}