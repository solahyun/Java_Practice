package JF_0127;

import java.util.Scanner;

public class Ex01_n��°�ױ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 1] + i;
			}
			System.out.print(arr[i] + " ");
		}
	}

}
