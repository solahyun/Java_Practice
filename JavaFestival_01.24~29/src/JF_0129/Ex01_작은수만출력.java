package JF_0129;

import java.util.Scanner;

public class Ex01_����������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] n = new int[sc.nextInt()];
		System.out.print("X �Է� >> ");
		int x = sc.nextInt();
			
		for (int i = 0; i < n.length; i++) {
			System.out.print((i+1) + "��° ���� �Է� >> ");
			n[i] = sc.nextInt();
		}		
		
		System.out.print("��� >> ");
		for (int i = 0; i < n.length; i++) {
			if(x > n[i]) {
				System.out.print(n[i] + " ");
			}			
		}
	}
}
