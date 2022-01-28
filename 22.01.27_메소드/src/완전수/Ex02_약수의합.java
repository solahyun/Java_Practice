package ������;

public class Ex02_������� {

	public static void main(String[] args) {
		int num = 10;
		int result = getSumOfDivisors(num);

		System.out.println(num + "�� ����� �� : " + result);

		getDivisor(num);
	}

	public static boolean isDivisor(int num1, int num2) {
		return (num1 % num2 == 0) ? true : false;
	}

	// ��� ����) 24�� ��� : 1, 2, 3, 4, 6, 8, 12, 24
	public static void getDivisor(int num) {
		String result = "";
		result += num + "�� ��� : ";

		// result�� 24�� ��� �־��ֱ�
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {  // �޼��带 �ٸ� �޼��忡 ���
				result += i + " ";
			}
		}
		System.out.println(result);
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum;
	}
}
