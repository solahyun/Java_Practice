
public class Ex03_������ϱ� {

	public static void main(String[] args) {
		// ��� : 1���� �ڱ� �ڽű��� ���������� ������ �� �������� 0
		// 2~30���� ������ϱ�
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "�� ��� : ");
			for (int j = 1; j <= i; j++) {  // i������ ��
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
