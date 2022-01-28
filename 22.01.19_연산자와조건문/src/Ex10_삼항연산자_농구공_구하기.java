import java.util.Scanner;

public class Ex10_삼항연산자_농구공_구하기 {

	public static void main(String[] args) {
		
		// 농구공 박스 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int box = 5;
		
		int res = (ball%box)==0 ? ball/box : ball/box+1;
		
		System.out.print("필요한 상자의 수 : "+res);
		
	}

}
