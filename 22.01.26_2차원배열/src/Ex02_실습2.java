
public class Ex02_½Ç½À2 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

/*
21	22	23	24	25	
26	27	28	29	30	
31	32	33	34	35	
36	37	38	39	40	
41	42	43	44	45	
*/