package JF_0125;
import java.util.Scanner;

public class Ex07_�ִ�����_�ּҰ���� {
	// ��Ŭ���� ȣ����
	// gcd, lcm
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ����� & �ּҰ���� ���ϱ�");
		System.out.print("���� 1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� >> ");
		int num2 = sc.nextInt();

		int min = (num1 < num2) ? num1 : num2;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				System.out.println(gcd);
			}
		}

		System.out.print("�ִ����� : " + gcd + "\n");
		System.out.print("�ּҰ���� : " + num1 * num2 / gcd);

	}

}
