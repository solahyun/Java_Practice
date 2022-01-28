
public class Ex02_배열 {

	public static void main(String[] args) {

		// 정수형의 배열 array 생성하기
		// 3, 10, 4, 8, 17, 22, 31
		// 짝수에 해당하는 값들만 출력

		int array[] = { 3, 10, 4, 8, 17, 22, 31 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		// 응용!
		// 홀수에 해당하는 값들과 총 몇 개가 있는지 출력하기
		// array에 홀수에 해당하는 값은 _가 있고, 총 _개가 있다.
		int cnt = 0;
		System.out.print("array에 홀수에 해당하는 값은 ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
				cnt++;
			}
		}
		System.out.println("가 있고, 총 " + cnt + "개가 있다.");
	}
}
