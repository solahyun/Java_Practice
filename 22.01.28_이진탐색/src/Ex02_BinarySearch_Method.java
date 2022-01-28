import java.util.Iterator;
import java.util.Scanner;

public class Ex02_BinarySearch_Method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ã���� �ϴ� ���ڸ� �Է� : ");
		int sNum = sc.nextInt();

		// ����) BinarySearch��� �̸��� �޼��带 �����
		// searchNumber�� �Է¹޾� �ش� ��ȣ�� ã�� ����ÿ�.

		binarySearch(sNum);
	}

	public static void binarySearch(int sNum) {
		int[] arr = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		int lowIdx = 0;
		int highIdx = arr.length - 1;
		int mid;
		boolean isChk = true;

		while (lowIdx <= highIdx) {
			mid = (lowIdx + highIdx) / 2;
			if (arr[mid] == sNum) {
				System.out.println(sNum + "��(��) " + (mid + 1) + "��° �ε����� �ֽ��ϴ�.");
				isChk = false;
				break;
			} else if (arr[mid] < sNum) {
				lowIdx = mid + 1;
			} else if (arr[mid] > sNum) {
				highIdx = mid - 1;
			}
		}
		if (isChk == true) {
			System.out.println(sNum + "��(��) �������� �ʽ��ϴ�.");
		}
	}
}
