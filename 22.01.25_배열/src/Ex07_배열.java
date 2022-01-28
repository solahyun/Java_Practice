import java.util.Random;

public class Ex07_배열 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] lotto = new int[5];

		// 입력부 -> 랜덤 숫자 넣음
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			
			// 중복된 숫자인지 아닌지 검사!
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					// 인덱스 값을 이전으로 돌리자.
					i--;
			}
		}

		// 출력부
		System.out.println("======= 로또타임 =======");
		System.out.println("!!! 이번주 출력번호는요 !!!");
		System.out.print("    ");
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");			
		}
	}
}

