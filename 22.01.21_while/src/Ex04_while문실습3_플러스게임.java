import java.util.Random;
import java.util.Scanner;

public class Ex04_while문실습3_플러스게임 {

	public static void main(String[] args) {
		// Plus Game : 두 개의 숫자를 더한 값을 맞추는 게임
		// 랜덤의 숫자를 추출하는 방법

		// 게임은 계속해서 실행되어야 한다.
		// 1. 정답 X : 사용자에게 "계속하시겠습니까?" 물어봄
		// 1-1. "계속하시겠습니까?"에서 "Y" 입력하면, 이전 틀렸던 문제가 다시 나옴
		// 1-2. "계속하시겠습니까?"에서 "N" 입력하면, 게임은 종료됨
		// 2. 정답 O : 기존 문제가 아닌 새로운 문제가 출력
		// 3. 팀별로 개성이 있는 추가 기능을 달아주세요.(BONUS!) - 상품 커피쿠폰
		// 랭킹, 생명, 안 배운 부분도 추가해도 됨!

		Random r = new Random(); // 레퍼런스 타입
		Scanner sc = new Scanner(System.in);

		System.out.println("==== PLUS GAME ====");
		// 각 변수 안에 랜덤의 숫자를 추출해서 넣는 코드
		int num1 = r.nextInt(10) + 1; // 0~9까지 + 1
		int num2 = r.nextInt(10) + 1;
		// 정답을 저장할 변수
		int result = num1 + num2;

		while (true) {
			// 사용자에게 문제를 제시하고 답을 입력받는 코드
			System.out.print("   ");
			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();
			result = num1 + num2;

			if (result == input) {
				System.out.println(">> 정답!!!");
				num1 = r.nextInt(10) + 1;
				num2 = r.nextInt(10) + 1;
			} else {
				System.out.println(">> 실패!!!");
				System.out.print("계속하시겠습니까? ");
				String answer = sc.next();

				if (answer.equals("Y")) {
					// 반복문 계속해서 진행
					// while문 처음으로 돌아가게 하는 키워드 -> continue
				} else if (answer.equals("N")) {
					break;
				} else {
					System.out.println("Y/N 중에 입력해주세요!");
					break;
				}
			}
		}
		System.out.println("===== THE END =====");
	}
}
