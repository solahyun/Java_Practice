package ������;

public class Ex01_������ϱ� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;

		// is�� ���� �޼��� -> ������� boolean
//		boolean divisor = isDivisor(num1, num2);
//		System.out.println(divisor);

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
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
			if (num % i == 0) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}
}


