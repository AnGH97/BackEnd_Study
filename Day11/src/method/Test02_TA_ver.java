package method;

import java.util.Scanner;

public class Test02_TA_ver {
   
   static String input() {
      Scanner sc = new Scanner(System.in);
      return sc.next();
   }
   static int select() {
      Scanner sc = new Scanner(System.in);
      return sc.nextInt();
   }
   static String odd(String st) {
      String result = "";
      for(int i=0;i<st.length();i+=2) {
         result += st.charAt(i);
      }
      return result;
   }
   static String even(String st) {
      String result = "";
      for(int i=1;i<st.length();i+=2) {
         result += st.charAt(i);
      }
      return result;
   }
   static void disp(String st) {
      System.out.println(st);
   }
   static void start() {
      System.out.print("문자열 입력 : ");
      String st = input();
      System.out.print("1. 짝수 2. 홀수 : ");
      int sel = select();
      switch(sel) {
      case 1:
         st = odd(st);
         break;
      case 2:
         st = even(st);
         break;
      default:
         System.out.println("잘못된 입력입니다");
      }
      disp(st);
   }

   public static void main(String[] args) {
      //문자열을 입력받습니다.그리고 난 후에 1.짝수 2.홀수를 선택합니다.
      //그러면 문자열의 홀수나 짝수 인덱스의 값을 추출을 해서 출력을 해주는 프로그램을
      //구현하세요.
      
      //korea
      //홀수 -> str.charAt(1) , str.charAt(3)
      //짝수 -> str.charAt(0) , str.charAt(2) , str.charAt(4)
      
      //문자열을 입력하세요 : korea
      //1.짝수 2.홀수 : 1
      //kra 출력 됨.
      //함수화 main에는 한줄만 있어야합니다. 입력 출력 연산 분리해서 함수화 시켜주세요
      //잘못된 입력도 해주세요. 한번만 실행되도록.
      start();
   }

}