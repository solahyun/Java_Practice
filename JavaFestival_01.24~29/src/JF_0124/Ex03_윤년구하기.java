package JF_0124;
import java.util.Scanner;

public class Ex03_À±³â±¸ÇÏ±â {

	// À±³â : 2¿ù¿¡ 29ÀÏÀÌ ÀÖ´Â ³¯
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("³âµµ ÀÔ·Â >> ");
		int year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â ¾Æ´Ô");
		}
	}
}
