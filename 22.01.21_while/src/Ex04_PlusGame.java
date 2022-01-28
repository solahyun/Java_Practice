import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex04_PlusGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("====== PLUS GAME ======");
		System.out.println("난이도를 선택하세요 (1 또는 2)");
		System.out.print(">> ");
		int mode = 0;

		try {
			mode = sc.nextInt();

			while (!(mode == 1) && !(mode == 2)) {
				JOptionPane.showMessageDialog(null, "숫자를 입력하세요(1 또는 2)!", "Error", JOptionPane.WARNING_MESSAGE);
				System.out.println("다시 난이도를 선택하세요 (1 또는 2)");
				System.out.print(">> ");
				mode = sc.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닙니다. 숫자를 입력해주세요!");
			System.out.println("프로그램 종료!");
		}

		int sum = 0;
		String A = "";

		switch (mode) {
		case 1:
			System.out.println("[ 초급 난이도 ]");

			int num1 = r.nextInt(10) + 1;
			int num2 = r.nextInt(10) + 1;
			int result1 = num1 + num2;

			System.out.print(num1 + " + " + num2 + " = ");
			int input1 = sc.nextInt();

			while (true) {
				while (result1 == input1) {
					sum++;
					System.out.println("정답이에요 " + "(" + sum + "점)");

					num1 = r.nextInt(10) + 1;
					num2 = r.nextInt(10) + 1;
					System.out.print(num1 + " + " + num2 + " = ");

					input1 = sc.nextInt();
					result1 = num1 + num2;
				}

				System.out.print("오답이에요. 계속 하시겠습니까? >> ");
				A = sc.next();

				switch (A) {
				case "y":
				case "Y":
					System.out.print(num1 + " + " + num2 + " = ");
					input1 = sc.nextInt();
					result1 = num1 + num2;
					break;

				case "n":
				case "N":
					System.out.println("다음에 다시 만나요!");
					System.out.println("인쌤티비 : https://www.youtube.com/channel/UCubIpLB7cA9tWIUZ26WFKPg");

					JOptionPane.showMessageDialog(null, "최종 점수 : " + sum + "점!!!", "점수 확인",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				default:
					System.out.println("정확한 문자를 입력하세요.");
				}
				if (A.equals("n") || A.equals("N"))
					break;
			}
			break;

		case 2:
			System.out.println("[ 중급 난이도 ]");

			int num3 = r.nextInt(20) + 1;
			int num4 = r.nextInt(20) + 1;
			int result2 = num3 + num4;

			System.out.print(num3 + " + " + num4 + " = ");
			int input2 = sc.nextInt();

			while (true) {

				A = "";
				while (result2 == input2) {
					sum += 2;
					System.out.println("정답이에요! (+2점)");

					num3 = r.nextInt(20) + 1;
					num4 = r.nextInt(20) + 1;
					System.out.print(num3 + " + " + num4 + " = ");

					input2 = sc.nextInt();
					result2 = num3 + num4;

				}

				System.out.print("오답이에요! (-1점) 계속 하시겠습니까? >> ");
				sum -= 1;
				A = sc.next();

				switch (A) {
				case "y":
				case "Y":
					System.out.print(num3 + " + " + num4 + " = ");
					input2 = sc.nextInt();
					result2 = num3 + num4;
					break;

				case "n":
				case "N":
					System.out.println("다음에 다시 만나요!");
					System.out.println("인쌤티비 : https://www.youtube.com/channel/UCubIpLB7cA9tWIUZ26WFKPg");

					JOptionPane.showMessageDialog(null, "최종 점수 : " + sum + "점!!!", "점수 확인",
							JOptionPane.INFORMATION_MESSAGE);
					break;

				default:
					System.out.println("정확한 문자를 입력하세요.");
				}
				if (A.equals("n") || A.equals("N"))
					break;
			}
			break;
		}
	}
}
