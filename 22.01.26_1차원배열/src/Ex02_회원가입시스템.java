import java.util.Arrays;
import java.util.Scanner;

public class Ex02_회원가입시스템 {

	public static void main(String[] args) {

		// 회원가입 시스템
		// 로그인, 회원가입, 종료
		// 1. 회원가입 - ID, PW, NICK을 입력받아 각각 배열에 저장
		// 2. 로그인 - ID, PW 입력받아 일치하면 NICK님 환영합니다 출력
		// 3. 종료 - 프로그램 종료

		// 회원의 정보를 저장할 배열
		String[] ids = new String[5]; // id 저장 배열
		String[] pws = new String[5]; // pw 저장 배열
		String[] nicks = new String[5]; // nick 저장 배열

		Scanner sc = new Scanner(System.in);

		int point = 0;

		while (true) {

			System.out.print("1.회원가입 2.로그인 3.종료 >> ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (point < ids.length) {
					System.out.print("id 입력 : ");
					String id = sc.next();
					System.out.print("pw 입력 : ");
					String pw = sc.next();
					System.out.print("nick 입력 : ");
					String nick = sc.next();

					ids[point] = id;
					pws[point] = pw;
					nicks[point] = nick;

					point++;
				} else {
					System.out.println("더 이상 회원가입이 불가능합니다!");
				}
				break;

			case 2:
				System.out.print("id 입력 : ");
				String id = sc.next();
				System.out.print("pw 입력 : ");
				String pw = sc.next();

				for (int i = 0; i < point; i++) {
					if (ids[i].equals(id) && pws[i].equals(pw)) {
						System.out.println(nicks[i] + "님 환영합니다!");
						break;
					} else {
						System.out.println("로그인에 실패했습니다...");
						break;
					}
				}
				break;
			case 3:
				System.out.println("프로그램 종료...");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			if (choice == 3) {
				break;
			}
//			System.out.println(Arrays.toString(ids));
		}
	}
}
