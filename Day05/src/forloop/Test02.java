package forloop;

public class Test02 {
	
	public static void main(String[] args) {
		//돈을 저축하려 합니다
		//오늘 저축할 돈은 어제 저축한 돈의 두배로 할 예정이고
		//첫째날에 1원을 저축하려고 합니다.
		long money1 = 1;
		long sum = 0;
		//(Q1)	30일 동안 통장에 저축될 돈은 얼마입니까?
		for(int i = 1; i <= 30; i++) {
			sum += money1;
			money1*=2;
		}
		System.out.println(sum);
		money1 = 1;
		sum = 1;
		//(Q2)	40일 동안 통장에 저축될 돈은 얼마입니까?
		for(int i = 1; i <= 40; i++) {
			sum += money1;
			money1*=2;
		}
		System.out.println(sum);
	}

}
