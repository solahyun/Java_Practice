import java.util.Iterator;
import java.util.Scanner;

public class Ex02_BinarySearch_Method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("찾고자 하는 숫자를 입력 : ");
		int sNum = sc.nextInt();

		// 문제) BinarySearch라는 이름의 메서드를 만들고
		// searchNumber를 입력받아 해당 번호를 찾게 만드시오.

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
				System.out.println(sNum + "은(는) " + (mid + 1) + "번째 인덱스에 있습니다.");
				isChk = false;
				break;
			} else if (arr[mid] < sNum) {
				lowIdx = mid + 1;
			} else if (arr[mid] > sNum) {
				highIdx = mid - 1;
			}
		}
		if (isChk == true) {
			System.out.println(sNum + "은(는) 존재하지 않습니다.");
		}
	}
}
