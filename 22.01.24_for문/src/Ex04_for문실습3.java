
public class Ex04_for���ǽ�3 {

	public static void main(String[] args) {

		// 1~100������ �� �߿��� 3�� ����� ���
		// 3�� ������� �ƴ��� �Ǵ� -> ���ǹ�
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// 3�� �����ŭ�� �������� ������Ű��
//		for(int i=3; i<=100; i+=3) {
//			System.out.println(i);
//		}
//		
//		for(int i=1; i<=99; i+=3) {
//			System.out.println(i+2);
//		}

		// 1~100������ �� �߿��� 3�� ���, 5�� ���
		// �� ���� ������ �����ϴ� �� ���
		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println(i);
//			}
			// 3�� 5�� �ּҰ���� : 15�� ���
			if (i % 15 == 0) {
				System.out.println(i);
			}

		}
	}
}
