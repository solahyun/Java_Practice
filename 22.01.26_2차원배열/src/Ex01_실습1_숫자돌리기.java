import java.util.Arrays;

public class Ex01_�ǽ�1_���ڵ����� {

	public static void main(String[] args) {

		// 5*5 ũ�⸦ ���� 2���� �迭 -> ������
		// 1 ~ 25���� �ʱ�ȭ
		int[][] arr = new int[5][5];

		// array[0][0]
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); // ����
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
