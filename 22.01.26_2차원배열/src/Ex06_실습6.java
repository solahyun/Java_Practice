
public class Ex06_�ǽ�6 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				// ¦���϶� ���ʿ��� ���������� num ����Ű�鼭 ����
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}

			} else {
				 // ¦���϶� ���ʿ��� ���������� num ����Ű�鼭 ����
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
		}

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

/*
21	22	23	24	25	
30	29	28	27	26	
31	32	33	34	35	
40	39	38	37	36	
41	42	43	44	45	
*/
