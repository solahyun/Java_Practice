
public class Ex04_for문실습3 {

	public static void main(String[] args) {

		// 1~100까지의 수 중에서 3의 배수만 출력
		// 3의 배수인지 아닌지 판단 -> 조건문
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// 3의 배수만큼의 보폭으로 증가시키기
//		for(int i=3; i<=100; i+=3) {
//			System.out.println(i);
//		}
//		
//		for(int i=1; i<=99; i+=3) {
//			System.out.println(i+2);
//		}

		// 1~100까지의 수 중에서 3의 배수, 5의 배수
		// 두 가지 조건을 만족하는 수 출력
		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 && i % 5 == 0) {
//				System.out.println(i);
//			}
			// 3과 5의 최소공배수 : 15의 배수
			if (i % 15 == 0) {
				System.out.println(i);
			}

		}
	}
}
