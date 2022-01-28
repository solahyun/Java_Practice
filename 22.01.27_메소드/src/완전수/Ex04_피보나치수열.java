package 완전수;

public class Ex04_피보나치수열 {

	public static void main(String[] args) {

		// 피보나치 수열
		// 1 1 2 3 5 8 13 ...
		
		// 10번째에 피보나치 수열에 있는 값을 출력해주는 메서드
		// 재귀함수
		fibonacci();
	}
	
	public static int function(int a) {
		System.out.println(a);
		return function(5);
	}

	public static void fibonacci() {
		System.out.println("피보나치 수열");
		int[] arr = new int[10];
		int sum = 0;
		String str = "";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length+1; j++) {
				sum = arr[i]+arr[j];
				str += sum;
			}
			sum = 0;
		}
		System.out.println(str);
	}
}
