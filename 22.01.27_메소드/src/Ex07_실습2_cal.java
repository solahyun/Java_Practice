import java.util.Scanner;

public class Ex07_�ǽ�2_cal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = 15;
		System.out.print("������ �Է� >> ");
		String op = sc.next();

		System.out.print("��� ��� >> ");
		System.out.print(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, String op) {
		int res;

		// op�� ���� �ٸ� ������� ������� ��
		// op �Ǵ� -> ���ǽ�
		// ����(String) ���� �� -> .equals
		// ����(char) ���� �� -> ==
		if (op.equals("-")) {
			return num1 - num2;
		} else if(op.equals("*")){
			return num1 * num2;
		} else if(op.equals("+")) {
			return num1 + num2;
		} else if(op.equals("/")) {
			return  num1 / num2;
		}
		// ��� ���鿡 ���� ������ �־�� �Ѵ�!
		return 0;
	}
}
