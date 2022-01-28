
public class Ex02_for문실습 {

	public static void main(String[] args) {

		// 1~10까지 더한 값을 출력
		// 1~10까지 반복을 하는데,
		// 실행코드 안에서 연산자 사용해서 합을 구하기

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~ 10까지의 합 : " + sum);
	}

}
