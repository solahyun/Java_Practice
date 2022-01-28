
public class Ex01_별찍기2 {

	public static void main(String[] args) {

		// 1번 방법
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2번 방법
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
