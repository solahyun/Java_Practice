package JF_0128;

import java.util.Random;

public class Ex01_�迭_����ū�� {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.print("�迭�� �ִ� ��� �� : ");
		int[] arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(60) + 1;
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
	}

}
