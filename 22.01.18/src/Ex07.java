import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 점수 입력 : ");
		int jScore = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int wScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int aScore = sc.nextInt();
		
		int sum = jScore + wScore + aScore;
		int avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
