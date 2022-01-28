
public class Ex01_배열 {

	public static void main(String[] args) {
		
		// 배열 : 같은 타입의 데이터를 손쉽게 관리하기 위해 쓸 수 있는 기능
		
		// 1. 배열 선언
		String[] campus = new String[5];
		// 주소값
		System.out.println(campus);
		// 배열의 하나하나에 접근하기 위해
		campus[0] = "박병관쌤";
		campus[1] = "김동원쌤";
		campus[2] = "조자연쌤";
		System.out.println(campus[2]);
		System.out.println(campus[3]);
		
		// 배열에 데이터를 넣는 방법(초기화)
		int[] arr = {1, 2, 3, 4, 5};
		
		// 배열의 크기 접근 방법 -> length
		System.out.println("배열의 크기 : " + arr.length);
		
		// 내가 만든 배열 for문 자동완성!!!
		// : for + (Ctrl + Space bar) > 선택 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
