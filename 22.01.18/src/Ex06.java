import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 사용자가 입력한 데이터값 저장하기
		// 키보드를 사용한 사용자 입력값 받기
		
		// 1. 입력할 수 있는 키보드 기능 불러오기
		// - sc는 Scanner를 간단하게 부를 별칭
		// - Scanner를 불러올 때 꼭 import 작업 실행하기
		// 자동 완성 : Ctrl + Shift + O
		Scanner sc = new Scanner(System.in); 
		
		// ln : 개행(Enter)
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력된 숫자는 : " + num);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("입력된 이름은 : " + name);
		
//		정수형 입력 받기
//		sc.nextInt();
//		문자형 입력 받기
//		sc.next();
	}

}
