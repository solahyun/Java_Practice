import java.util.Scanner;

public class Ex05_for���ǽ�4 {

	public static void main(String[] args) {

		// ����ڿ��� �� ���� �ڿ����� �Է¹޾Ƽ�
		// �Է¹��� ���� ����� ���ʷ� 10�� ����ϴ� ���α׷�
		// ��) 5 -> 5 10 15 20 25 30 35 40 45 50

		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �Է� : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}

	}

}
