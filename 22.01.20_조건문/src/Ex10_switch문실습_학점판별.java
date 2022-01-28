import java.util.Scanner;

public class Ex10_switch문실습_학점판별 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();

		switch (totalScore / 10) {
		case 10:  // 그대로 break문 만나기 전까지 실행
		case 9:
			System.out.println("A학점입니다!");
			break;
		case 8:
			System.out.println("B학점입니다!");
			break;
		case 7:
			System.out.println("C학점입니다!");
			break;
		default:
			System.out.println("D학점입니다!");
		}
	}
}
