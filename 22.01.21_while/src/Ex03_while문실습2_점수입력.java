import java.util.Scanner;

public class Ex03_while���ǽ�2_�����Է� {

	public static void main(String[] args) {
		// 0~100������ ������ ��� �Է¹޴ٰ�
		// ������ ����� ���� �ԷµǸ� �� �������� �Էµ�
		// �ڷ��� �հ�� ����� ����ϴ� ���α׷�
		// ����� ���� �ԷµǸ� ���� : ��� ���� ����

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		int sum = 0;
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();

			sum += num;
			cnt++;
			if (num < 0 || num > 100) {
				sum -= num;
				cnt--;
				break;
			}
		}
		float avg = sum / (float)cnt;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
