
public class Ex04_�迭 {
	// �ڷ� ���� : �뷮�� �����͸� ȿ�������� �����ϴ� ���
	// �迭(array)�� �ε���(index)�� �ε����� �����ϴ� �����͵��
	// �̷���� �������� �ڷ� ������ ���� ������ �����͵��� ���������� �����
	// �迭 : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
	public static void main(String[] args) {

		// �迭 �����
		// ���̰� 10�� ������ �迭 array �����
		// ������ �迭�� �ּҸ� ����
		int[] array = new int[10];
		System.out.println(array);

		int cnt = 70;

		// �迭��.length -> �迭�� ���̸� �� �� ����
		// �ش� �ε����� ����
		for (int i = 0; i < array.length; i++) {
			array[i] = cnt;
			cnt += 10;
		}

//		array[0] = 70;
//		array[1] = 80;
//		array[2] = 90;
//		array[3] = 70; // Index 3 out of bounds for length 3

		// �ش� �ε��� �ȿ� �ִ� �� ������
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);

	}
}
