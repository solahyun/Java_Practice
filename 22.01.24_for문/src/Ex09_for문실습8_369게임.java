
public class Ex09_for���ǽ�8_369���� {

	public static void main(String[] args) {
		// 1�� �ڸ��� 369 => "�ڼ�"
		// 1�� �ڸ��� 5�� �� =? "����"

		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("�ڼ�!");
			} else if (i % 10 == 5) {
				System.out.println("����~");
			} else {
				System.out.println(i);
			}
		}
	}
}
