
public class Ex03_약수구하기 {

	public static void main(String[] args) {
		// 약수 : 1부터 자기 자신까지 순차적으로 나눴을 때 나머지가 0
		// 2~30까지 약수구하기
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {  // i까지만 비교
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

}
