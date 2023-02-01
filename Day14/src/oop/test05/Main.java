package oop.test05;

public class Main {
	//동물이 4마리가 있습니다.
	//동물이 원숭이, 개, 닭, 돼지가 있습니다.
	//동물들은 자기가 무슨 동물인지와 음식을 들고 있습니다.	
	//(단, 여기서 무슨 동물과 음식은 함수로 통해서만 값을 넣고 사용할 수 있습니다)
	
	public static void main(String[] args) {
		Animal[] a = new Animal[4];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Animal();
			a[i].Input();
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i].Print();
		}
		
		String nf = a[a.length-1].food;
		
		for(int i = (a.length - 1); i >= 0; i--) {
			if(i == 0) {
				a[i].food = nf;
				break;
			}
			else {
				a[i].food = a[i-1].food;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			a[i].Print();
		}
		
	}

	
	//그리고 마지막으로 어떤 동물이 어떤 음식을 들고 있는지 출력하는 기능을 가지고 있습니다.
	
	//처음 먹이와 동물
	//원숭이 - 바나나 / 개 - 뼈다귀/ 닭 - 모이 / 돼지 - 여물
	//이렇게 가지고 있는것을 어떤 동물이 어떤 음식을 들고 있는지 출력해줍니다.
	//그 이후에 먹이를 옆 동물에게 전달합니다.
	//원숭이의 바나나는 개에게로 개에 뼈다귀는 닭에게로 닭의 모이는 돼지에게로
	//마지막으로 돼지의 여물은 원숭이에게로 이동합니다.
	//그리고 나서는 어떤 동물이 어떤 음식을 들고 있는지 출력을 해주면 됩니다.

}
