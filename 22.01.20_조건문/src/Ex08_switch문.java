
public class Ex08_switch�� {

	public static void main(String[] args) {
		// switch(�� or ��) {
		// case ��1 :
		// ��1�� �� ������ �ڵ�;
		// case ��2 :
		// ��2�� �� ������ �ڵ�;

		// num�� ���� 1�̸� -> �ȳ��ϼ��� ���
		// 2�̸� -> �� ������ ���
		// 3�̸� -> �ݰ����ϴ� ���
		// �̿� -> �� ������ ���

		int num = 11;

		switch (num-10) {
		case 1:
			System.out.println("�ȳ��ϼ���");
			break; // ����� �߰�ȣ ���������� Ű����
		case 2:
			System.out.println("�� ������");
			break;
		case 3:
			System.out.println("�ݰ����ϴ�");
			break;
		default:
			System.out.println("�� ������><");
			break; // �� �ᵵ ����
		}
	}

}
