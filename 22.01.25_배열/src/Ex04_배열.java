public class Ex04_�迭 {

	public static void main(String[] args) {

		// �ִ� ã��
		// �迭�� ������ Ÿ���� ������
		// �� ������ -> 23, 45, 95, 17, 6, 89, 47, 56, 68, 71
		// �ȿ� �ִ� ������ ���� �߿� ���� ū ���� ���� �ε����� ���� ������ �� ���~
		// ��� ����) �ε��� : , max:

		int arr[] = { 23, 45, 95, 17, 6, 89, 47, 56, 68, 71 };

		int max = arr[0];

		// �ε��� ���� ����� ����
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (max == arr[i]) {
				idx = i;
			}
		}
		System.out.print("�ε��� " + idx + ", max : " + max);
	}
}
