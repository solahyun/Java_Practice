package JF_0124;
import java.util.Scanner;

public class Ex02_�Ž����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����ݾ� : ");
		int money = sc.nextInt();

		System.out.println("�ܵ���ȯ");

		int ch1 = money / 10000;
		int ch2 = money % 10000 / 5000;
		int ch3 = money % 10000 % 5000 / 1000;
		int ch4 = money % 10000 % 5000 % 1000 / 500;
		int ch5 = money % 10000 % 5000 % 1000 / 500 % 100;

		System.out.println("10000�� : " + ch1 + "��");
		System.out.println("5000�� : " + ch2 + "��");
		System.out.println("1000�� : " + ch3 + "��");
		System.out.println("500�� : " + ch4 + "��");
		System.out.println("100�� : " + ch5 + "��");
	}

}
