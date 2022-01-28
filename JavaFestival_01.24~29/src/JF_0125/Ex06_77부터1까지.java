package JF_0125;

public class Ex06_77부터1까지 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 77; i++) {
			sum += (78 - i) * i;
//			식 출력
//			System.out.print("(" + (78 - i) + "*" + i + ")");
//			if (i == 77) {
//				break;
//			}
//			System.out.print(" + ");
		}
//		System.out.println();
		System.out.println(sum);
	}
}
