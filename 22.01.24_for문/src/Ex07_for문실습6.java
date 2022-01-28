import java.util.Scanner;

public class Ex07_for문실습6 {

	public static void main(String[] args) {

		// 입력받은 정수의 약수를 구해서 출력
		// 약수 : 정수를 나누어 떨어지게 하는 수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				// \t -> tab을 해서 출력해주는 명령문
				// \n -> println과 같은 역할
				System.out.print(i + "\t");

			}
		}
	}

}
