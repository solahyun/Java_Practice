
public class Ex03_for���ǽ�2_�Ųٷ���� {

	public static void main(String[] args) {

		// 97~53���� ���
		for (int i = 97; i >= 53; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// 21~57���� �� �� Ȧ���� ���
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
