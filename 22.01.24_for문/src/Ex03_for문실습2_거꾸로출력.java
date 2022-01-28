
public class Ex03_for문실습2_거꾸로출력 {

	public static void main(String[] args) {

		// 97~53까지 출력
		for (int i = 97; i >= 53; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// 21~57까지 수 중 홀수만 출력
		for (int i = 21; i <= 57; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}

}
