import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int res = (num/100) * 100;
//		int res = num - num%100;
		
		System.out.println("결과 확인 : " + res);	
	}

}

