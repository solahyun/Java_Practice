
public class Ex02_�迭 {

	public static void main(String[] args) {

		// �������� �迭 array �����ϱ�
		// 3, 10, 4, 8, 17, 22, 31
		// ¦���� �ش��ϴ� ���鸸 ���

		int array[] = { 3, 10, 4, 8, 17, 22, 31 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		// ����!
		// Ȧ���� �ش��ϴ� ����� �� �� ���� �ִ��� ����ϱ�
		// array�� Ȧ���� �ش��ϴ� ���� _�� �ְ�, �� _���� �ִ�.
		int cnt = 0;
		System.out.print("array�� Ȧ���� �ش��ϴ� ���� ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
				cnt++;
			}
		}
		System.out.println("�� �ְ�, �� " + cnt + "���� �ִ�.");
	}
}
