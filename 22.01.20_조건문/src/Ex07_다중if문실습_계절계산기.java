import java.util.Scanner;

public class Ex07_다중if문실습_계절계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();

		// (month==12||month==1||month==2)
		if (month == 12 || month <= 2) {
			System.out.println(month + "월은 겨울입니다!");
		} else if (month <= 5) {
			System.out.println(month + "월은 봄입니다!");
		} else if (month <= 8) {
			System.out.println(month + "월은 여름입니다!");
		} else if (month <= 11){
			System.out.println(month + "월은 가을입니다!");
		}
	}
}
