import java.util.Random;
import java.util.Scanner;

public class Ex04_while���ǽ�3_�÷������� {

	public static void main(String[] args) {
		// Plus Game : �� ���� ���ڸ� ���� ���� ���ߴ� ����
		// ������ ���ڸ� �����ϴ� ���

		// ������ ����ؼ� ����Ǿ�� �Ѵ�.
		// 1. ���� X : ����ڿ��� "����Ͻðڽ��ϱ�?" ���
		// 1-1. "����Ͻðڽ��ϱ�?"���� "Y" �Է��ϸ�, ���� Ʋ�ȴ� ������ �ٽ� ����
		// 1-2. "����Ͻðڽ��ϱ�?"���� "N" �Է��ϸ�, ������ �����
		// 2. ���� O : ���� ������ �ƴ� ���ο� ������ ���
		// 3. ������ ������ �ִ� �߰� ����� �޾��ּ���.(BONUS!) - ��ǰ Ŀ������
		// ��ŷ, ����, �� ��� �κе� �߰��ص� ��!

		Random r = new Random(); // ���۷��� Ÿ��
		Scanner sc = new Scanner(System.in);

		System.out.println("==== PLUS GAME ====");
		// �� ���� �ȿ� ������ ���ڸ� �����ؼ� �ִ� �ڵ�
		int num1 = r.nextInt(10) + 1; // 0~9���� + 1
		int num2 = r.nextInt(10) + 1;
		// ������ ������ ����
		int result = num1 + num2;

		while (true) {
			// ����ڿ��� ������ �����ϰ� ���� �Է¹޴� �ڵ�
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
				System.out.print("����Ͻðڽ��ϱ�? ");
				String answer = sc.next();

				if (answer.equals("Y")) {
					// �ݺ��� ����ؼ� ����
					// while�� ó������ ���ư��� �ϴ� Ű���� -> continue
				} else if (answer.equals("N")) {
					break;
				} else {
					System.out.println("Y/N �߿� �Է����ּ���!");
					break;
				}
			}
		}
		System.out.println("===== THE END =====");
	}
}
