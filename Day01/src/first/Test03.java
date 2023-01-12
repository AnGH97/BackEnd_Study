package first;

public class Test03 {

	public static void main(String[] args) {
		// %s를 이용하여 Hello World를 출력해주세요
		System.out.printf("%s\n", "Hello World");
		
		// 오늘의 온도는 ㅁ도입니다.
		System.out.printf("오늘의 온도는 %d도입니다.\n", 25);
		System.out.printf("오늘의 온도는 %.1f도입니다.\n", 12.3);
		
		// 제 성적은 ㅁ점이고 등급은 ㅁ등급입니다.
		System.out.printf("제 성적은 %d점이고,등급은 %c등급입니다.\n", 100, 'A');
		
		// 제 이름은 ㅁ이고 ㅁcm이며 성적은 ㅁ점입니다.
		System.out.printf("제 이름은 %s이고 %.2fcm이며 성적은 %d점입니다.", "안가현", 154.95, 100);

	}

}
