import java.util.Arrays;
import java.util.Scanner;

public class Ex02_ȸ�����Խý��� {

	public static void main(String[] args) {

		// ȸ������ �ý���
		// �α���, ȸ������, ����
		// 1. ȸ������ - ID, PW, NICK�� �Է¹޾� ���� �迭�� ����
		// 2. �α��� - ID, PW �Է¹޾� ��ġ�ϸ� NICK�� ȯ���մϴ� ���
		// 3. ���� - ���α׷� ����

		// ȸ���� ������ ������ �迭
		String[] ids = new String[5]; // id ���� �迭
		String[] pws = new String[5]; // pw ���� �迭
		String[] nicks = new String[5]; // nick ���� �迭

		Scanner sc = new Scanner(System.in);

		int point = 0;

		while (true) {

			System.out.print("1.ȸ������ 2.�α��� 3.���� >> ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (point < ids.length) {
					System.out.print("id �Է� : ");
					String id = sc.next();
					System.out.print("pw �Է� : ");
					String pw = sc.next();
					System.out.print("nick �Է� : ");
					String nick = sc.next();

					ids[point] = id;
					pws[point] = pw;
					nicks[point] = nick;

					point++;
				} else {
					System.out.println("�� �̻� ȸ�������� �Ұ����մϴ�!");
				}
				break;

			case 2:
				System.out.print("id �Է� : ");
				String id = sc.next();
				System.out.print("pw �Է� : ");
				String pw = sc.next();

				for (int i = 0; i < point; i++) {
					if (ids[i].equals(id) && pws[i].equals(pw)) {
						System.out.println(nicks[i] + "�� ȯ���մϴ�!");
						break;
					} else {
						System.out.println("�α��ο� �����߽��ϴ�...");
						break;
					}
				}
				break;
			case 3:
				System.out.println("���α׷� ����...");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			if (choice == 3) {
				break;
			}
//			System.out.println(Arrays.toString(ids));
		}
	}
}
