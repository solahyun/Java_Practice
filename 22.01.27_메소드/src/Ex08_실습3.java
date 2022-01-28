import java.util.Scanner;

public class Ex08_실습3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);
	}

	public static int largerNumber(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;
		if (num1 == num2)
			return 0;
		return max;
		
		// return (num1 > num2) ? num1 : num2;
	}
}
