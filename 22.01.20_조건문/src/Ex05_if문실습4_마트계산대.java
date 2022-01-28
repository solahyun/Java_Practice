import java.util.Scanner;

public class Ex05_if문실습4_마트계산대 {
	// 원래 상품 가격은 10000원
	// 11개 이상 구매 시는 10% 할인

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요.");
		int count = sc.nextInt();
		int gift = 10000;

		if (count >= 11) {
//			int res = gift * count - (int) (gift * count * 0.1);
			int res = (int)(gift * count * 0.9);
			System.out.println("가격은 " + res + "원 입니다.");
		} else {
			int res = gift * count;
			System.out.println("가격은 " + res + "원 입니다.");
		}
	}
}
