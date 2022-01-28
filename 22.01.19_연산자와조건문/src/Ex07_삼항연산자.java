
public class Ex07_삼항연산자 {

	public static void main(String[] args) {
		// 간단한 true, false에 대한 제어가 필요할 때
		// 조건식(결과값이 true/false) ? 값1(true일 때) : 값2(false일 때);
		
		int num1 = 3;
		int num2 = 4;
		
		// num1과 num2를 비교해서 num1이 더 크면 "num1이 더 큽니다."
		// num2이 더 크면 "num2이 더 큽니다."
		String res = num1>num2 ? "num1이 더 큽니다." : "num2이 더 큽니다.";
		System.out.println(res);
	}

}
