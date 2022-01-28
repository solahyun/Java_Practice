import java.util.Iterator;

public class Ex05_½Ç½À5 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = num;
				num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/*
45	40	35	30	25	
44	39	34	29	24	
43	38	33	28	23	
42	37	32	27	22	
41	36	31	26	21	
*/