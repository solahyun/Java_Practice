
public class Ex06_�迭3 {

	public static void main(String[] args) {

		// �迭�� ���� -> ���۷����� ����� �ּ��� ���簡 �Ͼ
		// �⺻ �ڷ��������� ���� ���簡 �Ͼ.
		int[] array1 = { 10, 20, 30 };
		int[] array2 = array1;

		array1[0] = 1000;

		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}
}
