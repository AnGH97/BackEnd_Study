package oop.test03;

//Array라는 클래스를 구현하여 숫자 데이터가 저장될 수 있도록 구현
public class Array_TA {
   //구성항목      배열 , lenght ( 배열 데이터의 개수 ) , size(배열의 총크기)
   int[] arr;
   int length , size;
   
   Array_TA(int size){
      this.size = size;
      arr = new int[size];
   }
   
   Array_TA(int[] arr) {
      this.arr = new int[arr.length];
      this.size = arr.length;
      
      for(;arr[length]!=0;length++) {
         this.arr[length] = arr[length];
      }
      //while(arr[length]!=0){
         //this.arr[lengh] = arr[length];
         //length++;
      //}
   }
   
   Array_TA(Array_TA array){
      this.arr = new int[array.size];
      this.size = array.size;
      this.length = array.length;
      
      for(int i=0;i<length;i++) {
         this.arr[i] = array.arr[i];
      }
   }
   
   //기능      add(v)
   //      - v라는 데이터를 마지막 칸에 추칸
   //      - 최대 10개까지만 ..
   void add(int v) {
      if(length == size) {
         System.out.println("데이터 공간이 없습니다");
         return;
      }
      arr[length] = v;
      length++;
   }
   
   //         get(i)
   //      - 특정위치의 데이터를 추출
   //      - i번째 데이터를 번째
   int get(int i) {
      if(i < 0 || i >= length) {
         System.out.println("인덱스 범위를 벗어났습니다");
         return -1;
      }
      return arr[i];
   }
   //         remove()
   //      - 마지막 데이터를 삭제
   //      - 데이터 없으면 실행 중지
   void remove() {
      if(length == 0) {
         System.out.println("No Data!!");
         return;
      }
      length--;
      //arr[length] = 0;
   }
   
   //         size()
   //      - 현재 데이터의 개수를 반환
   int size() {
      return length;
   }
   
   //         add(int i,int data)
   //      - i라는 인덱스와 data인 데이터를 받아와서
   //        그 인덱스에 그 값을 추가
   //      - 그 인덱스에 값이 추가되면 추가된 자리부터 한칸씩 데이터가 뒤로 밀린다.
   
   //         disp()
   //      - 배열 안에 있는 값 , 데이터 개수 , 총 크기
   void disp() {
      System.out.println("데이터의 개수 : "+size() + " 총 크기 : "+size);
      for(int i=0;i<size();i++) {
         System.out.print(arr[i]+"\t");
      }
      System.out.println();
   }
   
   void add(int i, int data) {
	   if(length == size) {
		   System.err.println("데이터 공간이 없습니다.");
		   return;
	   }
	   else if(i >= length) {
		   System.out.println("인덱스 범위가 벗어났습니다.");
		   return;
	   }
	   for(int idx = length - 1; i <= idx; idx--) {
		   arr[idx + 1] = arr[idx];
	   }
	   arr[i] = data;
	   length++;
   }

}