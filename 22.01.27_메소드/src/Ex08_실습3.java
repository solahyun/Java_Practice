import java.util.Scanner;

public class Ex08_�ǽ�3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();
		int result = largerNumber(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);
	}

	public static int largerNumber(int num1, int num2) {
		int max = (num1 > num2) ? num1 : num2;
		if (num1 == num2)
			return 0;
		return max;
		
		// return (num1 > num2) ? num1 : num2;
	}
}
