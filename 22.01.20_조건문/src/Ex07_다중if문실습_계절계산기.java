import java.util.Scanner;

public class Ex07_����if���ǽ�_�������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();

		// (month==12||month==1||month==2)
		if (month == 12 || month <= 2) {
			System.out.println(month + "���� �ܿ��Դϴ�!");
		} else if (month <= 5) {
			System.out.println(month + "���� ���Դϴ�!");
		} else if (month <= 8) {
			System.out.println(month + "���� �����Դϴ�!");
		} else if (month <= 11){
			System.out.println(month + "���� �����Դϴ�!");
		}
	}
}
