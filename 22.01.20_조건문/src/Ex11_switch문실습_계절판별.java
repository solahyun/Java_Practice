import java.util.Scanner;

public class Ex11_switch문실습_계절판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 12, 1, 2: // 자바 8버전 이상부터 가능
			System.out.println(month + "월은 겨울입니다!");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다!");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다!");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가을입니다!");
			break;
		default:
			System.out.println("정확한 숫자를 입력해주세요!");
		}
	}
}