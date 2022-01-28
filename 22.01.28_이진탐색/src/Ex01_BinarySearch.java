import java.util.Iterator;
import java.util.Scanner;

public class Ex01_BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		System.out.print("ã���� �ϴ� ���ڸ� �Է� : ");
		int sNum = sc.nextInt();

		// ����) BinarySearch�� ���� �����ؼ�
		// sNum�� �� ��° �ε����� �ִ��� ã�Ƴ���.
		// ��� ����)
		// 78 �Է� -> 78�� 8��° �ε����� �ֽ��ϴ�.
		// 100 �Է� -> 100�� �������� �ʽ��ϴ�.

		int l, h, m;
		l = 0;
		h = arr.length - 1;
//		boolean isCheck = false;

		while (l <= h) {
			m = (l + h) / 2;
			if (sNum == arr[m]) {
				System.out.println(sNum + "��(��) " + (m + 1) + "��° �ε����� �ֽ��ϴ�.");
//				isCheck = true;
				break;
			} else if (sNum > arr[m]) {
				l = m + 1;
			} else if (sNum < arr[m]){
				h = m - 1;
			} else if (l == h) {
				System.out.println(sNum + "��(��) �������� �ʽ��ϴ�!!!");
			}
		}

		

		System.out.println("�� Ǯ�� >> ");
		// Hint!
		// lowIdx, highIdx �ʿ�
		// �ݺ����� ã�µ� �� ���� �ݺ��� �Ͼ���� �𸣱� ������ -> while��
		int lowIdx = 0; // �迭 �ȿ��� ���� ���� �ε��� ��ȣ�� ������ ����
		int highIdx = arr.length - 1; // �迭 �ȿ��� ���� ���� �ε��� ��ȣ ������ ����
		int mid; // �迭 �ȿ��� ��� ��ġ�� �ε��� ��ȣ�� ������ ����
		boolean isChk = true; // ã���� �ϴ� ���� �ִ��� ���� �Ǵ� ����
		while (lowIdx <= highIdx) {
			mid = (lowIdx + highIdx) / 2;
			if (arr[mid] == sNum) {
				System.out.println(sNum + "��(��) " + (mid+1) + "�� �ֽ��ϴ�.");
				isChk = false;
				break;
			} else if (arr[mid] < sNum) {
				lowIdx = mid + 1;
			} else if (arr[mid] > sNum) {
				highIdx = mid - 1;
			} else {
				System.out.println("������");
			}
		}
		if (isChk == true) {
			System.out.println(sNum + "��(��) �������� �ʽ��ϴ�.");
		}

	}
}
