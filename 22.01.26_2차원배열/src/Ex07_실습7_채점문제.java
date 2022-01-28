import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_실습7_채점문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 3행 5열의 이차원 배열을 선언 및 생성 -> 배열 초기화
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };

		// 입력부 
		// 인덱스 answer[1][i]에 접근.
		for (int i = 0; i < answer[1].length; i++) {
			System.out.print((i + 1) + "번째 답 >> ");
			answer[1][i] = sc.nextInt();
		}

//		for(int i =0; i<answer.length; i++) {
//			System.out.println(Arrays.toString(answer[i]));
//		}
//		System.out.println();

		// 배점을 합산한 값을 저장할 변수 선언
		int sum = 0;
		
		// 정답 비교하기
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("O" + "\t");
				sum += answer[2][i];
			} else {
				System.out.print("X" + "\t");
			}
		}
		System.out.println();
		System.out.print("총점:" + sum + "점");
	}
}
