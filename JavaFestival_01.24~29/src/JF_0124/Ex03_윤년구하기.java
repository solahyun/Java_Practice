package JF_0124;
import java.util.Scanner;

public class Ex03_���ⱸ�ϱ� {

	// ���� : 2���� 29���� �ִ� ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}
	}
}
