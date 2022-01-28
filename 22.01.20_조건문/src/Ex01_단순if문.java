
public class Ex01_단순if문 {

	public static void main(String[] args) {
		// 변수 age의 값이 20이상이면 '성인입니다.'를 출력
		// 문제. age의 값이 20미만이면 '미성년자입니다.'를 출력
		int age = 19;
		// 조건문(조건식) {
		// 조건식이 true일 때 실행될 코드
		// }
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			// if 조건식에 true에 해당되지 않는 값들이 다 넘어옴
			System.out.println("미성년자입니다.");
		}
//		if (age < 20) {
//			System.out.println("미성년자입니다.");
//		}

	}

}
