import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// ����ڰ� �Է��� �����Ͱ� �����ϱ�
		// Ű���带 ����� ����� �Է°� �ޱ�
		
		// 1. �Է��� �� �ִ� Ű���� ��� �ҷ�����
		// - sc�� Scanner�� �����ϰ� �θ� ��Ī
		// - Scanner�� �ҷ��� �� �� import �۾� �����ϱ�
		// �ڵ� �ϼ� : Ctrl + Shift + O
		Scanner sc = new Scanner(System.in); 
		
		// ln : ����(Enter)
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("�Էµ� ���ڴ� : " + num);
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		
		System.out.println("�Էµ� �̸��� : " + name);
		
//		������ �Է� �ޱ�
//		sc.nextInt();
//		������ �Է� �ޱ�
//		sc.next();
	}

}
