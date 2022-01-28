package 완전수;

public class Ex03_메서드정복_완전수 {

	public static void main(String[] args) {
		int num = 8196;
		boolean result = isPerfectNumber(num);
		System.out.println(num + "은 완전수인가? " + result);

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

	public static boolean isDivisor(int num1, int num2) {
		return (num1 % num2 == 0) ? true : false;
	}

	public static void getDivisor(int num) {
		String result = "";
		result += num + "의 약수 : ";

		// result에 24의 약수 넣어주기
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) { // 메서드를 다른 메서드에 사용
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

	public static boolean isPerfectNumber(int num) {
		if (getSumOfDivisors(num) == num * 2) {
			return true;
		}
		return false;
	}

	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue + "~" + endValue + "까지의 완전수 : ");
		
		for (int i = startValue; i <= endValue; i++) {
			// i가 완전수인지 아닌지를 판별
			// 맞다면 출력
			if (isPerfectNumber(i)) {
				 System.out.print(i + " ");
			}
		}
	}
}
