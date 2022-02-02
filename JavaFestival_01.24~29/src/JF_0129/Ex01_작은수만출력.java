package JF_0129;

import java.util.Scanner;

public class Ex01_작은수만출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] n = new int[sc.nextInt()];
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
			
		for (int i = 0; i < n.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 >> ");
			n[i] = sc.nextInt();
		}		
		
		System.out.print("결과 >> ");
		for (int i = 0; i < n.length; i++) {
			if(x > n[i]) {
				System.out.print(n[i] + " ");
			}			
		}
	}
}
