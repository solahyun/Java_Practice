import java.util.Random;
import java.util.Scanner;

public class 플러스게임2 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("==== PLUS GAME ====");
		System.out.println();

		int num1 = r.nextInt(10) + 1;
		int num2 = r.nextInt(10) + 1;

		int result = num1 + num2;

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
			String answer = sc.next();

			if (answer.equals("Y")) {
				
			} else if (answer.equals("N")) {
				break;
			} else {
				System.out.println(">> Y/N 중에 입력해주세요!");
				System.out.print("계속하시겠습니까? (Y/N) ");
				answer = sc.next();

				if (answer.equals("Y")) {
					
				} else if (answer.equals("N")) {
					break;
				} else {
					System.out.println("잘못 입력!!");
					break;
				}
			}
		}
		System.out.println();
		System.out.println("===== THE END =====");
	}
}
