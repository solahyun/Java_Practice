
public class Ex06_논리연산자 {

	public static void main(String[] args) {
		// 좌항과 우항의 조건이 포함되는지 알 수 있는 연산자
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		int num4 = 6;
		
		// AND연산자 : 그리고 -> &&
		// 좌항과 우항의 결과값이 둘 다 true -> 결과 true
		// 나머지는 다 false
		System.out.println(num1<num2 && num3<num4); //t
		System.out.println(num1>num2 && num3<num4); //f

		// OR연산자 : 또는 -> ||
		// 좌항과 우항 둘 중 하나만 true -> 결과 true
		// 둘 다 false라면 -> 결과 false
		System.out.println(num1>num2 || num3<num4); //t
		System.out.println(num1>num2 || num3>num4); //f
		
		// NOT연산자
		// boolean 값을 반대로 꺼내는 것
		System.out.println(!(num1>num2)); //t
	}

}
