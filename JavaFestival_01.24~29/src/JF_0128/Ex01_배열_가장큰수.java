package JF_0128;

import java.util.Random;

public class Ex01_배열_가장큰수 {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.print("배열에 있는 모든 값 : ");
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
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
