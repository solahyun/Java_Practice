
public class Ex01_�迭 {

	public static void main(String[] args) {
		
		// �迭 : ���� Ÿ���� �����͸� �ս��� �����ϱ� ���� �� �� �ִ� ���
		
		// 1. �迭 ����
		String[] campus = new String[5];
		// �ּҰ�
		System.out.println(campus);
		// �迭�� �ϳ��ϳ��� �����ϱ� ����
		campus[0] = "�ں�����";
		campus[1] = "�赿����";
		campus[2] = "���ڿ���";
		System.out.println(campus[2]);
		System.out.println(campus[3]);
		
		// �迭�� �����͸� �ִ� ���(�ʱ�ȭ)
		int[] arr = {1, 2, 3, 4, 5};
		
		// �迭�� ũ�� ���� ��� -> length
		System.out.println("�迭�� ũ�� : " + arr.length);
		
		// ���� ���� �迭 for�� �ڵ��ϼ�!!!
		// : for + (Ctrl + Space bar) > ���� 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
