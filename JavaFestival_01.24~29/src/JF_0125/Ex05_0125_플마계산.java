package JF_0125;

public class Ex05_0125_플마계산 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				sum += i;
			} else {
				System.out.print("-" + i + " ");
				sum -= i;
			}
		}
		System.out.println();
		System.out.print("결과 : " + sum);
	}

}
