import java.util.Scanner;

public class Ex07_for���ǽ�6 {

	public static void main(String[] args) {

		// �Է¹��� ������ ����� ���ؼ� ���
		// ��� : ������ ������ �������� �ϴ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		System.out.print(num + "�� ��� : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				// \t -> tab�� �ؼ� ������ִ� ��ɹ�
				// \n -> println�� ���� ����
				System.out.print(i + "\t");

			}
		}
	}

}
