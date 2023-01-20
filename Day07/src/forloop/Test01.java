package forloop;

public class Test01 {
	
	public static void main(String[] args) {
		//문자 A에서 ~ Z까지 랜덤 추출하여서
		//더하기 연산을 해서 랜던한 문자열을 만듭니다.
		//문자열을 만드는 작업을 10번 실행하여서 문자열을 만들어 주세요.
		// - 중복 허용 o
		String s = "";
		String st = "";
		int num1 = 0;
		int j = 0;
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 26) + 65;
			s += (char)(num);
		}
		System.out.println(s);
		
		// - 중복 허용 x
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 26) + 65;
			if(st.length() != 0) {
				while(true) {
					if(num == st.charAt(j)) {
						num = (int)(Math.random() * 26) + 65;
						j = 0;
					}
					else if(j == st.length()-1) {
						if(num != st.charAt(j)) {
							j = 0;
							break;
						}
					}
					else {
						j+=1;
					}
				}
			}
			st += (char)(num);
		}
		System.out.println(st);
		
	}

}
