
public class Ex04_증감연산자 {

	public static void main(String[] args) {
		// 변수의 값을 1 증가시키거나 1 감소시키는 연산자
		int num = 10;
		
		// ++ : 증가 연산자
		// ++변수 : 1을 먼저 증가시키고 다음 행동을 함
		// 변수++ : 행동을 먼저 하고 1을 나중에 증가시킴
		System.out.println(++num);
		System.out.println(num++);
		
		num--;
		System.out.println(num);
	}

}



