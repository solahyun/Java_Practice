
public class Ex01 {

	public static void main(String[] args) {
	
		// 1. 1~10까지 출력
//		for (int i=0; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// 2. 1~10까지의 합
//		int sum = 0;
//		for(int i = 0; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 3. whil문 - 1~10까지 출력
//		int i = 1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 4. 이중 for문
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
