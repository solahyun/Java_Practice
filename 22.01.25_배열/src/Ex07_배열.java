import java.util.Random;

public class Ex07_�迭 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] lotto = new int[5];

		// �Էº� -> ���� ���� ����
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			
			// �ߺ��� �������� �ƴ��� �˻�!
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					// �ε��� ���� �������� ������.
					i--;
			}
		}

		// ��º�
		System.out.println("======= �ζ�Ÿ�� =======");
		System.out.println("!!! �̹��� ��¹�ȣ�¿� !!!");
		System.out.print("    ");
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + " ");			
		}
	}
}

