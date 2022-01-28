import java.util.Random;
import java.util.Scanner;

public class 반복출력해보기 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("==== PLUS GAME ====");

		int num1 = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;

		int result = num1 + num2;

		String answer = "";

		while (true) {
			System.out.print("   ");
			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();
			result = num1 + num2;

			if (result == input) {
				System.out.println(">> 정답!!!");
				num1 = r.nextInt(10) + 1;
				num2 = r.nextInt(10) + 1;
			} else {
				System.out.println(">> 실패!!!");
			}

			System.out.print("계속하시겠습니까? ");
			answer = sc.next();

			if (answer.equals("Y")) {
				continue;
			} else if (answer.equals("N")) {
				break;
			} else {
				System.out.println("Y/N 중에 입력해주세요!");
				System.out.print("계속하시겠습니까? (Y/N) ");
				answer = sc.next();
				break;
			}

		}
		while (!(answer.equals("Y")) || !(answer.equals("N"))) {
			System.out.println("Y/N 중에 입력해주세요!");
			System.out.print("계속하시겠습니까? (Y/N) ");
			answer = sc.next();
			if ((answer.equals("Y")) || (answer.equals("N"))) {
				break;
			}
		}

		System.out.println("===== THE END =====");
	}
}
