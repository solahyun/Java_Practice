import java.util.Scanner;

public class Ex04_if���ǽ�3_�պ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int calc = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("��������� : ");
		int data = sc.nextInt();
		System.out.print("��Ʈ��������� : ");
		int sw = sc.nextInt();

		// ù ��° ���� : �� ������ �ּ� 8�� �̻��� �¾ƾ� ��
		boolean check1 = db >= 8 && calc >= 8 && os >= 8 && data >= 8 && sw >= 8;
		// �� ��° ���� : �� ������ ������ 60�� �̻�
		boolean check2 = (db + calc + os + data + sw) >= 60;

		if (check1 && check2) {
			System.out.println("�հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�!");
		}
	}
}
