import java.util.Arrays;

public class Ex04_BubbleSort {

	public static void main(String[] args) {
		
		// Bubble Sort(버블 정렬)
		int[] arr = {45, 7, 12, 82, 25};
		
		// 내 풀이
//		int temp = arr[0];
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if(arr[i]<arr[j]) {
//					temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		
		 for(int i = arr.length - 1; i > 0; i--) {
	         for(int j = 0; j < i; j++) {
	            if(arr[j] > arr[j + 1]) {
	               int temp = arr[j];
	               arr[j] = arr[j + 1];
	               arr[j + 1] = temp;
	            }
	         }
	      }
		
		System.out.println(Arrays.toString(arr));
	}
}
