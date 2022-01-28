import java.util.Scanner;

public class Ex03_while문실습2_점수입력 {

	public static void main(String[] args) {
		// 0~100까지의 점수를 계속 입력받다가
		// 범위를 벗어나는 수가 입력되면 그 이전까지 입력된
		// 자료의 합계와 평균을 출력하는 프로그램
		// 벗어나는 수가 입력되면 종료 : 벗어난 수는 제외

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();

			sum += num;
			cnt++;
			if (num < 0 || num > 100) {
				sum -= num;
				cnt--;
				break;
			}
		}
		float avg = sum / (float)cnt;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
