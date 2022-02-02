package JF_0128;

import java.util.Random;

public class Ex02_중복없는로또 {

	public static void main(String[] args) {

		Random r = new Random();
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45)+1;
		
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("행운의숫자 : " + arr[i]);
			System.out.println();			
		}
	}
}
