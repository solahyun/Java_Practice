package ������;

public class Ex03_�޼�������_������ {

	public static void main(String[] args) {
		int num = 8196;
		boolean result = isPerfectNumber(num);
		System.out.println(num + "�� �������ΰ�? " + result);

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static boolean isDivisor(int num1, int num2) {
		return (num1 % num2 == 0) ? true : false;
	}

	public static void getDivisor(int num) {
		String result = "";
		result += num + "�� ��� : ";

		// result�� 24�� ��� �־��ֱ�
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) { // �޼��带 �ٸ� �޼��忡 ���
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

	public static boolean isPerfectNumber(int num) {
		if (getSumOfDivisors(num) == num * 2) {
			return true;
		}
		return false;
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "������ ������ : ");
		
		for (int i = startValue; i <= endValue; i++) {
			// i�� ���������� �ƴ����� �Ǻ�
			// �´ٸ� ���
			if (isPerfectNumber(i)) {
				 System.out.print(i + " ");
			}
		}
	}
}
