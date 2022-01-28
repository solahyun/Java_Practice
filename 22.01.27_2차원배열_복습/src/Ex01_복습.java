import java.util.Iterator;

public class Ex01_복습 {

	public static void main(String[] args) {

		// 2차원 배열
		// - 1차원 배열 안에 배열이 또 들어가 있는 형태

		// 문제 : 숫자돌리기
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