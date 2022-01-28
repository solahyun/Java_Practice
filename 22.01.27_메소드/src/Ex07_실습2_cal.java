import java.util.Scanner;

public class Ex07_실습2_cal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = 15;
		System.out.print("연산자 입력 >> ");
		String op = sc.next();

		System.out.print("결과 출력 >> ");
		System.out.print(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, String op) {
		int res;

		// op에 따른 다른 결과값을 돌려줘야 함
		// op 판단 -> 조건식
		// 문자(String) 간의 비교 -> .equals
		// 문자(char) 간의 비교 -> ==
		if (op.equals("-")) {
			return num1 - num2;
		} else if(op.equals("*")){
			return num1 * num2;
		} else if(op.equals("+")) {
			return num1 + num2;
		} else if(op.equals("/")) {
			return  num1 / num2;
		}
		// 모든 값들에 대한 리턴이 있어야 한다!
		return 0;
	}
}
