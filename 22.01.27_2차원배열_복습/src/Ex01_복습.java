import java.util.Iterator;

public class Ex01_���� {

	public static void main(String[] args) {

		// 2���� �迭
		// - 1���� �迭 �ȿ� �迭�� �� �� �ִ� ����

		// ���� : ���ڵ�����
		int[][] arr = new int[5][5];
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
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
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25	
*/