import java.util.Scanner;

public class Ex05_if���ǽ�4_��Ʈ���� {
	// ���� ��ǰ ������ 10000��
	// 11�� �̻� ���� �ô� 10% ����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���.");
		int count = sc.nextInt();
		int gift = 10000;

		if (count >= 11) {
//			int res = gift * count - (int) (gift * count * 0.1);
			int res = (int)(gift * count * 0.9);
			System.out.println("������ " + res + "�� �Դϴ�.");
		} else {
			int res = gift * count;
			System.out.println("������ " + res + "�� �Դϴ�.");
		}
	}
}
