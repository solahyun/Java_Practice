package JF_0125;
import java.util.Scanner;

public class Ex07_최대공약수_최소공배수 {
	// 유클리드 호제법
	// gcd, lcm
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수 & 최소공배수 구하기");
		System.out.print("숫자 1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 >> ");
		int num2 = sc.nextInt();

		int min = (num1 < num2) ? num1 : num2;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				System.out.println(gcd);
			}
		}

		System.out.print("최대공약수 : " + gcd + "\n");
		System.out.print("최소공배수 : " + num1 * num2 / gcd);

	}

}
