import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_�ǽ�7_ä������ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 3�� 5���� ������ �迭�� ���� �� ���� -> �迭 �ʱ�ȭ
		int[][] answer = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };

		// �Էº� 
		// �ε��� answer[1][i]�� ����.
		for (int i = 0; i < answer[1].length; i++) {
			System.out.print((i + 1) + "��° �� >> ");
			answer[1][i] = sc.nextInt();
		}

//		for(int i =0; i<answer.length; i++) {
//			System.out.println(Arrays.toString(answer[i]));
//		}
//		System.out.println();

		// ������ �ջ��� ���� ������ ���� ����
		int sum = 0;
		
		// ���� ���ϱ�
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[0][i] == answer[1][i]) {
				System.out.print("O" + "\t");
				sum += answer[2][i];
			} else {
				System.out.print("X" + "\t");
			}
		}
		System.out.println();
		System.out.print("����:" + sum + "��");
	}
}
