package JF_0124;
import java.util.Scanner;

public class Ex01_�ݿø� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();

		switch (num % 10) {
		case 0, 1, 2, 3, 4:
			num -= num % 10;
			break;
		case 5, 6, 7, 8, 9:
			num += 10 - num % 10;
			break;
		}
		System.out.println("�ݿø� �� �� : " + num);
	}
}
