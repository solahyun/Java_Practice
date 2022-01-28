package JF_0126;
import java.util.Scanner;

public class Ex08_Factorial {
	public static int factorial(int num) {
		int sum = 1;
		for (int i = num; i >= 1; i--) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б : ");
		int num = sc.nextInt();

		System.out.println(factorial(num));
	}

}
