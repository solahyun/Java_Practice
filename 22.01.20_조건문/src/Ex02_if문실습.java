// 문제. 변수 num을 선언하고 키보드로부터 정수를 입력 받음
// 만약 num의 값이 3의 배수이면서 5의 배수라면
// -> (출력 예시) 00은 3과 5의 배수입니다. 
// 아니라면 -> (출력 예시) 00은 3과 5의 배수가 아닙니다. 

import java.util.Scanner;

public class Ex02_if문실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + "은 3과 5의 배수입니다.");
		} else {
			System.out.println(num + "은 3과 5의 배수가 아닙니다.");
		}
	}
}
// 2.
//		if (num%3==0){
//			if(num%5==0) {
//				System.out.println(num + "은 3과 5의 배수입니다.");
//			}
//		}
//3. 	if (num%15==0)
