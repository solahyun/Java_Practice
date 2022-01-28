import java.util.Arrays;

public class Ex02_비정방형배열 {

	public static void main(String[] args) {

		int[][] array = new int[3][];

		array[0] = new int[1];
		array[1] = new int[2];
		array[2] = new int[3];
		System.out.println(Arrays.deepToString(array));
		
		int cnt = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

/*
1	
2	3	
4	5	6	
*/