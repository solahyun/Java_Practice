package ������;

public class Ex04_�Ǻ���ġ���� {

	public static void main(String[] args) {

		// �Ǻ���ġ ����
		// 1 1 2 3 5 8 13 ...
		
		// 10��°�� �Ǻ���ġ ������ �ִ� ���� ������ִ� �޼���
		// ����Լ�
		fibonacci();
	}
	
	public static int function(int a) {
		System.out.println(a);
		return function(5);
	}

	public static void fibonacci() {
		System.out.println("�Ǻ���ġ ����");
		int[] arr = new int[10];
		int sum = 0;
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length+1; j++) {
				sum = arr[i]+arr[j];
				str += sum;
			}
			sum = 0;
		}
		System.out.println(str);
	}
}
