import java.util.Arrays;

public class Ex05_SelectionSort {

	public static void main(String[] args) {

		// Selection Sort(선택 정렬)
		// 버블 정렬보다 효율적
		// 기준점 정하기
		// 인덱스 찾기 -> 가장 큰 수의 인덱스 찾기

		int[] arr = { 45, 7, 12, 82, 25 };
		int maxIndex = 0; // 큰 값의 인덱스를 저장할 변수
		int temp = 0; // 치환할 때 임시 값을 저장하는 변수
		
		/*
		for(arr[maxIndex] < arr[1]) {
			maxIndex = 1;
		}
		int temp = arr[i]
				arr[maxIndex]=arr[i];
		arr[maxIndex]=temp;
		*/
		
		// 내 풀이
//		for (int i = 0; i < arr.length; i++) {
//			maxIndex = 0;
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[maxIndex] < arr[j]) {
//					maxIndex = j;
//				}
//				temp = arr[j + 1];
//				arr[j + 1] = arr[maxIndex];
//				arr[maxIndex] = temp;
//			}
//		}
		
		  for(int i = arr.length; i > 1; i--) {
		         maxIndex = 0; // 회차진행시 기준점 초기화
		         for (int j = 1; j < i; j++) {
		            if (arr[maxIndex] < arr[j]) {
		               maxIndex = j;
		            }
		         }
		         temp = arr[i - 1];
		         arr[i - 1] = arr[maxIndex];
		         arr[maxIndex] = temp;
		      }	
		
		System.out.println(Arrays.toString(arr));
	}
}
