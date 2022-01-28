import java.util.Scanner;

public class Ex05_for문실습4 {

	public static void main(String[] args) {

		// 사용자에게 한 개의 자연수를 입력받아서
		// 입력받은 수의 배수를 차례로 10개 출력하는 프로그램
		// 예) 5 -> 5 10 15 20 25 30 35 40 45 50

		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}

	}

}
