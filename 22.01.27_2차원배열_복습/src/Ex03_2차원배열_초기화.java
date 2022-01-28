import java.util.Arrays;

public class Ex03_2차원배열_초기화 {

	public static void main(String[] args) {

		// 다른 방법으로 이차원 배열 만들기
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
