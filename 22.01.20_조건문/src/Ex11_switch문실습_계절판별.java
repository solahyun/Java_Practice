import java.util.Scanner;

public class Ex11_switch���ǽ�_�����Ǻ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();

		switch (month) {
		case 12, 1, 2: // �ڹ� 8���� �̻���� ����
			System.out.println(month + "���� �ܿ��Դϴ�!");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�!");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�!");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�!");
			break;
		default:
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���!");
		}
	}
}