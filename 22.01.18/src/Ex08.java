// �ʸ� �Է¹޾� [��, ��, ��] ���·� ����ϼ���.

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		
//		�ð�, ��, �� �����ϱ�
//		1�� = 60��, 1�ð� = 3600��
		int hour = totalSecond/3600;
		int min = totalSecond%3600/60;
		int sec = totalSecond%60;
//		int sec = totalSecond%3600%60; 
		
		System.out.println(hour+"�� "+min+"�� "+sec+"��");
		
		sc.close();
	}

}
