import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex04_PlusGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("====== PLUS GAME ======");
		System.out.println("���̵��� �����ϼ��� (1 �Ǵ� 2)");
		System.out.print(">> ");
		int mode = 0;

		try {
			mode = sc.nextInt();

			while (!(mode == 1) && !(mode == 2)) {
				JOptionPane.showMessageDialog(null, "���ڸ� �Է��ϼ���(1 �Ǵ� 2)!", "Error", JOptionPane.WARNING_MESSAGE);
				System.out.println("�ٽ� ���̵��� �����ϼ��� (1 �Ǵ� 2)");
				System.out.print(">> ");
				mode = sc.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է����ּ���!");
			System.out.println("���α׷� ����!");
		}

		int sum = 0;
		String A = "";

		switch (mode) {
		case 1:
			System.out.println("[ �ʱ� ���̵� ]");

			int num1 = r.nextInt(10) + 1;
			int num2 = r.nextInt(10) + 1;
			int result1 = num1 + num2;

			System.out.print(num1 + " + " + num2 + " = ");
			int input1 = sc.nextInt();

			while (true) {
				while (result1 == input1) {
					sum++;
					System.out.println("�����̿��� " + "(" + sum + "��)");

					num1 = r.nextInt(10) + 1;
					num2 = r.nextInt(10) + 1;
					System.out.print(num1 + " + " + num2 + " = ");

					input1 = sc.nextInt();
					result1 = num1 + num2;
				}

				System.out.print("�����̿���. ��� �Ͻðڽ��ϱ�? >> ");
				A = sc.next();

				switch (A) {
				case "y":
				case "Y":
					System.out.print(num1 + " + " + num2 + " = ");
					input1 = sc.nextInt();
					result1 = num1 + num2;
					break;

				case "n":
				case "N":
					System.out.println("������ �ٽ� ������!");
					System.out.println("�ν�Ƽ�� : https://www.youtube.com/channel/UCubIpLB7cA9tWIUZ26WFKPg");

					JOptionPane.showMessageDialog(null, "���� ���� : " + sum + "��!!!", "���� Ȯ��",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				default:
					System.out.println("��Ȯ�� ���ڸ� �Է��ϼ���.");
				}
				if (A.equals("n") || A.equals("N"))
					break;
			}
			break;

		case 2:
			System.out.println("[ �߱� ���̵� ]");

			int num3 = r.nextInt(20) + 1;
			int num4 = r.nextInt(20) + 1;
			int result2 = num3 + num4;

			System.out.print(num3 + " + " + num4 + " = ");
			int input2 = sc.nextInt();

			while (true) {

				A = "";
				while (result2 == input2) {
					sum += 2;
					System.out.println("�����̿���! (+2��)");

					num3 = r.nextInt(20) + 1;
					num4 = r.nextInt(20) + 1;
					System.out.print(num3 + " + " + num4 + " = ");

					input2 = sc.nextInt();
					result2 = num3 + num4;

				}

				System.out.print("�����̿���! (-1��) ��� �Ͻðڽ��ϱ�? >> ");
				sum -= 1;
				A = sc.next();

				switch (A) {
				case "y":
				case "Y":
					System.out.print(num3 + " + " + num4 + " = ");
					input2 = sc.nextInt();
					result2 = num3 + num4;
					break;

				case "n":
				case "N":
					System.out.println("������ �ٽ� ������!");
					System.out.println("�ν�Ƽ�� : https://www.youtube.com/channel/UCubIpLB7cA9tWIUZ26WFKPg");

					JOptionPane.showMessageDialog(null, "���� ���� : " + sum + "��!!!", "���� Ȯ��",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				default:
					System.out.println("��Ȯ�� ���ڸ� �Է��ϼ���.");
				}
				if (A.equals("n") || A.equals("N"))
					break;
			}
			break;
		}
	}
}
