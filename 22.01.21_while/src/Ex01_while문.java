
public class Ex01_while문 {

	public static void main(String[] args) {
		// 1부터 10까지의 출력을 while문으로 해보기
		// while(조건식) {
		// 		조건식이 true일 때 반복 실행
		// }

		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}

//		while (true) {
//			System.out.println(num);
//			num++;
//			if (num == 11) {
//				break; //현재 위치한 가장 안쪽의 반복문에서 빠져나옴.
//			}
//		}
	}
}
