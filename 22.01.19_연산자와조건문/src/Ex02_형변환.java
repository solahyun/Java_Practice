
public class Ex02_����ȯ {

	public static void main(String[] args) {
		// �ڵ�����ȯ -> ���� ������ Ÿ���� ū ������ Ÿ������ ���� ����
		byte num1 = 10;
		int num2 = num1;
		
		// ��������ȯ -> ū ������ Ÿ�Կ��� ���� ������ Ÿ������ ��ȯ�ϴ� ����
		int num3 = 300; // 4byte
		byte num4 = (byte)num3; // 1byte
		System.out.println(num4); // 44, overflow ������ ����
		
		// ���� 4byte�� �����ٰ� �ϴ��� java������ ���������� �Ǽ����� 
		// �� ū Ÿ���̶�� ����
		int num5 = 30;
		float num6 = num5;
		
		float num7 = 100.7f; // (float)100.7
		int num8 = (int)num7;
		System.out.println(num8); // 100
		 
		int num9 = 7;
		int num10 = 3;
		double num11 = 3.0;
		
		// ������ Ÿ�Գ��� ������ �� ��,
		// �� ū ������ Ÿ���� ���� ����� ������ �ȴ�.(�ڵ�����ȯ)
		System.out.println(num9/num10); // 2
		System.out.println(num9/num11); // 2.3333333333333335
	}
}
