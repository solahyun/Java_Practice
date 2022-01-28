import java.util.Arrays;
import java.util.Iterator;

public class Ex03_½Ç½À3 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int num = 21;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
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
//		System.out.println(Arrays.deepToString(arr));
	}
}

/*
21	26	31	36	41	
22	27	32	37	42	
23	28	33	38	43	
24	29	34	39	44	
25	30	35	40	45
*/