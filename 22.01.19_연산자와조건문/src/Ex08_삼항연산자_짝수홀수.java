import java.util.Scanner;

public class Ex08_���׿�����_¦��Ȧ�� {
	
	public static void main(String[] args) {
		// ���ڸ� �Է¹޾Ƽ� Ȧ������ ¦������ �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		
		// �Է��� ���� Ȧ�� -> Ȧ���Դϴ�.
		// ¦�� -> ¦���Դϴ�.
		String res = num%2==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println(res);
	}

}
