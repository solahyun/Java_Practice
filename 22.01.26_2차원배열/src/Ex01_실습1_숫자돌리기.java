import java.util.Arrays;

public class Ex01_실습1_숫자돌리기 {

	public static void main(String[] args) {

		// 5*5 크기를 가진 2차원 배열 -> 정수형
		// 1 ~ 25까지 초기화
		int[][] arr = new int[5][5];

		// array[0][0]
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(); // 개행
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
