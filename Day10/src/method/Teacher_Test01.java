package method;

import java.util.Scanner;

public class Teacher_Test01 {
   
   static double input() {   
      Scanner sc = new Scanner(System.in);
      int kor,eng,math;
      System.out.print("국어 : ");
      kor = sc.nextInt();
      System.out.print("영어 : ");
      eng = sc.nextInt();
      System.out.print("수학 : ");
      math = sc.nextInt();
      double avg = getAvg(kor,eng,math);
      
      return avg;
   }
   static double getAvg(int kor,int eng,int math) {
      double avg = 120.0;
      String errorScore = "";
      if(kor <= 100 && kor >= 0 && eng <= 100 && eng >= 0 && math <=100 && math>=0) {
         avg = (kor+eng+math) / 3.0;
      }
      else {
         if(kor > 100 || kor < 0) {
             //error1("국어");
            errorScore+="국어 ";
         }
         if(eng > 100 || eng < 0) {
            errorScore+="영어 ";
         }
         if(math > 100 || math < 0) {
            errorScore+="수학 ";
         }
         error1(errorScore);
      }
      return avg;
   }
   static String getGrade(double avg) {
      String grade = "";
      if(avg <= 100 && avg >= 95) {
         grade = "A+";
      }
      else if(avg >= 90) {
         grade = "A";
      }
      else if(avg >= 85) {
         grade = "B+";
      }
      else if(avg >= 80) {
         grade = "B";
      }
      else if(avg >= 70) {
         grade = "C";
      }
      else if(avg >= 60) {
         grade = "D";
      }
      else {
         grade = "F";
      }
      return grade;
   }
   static void error1(String name) {//잘못된 입력값 확인
      System.out.println("잘못 입력된 과목 : "+name);
      errorPrint();
   }
   static void errorPrint() {//잘못된 입력입니다.
      System.out.println("잘못된 입력입니다");
   }
   static void disp(double avg,String grade) {//평균 학점 출력 - 안주고 받고
      System.out.printf("평균 : %.1f\n",avg);
      System.out.println("학점 : "+ grade);
   }
   static void start() {
      double avg = input();
      if(avg == 120.0) {
         return; //종료
      }
      String grade = getGrade(avg);
      disp(avg,grade);
   }

   public static void main(String[] args) {
      //세과목의 점수 입력(국어 영어 수학) 정수로 입력 받으세요.
      //( ?   주고 안받고 )
      //평균(소수점 첫번째자리까지) 학점 연산
      //( ?   주고 받고 )
      //그 이후에 평균의 학점을 출력을 해주세요
      //A+ 95점 이상 / A 90점 이상
      //B+ 85점 이상 / C 70점 이상
      //D 60점 이상 / F 60점 미만
      //( ?   주고 받고 )
      //단, 각 점수마다 100점을 초과하는 점수를 입력하면 평균을 계산을 하지않고
      //입력된 과목과 함께 점수를 잘못입력했습니다. 출력후에 프로그램 종료
      //잘못된 입력값 확인( ?      안주고 받고)
      //잘못 입력입니다. 출력(?   안주고 안받고)
      //평균학점 출력(?   안주고 받고 )
      start();
   }

}