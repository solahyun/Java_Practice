import java.util.Random;
import java.util.Scanner;

public class �÷�������2 {

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
				System.out.println(">> ����!!!");
				num1 = r.nextInt(10) + 1;
				num2 = r.nextInt(10) + 1;
			} else {
				System.out.println(">> ����!!!");
			}

			System.out.print("����Ͻðڽ��ϱ�? ");
			String answer = sc.next();

			if (answer.equals("Y")) {
				
			} else if (answer.equals("N")) {
				break;
			} else {
				System.out.println(">> Y/N �߿� �Է����ּ���!");
				System.out.print("����Ͻðڽ��ϱ�? (Y/N) ");
				answer = sc.next();

				if (answer.equals("Y")) {
					
				} else if (answer.equals("N")) {
					break;
				} else {
					System.out.println("�߸� �Է�!!");
					break;
				}
			}
		}
		System.out.println();
		System.out.println("===== THE END =====");
	}
}
