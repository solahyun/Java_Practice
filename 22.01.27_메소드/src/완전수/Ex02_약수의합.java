package 완전수;

public class Ex02_약수의합 {

	public static void main(String[] args) {
		int num = 10;
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);

		getDivisor(num);
	}

	public static boolean isDivisor(int num1, int num2) {
		return (num1 % num2 == 0) ? true : false;
	}

	// 출력 예시) 24의 약수 : 1, 2, 3, 4, 6, 8, 12, 24
	public static void getDivisor(int num) {
		String result = "";
		result += num + "의 약수 : ";

		// result에 24의 약수 넣어주기
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {  // 메서드를 다른 메서드에 사용
				result += i + " ";
			}
		}
		System.out.println(result);
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum;
	}
}
