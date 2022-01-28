import java.util.Arrays;

public class Ex04_½Ç½À4 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

/*
25	24	23	22	21	
30	29	28	27	26	
35	34	33	32	31	
40	39	38	37	36	
45	44	43	42	41
*/