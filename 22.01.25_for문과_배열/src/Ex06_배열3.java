
public class Ex06_배열3 {

	public static void main(String[] args) {

		// 배열의 복사 -> 레퍼런스의 복사는 주소의 복사가 일어남
		// 기본 자료형에서는 값의 복사가 일어남.
		int[] array1 = { 10, 20, 30 };
		int[] array2 = array1;

		array1[0] = 1000;

		System.out.println(array1[0]);
		System.out.println(array2[0]);
	}
}
