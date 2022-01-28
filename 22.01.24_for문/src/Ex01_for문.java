
public class Ex01_for문 {

	public static void main(String[] args) {
		// 전역 변수 
		// int i = 1;
		
		// for문의 조건은? -> 3가지
		// for(초기값, 조건식, 반복 후 작업)
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 21~57까지 출력하기
		System.out.println("[27부터 57까지 출력]");
		for (int i = 27; i<=57; i++) {
			System.out.print(i+" ");
		}
		
		// 지역 변수 : 작동하는 공간 안에서만 사용할 수 있는 변수
		// 지역 변수는 다른 곳에서도 같은 이름으로 사용할 수 있다.
	}

}
