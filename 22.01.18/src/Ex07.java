import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java ���� �Է� : ");
		int jScore = sc.nextInt();
		System.out.print("Web ���� �Է� : ");
		int wScore = sc.nextInt();
		System.out.print("Android ���� �Է� : ");
		int aScore = sc.nextInt();
		
		int sum = jScore + wScore + aScore;
		int avg = sum / 3;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
