import java.util.Arrays;

public class Ex03_2�����迭_�ʱ�ȭ {

	public static void main(String[] args) {

		// �ٸ� ������� ������ �迭 �����
		// 1 2 3
		// 4 5 6
		// 7 8 9
		int [][] array = { {1, 2, 3}, 
						   {4, 5, 6}, 
						   {7, 8, 9} };
		int[][] array2 = { {1}, {2, 3}, {4, 5, 6} };
		
		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.deepToString(array2));
	}

}
