package JF_0126;
import java.util.Scanner;

public class Ex08_0126_팩토리얼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();

		int output = 1;
		for (int i = 1; i <= input; i++) {
			output *= i;
		}

		System.out.print("출력 : " + output);
	}
}
