import java.util.Scanner;

public class Ex02_while���ǽ�_���̾�Ʈ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		int now = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		
		int week = 1;
		while(now > goal) {  // >=
			System.out.print(week+"���� ���� ������ : ");
			int lose = sc.nextInt();
			now-=lose;
			week++;
		}
		System.out.println(now+"kg �޼�!! �����մϴ�!");
	}

}
