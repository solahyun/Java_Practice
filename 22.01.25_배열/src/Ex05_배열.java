import java.util.Random;

public class Ex05_�迭 {

	public static void main(String[] args) {

		// ������ ���� �����Ϳ� �־�����
	      Random random = new Random();
	      // 1~30�� ���� ���� �迭�� ���� �غ���!
	      int[] arr = new int[10];
	      // ������Ÿ���� �迭�� ũ�� 10�� ��������
	      // int min = arr[0]; <- 0�� ���ԵǾ��־��
	      // �迭�� ó���� �������� ���� �迭�ȿ��� '0'���� �ʱ�ȭ �Ǿ��ִ�.
	      
	      // ���� ���� �Է�
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = random.nextInt(30)+1;
	      }
	      
	      // ��º�
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      
	      // �迭�� �������� ���� ��� �Ŀ� min������ arr[0]���� �������.
	      int min = arr[0];
	      
	      // �� ���� �߿��� ���� ���� �� ã��
	      for (int i = 0; i < arr.length; i++) {
	         if(min>arr[i]) {
	            min = arr[i];
	         }
	      }
	      System.out.println("���� ���� ���� "+min+"�Դϴ�.");
	      // �׸��� �� ������ ���� �߿��� ���� ���� ���� ã�Ƽ� ����غ���
	      // " ���� ���� ���� ___ �Դϴ�."
		
		
		
		
		// ������ ���� �����Ϳ� �־�����
		// 1~30�� ���� ���� �迭�� ��������
		// ������ Ÿ���� �迭�� ũ�� 10�� ��������
		// ������ ���� �߿��� ���� ���� ���� ã�Ƽ� ����غ���
		// ��� ����)
		// "���� ���� ���� ____ �Դϴ�."

//		Random r = new Random();
//		int arr[] = new int[10];
//		// �迭�� ���� ��� ������ �ʱ�ȭ
//		int min = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(30) + 1;
//			System.out.print(arr[i] + " ");
//			if (arr[min] > arr[i]) {
//				min = i;
//			}
//		}
//
//		System.out.println();
//		System.out.println("���� ���� ���� " + arr[min] + "�Դϴ�.");
		
	}

}
