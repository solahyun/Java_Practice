public class Ex04_배열 {

	public static void main(String[] args) {

		// 최댓값 찾기
		// 배열의 데이터 타입은 정수형
		// 들어갈 데이터 -> 23, 45, 95, 17, 6, 89, 47, 56, 68, 71
		// 안에 있는 데이터 값들 중에 제일 큰 수를 가진 인덱스의 값과 데이터 값 출력~
		// 출력 예시) 인덱스 : , max:

		int arr[] = { 23, 45, 95, 17, 6, 89, 47, 56, 68, 71 };

		int max = arr[0];

		// 인덱스 값을 담아줄 변수
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (max == arr[i]) {
				idx = i;
			}
		}
		System.out.print("인덱스 " + idx + ", max : " + max);
	}
}
