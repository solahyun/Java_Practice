import java.util.Scanner;

public class Ex03_�迭 {

	public static void main(String[] args) {

		// �츮�� �Է��ϴ� ��(������)�� �迭�� �־��.
		// �迭�� ũ��� 5
		// �迭�� Ÿ���� ������
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.print("�Է� : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("��� : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
