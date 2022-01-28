import java.util.Scanner;

public class Ex04_if문실습3_합불출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int calc = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("데이터통신 : ");
		int data = sc.nextInt();
		System.out.print("소트프웨어공학 : ");
		int sw = sc.nextInt();

		// 첫 번째 조건 : 각 과목이 최소 8개 이상은 맞아야 함
		boolean check1 = db >= 8 && calc >= 8 && os >= 8 && data >= 8 && sw >= 8;
		// 두 번째 조건 : 각 과목의 총합이 60개 이상
		boolean check2 = (db + calc + os + data + sw) >= 60;

		if (check1 && check2) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
	}
}
