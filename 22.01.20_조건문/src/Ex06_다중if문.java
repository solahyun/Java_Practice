import java.util.Scanner;

public class Ex06_다중if문 {

	public static void main(String[] args) {
		// 시험성적 점수 90점 이상이면 A
		// 89~80 B
		// 79~70 C
		// 69~60 D
		// 나머지 F
		Scanner sc = new Scanner(System.in);
		System.out.print("시험성적 입력 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A 학점");
		} else if (score >= 80) {
			System.out.println("B 학점");
		} else if (score >= 70) {
			System.out.println("C 학점");
		} else if (score >= 60) {
			System.out.println("D 학점");
		} else {
			System.out.println("F 학점");
		}
	}
}
