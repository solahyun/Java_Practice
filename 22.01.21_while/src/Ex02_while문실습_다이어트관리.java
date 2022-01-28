import java.util.Scanner;

public class Ex02_while문실습_다이어트관리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1;
		while(now > goal) {  // >=
			System.out.print(week+"주차 감량 몸무게 : ");
			int lose = sc.nextInt();
			now-=lose;
			week++;
		}
		System.out.println(now+"kg 달성!! 축하합니다!");
	}

}
