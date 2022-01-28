import java.util.Scanner;

public class Ex03_배열 {

	public static void main(String[] args) {

		// 우리가 입력하는 수(데이터)를 배열에 넣어보자.
		// 배열의 크기는 5
		// 배열의 타입은 정수형
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.print("입력 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("출력 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
