import java.util.Scanner;

public class Ex06_����if�� {

	public static void main(String[] args) {
		// ���輺�� ���� 90�� �̻��̸� A
		// 89~80 B
		// 79~70 C
		// 69~60 D
		// ������ F
		Scanner sc = new Scanner(System.in);
		System.out.print("���輺�� �Է� : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A ����");
		} else if (score >= 80) {
			System.out.println("B ����");
		} else if (score >= 70) {
			System.out.println("C ����");
		} else if (score >= 60) {
			System.out.println("D ����");
		} else {
			System.out.println("F ����");
		}
	}
}
