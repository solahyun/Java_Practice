
public class Ex09_for문실습8_369게임 {

	public static void main(String[] args) {
		// 1의 자리가 369 => "박수"
		// 1의 자리가 5일 때 =? "으악"

		for (int i = 1; i <= 50; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("박수!");
			} else if (i % 10 == 5) {
				System.out.println("으악~");
			} else {
				System.out.println(i);
			}
		}
	}
}
