
public class Ex04_배열 {
	// 자료 구조 : 대량의 데이터를 효율적으로 관리하는 방법
	// 배열(array)은 인덱스(index)와 인덱스에 대응하는 데이터들로
	// 이루어진 연속적인 자료 구조로 같은 종류의 데이터들이 순차적으로 저장됨
	// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
	public static void main(String[] args) {

		// 배열 만들기
		// 길이가 10인 정수형 배열 array 만들기
		// 정수형 배열의 주소를 담음
		int[] array = new int[10];
		System.out.println(array);

		int cnt = 70;

		// 배열명.length -> 배열의 길이를 알 수 있음
		// 해당 인덱스에 접근
		for (int i = 0; i < array.length; i++) {
			array[i] = cnt;
			cnt += 10;
		}

//		array[0] = 70;
//		array[1] = 80;
//		array[2] = 90;
//		array[3] = 70; // Index 3 out of bounds for length 3

		// 해당 인덱스 안에 있는 값 꺼내기
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);

	}
}
