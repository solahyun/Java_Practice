// ����. ���� num�� �����ϰ� Ű����κ��� ������ �Է� ����
// ���� num�� ���� 3�� ����̸鼭 5�� ������
// -> (��� ����) 00�� 3�� 5�� ����Դϴ�. 
// �ƴ϶�� -> (��� ����) 00�� 3�� 5�� ����� �ƴմϴ�. 

import java.util.Scanner;

public class Ex02_if���ǽ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + "�� 3�� 5�� ����Դϴ�.");
		} else {
			System.out.println(num + "�� 3�� 5�� ����� �ƴմϴ�.");
		}
	}
}
// 2.
//		if (num%3==0){
//			if(num%5==0) {
//				System.out.println(num + "�� 3�� 5�� ����Դϴ�.");
//			}
//		}
//3. 	if (num%15==0)
