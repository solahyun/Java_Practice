import java.util.Scanner;

public class Ex09_switch���ǽ�_Ȧ¦�Ǻ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("¦���Դϴ�!");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�!");
			break; // ���� ����
		}
	}
}
