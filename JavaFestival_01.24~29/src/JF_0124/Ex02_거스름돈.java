package JF_0124;
import java.util.Scanner;

public class Ex02_거스름돈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int money = sc.nextInt();

		System.out.println("잔돈변환");

		int ch1 = money / 10000;
		int ch2 = money % 10000 / 5000;
		int ch3 = money % 10000 % 5000 / 1000;
		int ch4 = money % 10000 % 5000 % 1000 / 500;
		int ch5 = money % 10000 % 5000 % 1000 / 500 % 100;

		System.out.println("10000원 : " + ch1 + "개");
		System.out.println("5000원 : " + ch2 + "개");
		System.out.println("1000원 : " + ch3 + "개");
		System.out.println("500원 : " + ch4 + "개");
		System.out.println("100원 : " + ch5 + "개");
	}

}
