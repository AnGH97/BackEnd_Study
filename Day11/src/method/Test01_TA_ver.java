package method;

public class Test01_TA_ver {
   static int randomMake() {// 랜덤 수 뽑기
      return (int) (Math.random() * 26);
   }

   static int add(int n) {// 랜덤수 뽑기 + 65
      return n + 65;
   }

   static char makeChar(int n) {// add에서 리턴한 값 문자로 바꾸기
      return (char) n;
   }

   static String makeString(char ch) {// 문자로 바꾼거 문자열 만들기
      String st = "";
      return st + ch;
   }

   static void printString(String st) {// 전체 문자열 출력하기
      System.out.println(st);
   }

   static void start() {// 시작지점
      for (int i = 0; i < 10; i++) {
         String result = "";
         for (int j = 0; j < 10; j++) {
            int ran = randomMake();//랜덤값 뽑기 0 ~ 25
            int addRan = add(ran);//랜덤값 뽑은거 + 65
            char ch = makeChar(addRan);//정수 -> 문자
            String st = makeString(ch);//문자 -> 문자열
            result += st;//문자열로 바뀐 문자들을 합치는 과정
         }
         printString(result);//10개의 문자가 합쳐진 문자열을 출력
      }
   }

   public static void main(String[] args) {
      // 문자A(65)에서 랜덤에서 0 ~ 25값을 추출(1) 이후에
      // 더하기 연산(2) 해서 문자를 만듭니다.

      // 이 랜덤한 문자를 만드는 작업(3)을 10번 실행하여서 10개의 문자를 더하기 연산(4)
      // 10개의 문자열을 출력(5)해주세요.
      start();
   }

}