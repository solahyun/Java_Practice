import java.util.ArrayList;

public class Ex01_���� {

	public static void main(String[] args) {
		
		// �������� �迭�� ���� ���¸� ������ �ִ� Ŭ���� -> ArrayList
		// Collection(å 390p ����)
		
		// 1. ArrayList ����
		String s = "�ູ��";
		String a = new String("�ູ��");
		System.out.println(a);
		
		// ArrayList<������ ������ �ڷ���> ������ = new ArrayList<������ ������ �ڷ���>();
		// �� �ڿ� (); �� ���̱�!
		// ������ ������ �ڷ����� ���۷��� Ÿ���̾���Ѵ�.
		// String, Integer, Double... (�빮�ڷ� ����)
		// import ����� �Ѵ�! -> ���ǵ� ����� ������ �ͼ� ���
		
		ArrayList<String> list = new ArrayList<String>();
		
		// <> : ���׸� ���
		// - ArrayList�� �����ϴ� ������ ������ �ڷ����� �����ϴ� ���
		// ���۷��� ���� ����, ��ü ���¸��� ������ �� �ִ�.(�⺻�ڷ��� ���� X)
	
		// 2. ���� �߰��ϱ�
		// ���� �߰��ϴ� �޼��尡 ���������� ���谡 �Ǿ��ִ�.
		list.add("���");
		list.add("���");
		list.add("���");
		
		// 3. �� ��������
//		list.get(1);
		System.out.print(list.get(0));
		System.out.println(" �԰� �ʹ�!");
		
		// 4. �� �����ϱ�
		list.remove(0);
		// ����� ������� �ڿ� �ִ� ������ �ε����� ������ �̵�
		// ���� ���� �ε����� 0�� �ȴ�. -> ����� �ε��� ���� 1�� �̵�
		System.out.println(list.get(0));
		
		// 5. ���ϴ� ��ġ�� ���� �߰��ϱ�
		list.add(1, "ġŲ");
		
		// 6. ����Ǿ��ִ� �������� �� ũ�� ��������
		list.size();
		System.out.println(list.size());
		
		// 7. ��� ���� �����ϴ� ���
		list.clear();
		System.out.println(list.size());
	}
}
