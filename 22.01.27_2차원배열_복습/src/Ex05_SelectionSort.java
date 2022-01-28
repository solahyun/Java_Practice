import java.util.Arrays;

public class Ex05_SelectionSort {

	public static void main(String[] args) {

		// Selection Sort(���� ����)
		// ���� ���ĺ��� ȿ����
		// ������ ���ϱ�
		// �ε��� ã�� -> ���� ū ���� �ε��� ã��

		int[] arr = { 45, 7, 12, 82, 25 };
		int maxIndex = 0; // ū ���� �ε����� ������ ����
		int temp = 0; // ġȯ�� �� �ӽ� ���� �����ϴ� ����
		
		/*
		for(arr[maxIndex] < arr[1]) {
			maxIndex = 1;
		}
		int temp = arr[i]
				arr[maxIndex]=arr[i];
		arr[maxIndex]=temp;
		*/
		
		// �� Ǯ��
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
		         maxIndex = 0; // ȸ������� ������ �ʱ�ȭ
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
