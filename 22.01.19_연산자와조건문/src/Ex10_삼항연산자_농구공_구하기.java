import java.util.Scanner;

public class Ex10_���׿�����_�󱸰�_���ϱ� {

	public static void main(String[] args) {
		
		// �󱸰� �ڽ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int ball = sc.nextInt();
		int box = 5;
		
		int res = (ball%box)==0 ? ball/box : ball/box+1;
		
		System.out.print("�ʿ��� ������ �� : "+res);
		
	}

}
