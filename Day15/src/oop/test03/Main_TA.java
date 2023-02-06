package oop.test03;

public class Main_TA {

   public static void main(String[] args) {
	   Array_TA array = new Array_TA(5); //배열 5칸이 생긴다..
      System.out.println(array.getClass().getName());
      array.add(1);
      array.add(2);
      array.add(3);
      array.add(4);
      array.add(5);
      //array.add(6); //- 데이터 초과
      array.remove(); // 5라는 숫자가 0으로 바뀜
      array.remove();
      System.out.println(array.get(9));//2라는 숫자가 출력
      array.disp();
      
      
      //---------------------------------
      int[] arr = new int[10];
      arr[0] = 1;
      arr[1] = 2;
      Array_TA a2 = new Array_TA(arr); //생성자 2번 배열을 넘겨줬을때
      a2.disp();
      a2.add(3);
      a2.disp();
      
      Array_TA a3 = new Array_TA(array);//생성자 3번 객체를 넘겨줬을때
      //-----------------------------------
      a3.disp();

   }

}