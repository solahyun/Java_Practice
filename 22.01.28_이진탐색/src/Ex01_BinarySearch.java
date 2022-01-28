import java.util.Iterator;
import java.util.Scanner;

public class Ex01_BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		System.out.print("찾고자 하는 숫자를 입력 : ");
		int sNum = sc.nextInt();

		// 문제) BinarySearch를 직접 구현해서
		// sNum가 몇 번째 인덱스에 있는지 찾아내자.
		// 출력 예시)
		// 78 입력 -> 78은 8번째 인덱스에 있습니다.
		// 100 입력 -> 100은 존재하지 않습니다.

		int l, h, m;
		l = 0;
		h = arr.length - 1;
//		boolean isCheck = false;

		while (l <= h) {
			m = (l + h) / 2;
			if (sNum == arr[m]) {
				System.out.println(sNum + "은(는) " + (m + 1) + "번째 인덱스에 있습니다.");
//				isCheck = true;
				break;
			} else if (sNum > arr[m]) {
				l = m + 1;
			} else if (sNum < arr[m]){
				h = m - 1;
			} else if (l == h) {
				System.out.println(sNum + "은(는) 존재하지 않습니다!!!");
			}
		}

		

		System.out.println("답 풀이 >> ");
		// Hint!
		// lowIdx, highIdx 필요
		// 반복문을 찾는데 몇 번의 반복이 일어나는지 모르기 때문에 -> while문
		int lowIdx = 0; // 배열 안에서 가장 낮은 인덱스 번호를 저장할 변수
		int highIdx = arr.length - 1; // 배열 안에서 가장 높은 인덱스 번호 저장할 변수
		int mid; // 배열 안에서 가운데 위치한 인덱스 번호를 저장할 변수
		boolean isChk = true; // 찾고자 하는 값이 있는지 유무 판단 변수
		while (lowIdx <= highIdx) {
			mid = (lowIdx + highIdx) / 2;
			if (arr[mid] == sNum) {
				System.out.println(sNum + "은(는) " + (mid+1) + "에 있습니다.");
				isChk = false;
				break;
			} else if (arr[mid] < sNum) {
				lowIdx = mid + 1;
			} else if (arr[mid] > sNum) {
				highIdx = mid - 1;
			} else {
				System.out.println("ㅎㅎㅎ");
			}
		}
		if (isChk == true) {
			System.out.println(sNum + "은(는) 존재하지 않습니다.");
		}

	}
}
