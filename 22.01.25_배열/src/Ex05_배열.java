import java.util.Random;

public class Ex05_배열 {

	public static void main(String[] args) {

		// 임의의 값을 데이터에 넣어주자
	      Random random = new Random();
	      // 1~30의 랜덤 값을 배열에 저장 해보자!
	      int[] arr = new int[10];
	      // 정수형타입의 배열을 크기 10을 생성하자
	      // int min = arr[0]; <- 0이 대입되어있어요
	      // 배열을 처음에 선언했을 때는 배열안에는 '0'으로 초기화 되어있다.
	      
	      // 랜덤 값을 입력
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = random.nextInt(30)+1;
	      }
	      
	      // 출력부
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      
	      // 배열에 데이터이 값이 담긴 후에 min변수에 arr[0]값을 담아주자.
	      int min = arr[0];
	      
	      // 이 값들 중에서 가장 작은 값 찾아
	      for (int i = 0; i < arr.length; i++) {
	         if(min>arr[i]) {
	            min = arr[i];
	         }
	      }
	      System.out.println("가장 작은 값은 "+min+"입니다.");
	      // 그리고 그 임의의 값들 중에서 가장 작은 값을 찾아서 출력해보자
	      // " 가장 작은 값은 ___ 입니다."
		
		
		
		
		// 임의의 값을 데이터에 넣어주자
		// 1~30의 랜덤 값을 배열에 저장하자
		// 정수형 타입의 배열을 크기 10을 생성하자
		// 임의의 값들 중에서 가장 작은 값을 찾아서 출력해보자
		// 출력 예시)
		// "가장 작은 값은 ____ 입니다."

//		Random r = new Random();
//		int arr[] = new int[10];
//		// 배열에 값이 담긴 다음에 초기화
//		int min = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(30) + 1;
//			System.out.print(arr[i] + " ");
//			if (arr[min] > arr[i]) {
//				min = i;
//			}
//		}
//
//		System.out.println();
//		System.out.println("가장 작은 값은 " + arr[min] + "입니다.");
		
	}

}
