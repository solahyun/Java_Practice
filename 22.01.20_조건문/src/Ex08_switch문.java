
public class Ex08_switch문 {

	public static void main(String[] args) {
		// switch(식 or 값) {
		// case 값1 :
		// 값1일 때 실행할 코드;
		// case 값2 :
		// 값2일 때 실행할 코드;

		// num의 값이 1이면 -> 안녕하세요 출력
		// 2이면 -> 잘 가세요 출력
		// 3이면 -> 반갑습니다 출력
		// 이외 -> 또 만나요 출력

		int num = 11;

		switch (num-10) {
		case 1:
			System.out.println("안녕하세요");
			break; // 가까운 중괄호 빠져나가는 키워드
		case 2:
			System.out.println("잘 가세요");
			break;
		case 3:
			System.out.println("반갑습니다");
			break;
		default:
			System.out.println("또 만나요><");
			break; // 안 써도 무방
		}
	}

}
