
public class Ex01_�����2 {

	public static void main(String[] args) {

		// 1�� ���
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2�� ���
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
