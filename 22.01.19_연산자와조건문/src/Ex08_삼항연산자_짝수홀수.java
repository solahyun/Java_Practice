import java.util.Scanner;

public class Ex08_삼항연산자_짝수홀수 {
	
	public static void main(String[] args) {
		// 숫자를 입력받아서 홀수인지 짝수인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		// 입력한 값이 홀수 -> 홀수입니다.
		// 짝수 -> 짝수입니다.
		String res = num%2==0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(res);
	}

}
