
public class Ex06_�������� {

	public static void main(String[] args) {
		// ���װ� ������ ������ ���ԵǴ��� �� �� �ִ� ������
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		int num4 = 6;
		
		// AND������ : �׸��� -> &&
		// ���װ� ������ ������� �� �� true -> ��� true
		// �������� �� false
		System.out.println(num1<num2 && num3<num4); //t
		System.out.println(num1>num2 && num3<num4); //f

		// OR������ : �Ǵ� -> ||
		// ���װ� ���� �� �� �ϳ��� true -> ��� true
		// �� �� false��� -> ��� false
		System.out.println(num1>num2 || num3<num4); //t
		System.out.println(num1>num2 || num3>num4); //f
		
		// NOT������
		// boolean ���� �ݴ�� ������ ��
		System.out.println(!(num1>num2)); //t
	}

}
