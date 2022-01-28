import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ex01_로또번호뽑기 {

	public static void main(String[] args) {

		Random r = new Random();
		// 정수형 배열의 주소를 담음
		int[] lottoNumber = new int[6];

		// 1. 첫 번째 로또 뽑는 방법
		// - 해당 인덱스 위치에 랜덤 숫자를 뽑고 나서 이전까지
		// 뽑은 값들이 있는지 비교 후,
		// 중복값이 있으면 해당 위치의 값을 다시 뽑고 다시 비교
		// 중복값이 없으면 그냥 넘어간다.

//		for (int i = 0; i < lottoNumber.length; i++) {
//			lottoNumber[i] = r.nextInt(6) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lottoNumber[i] == lottoNumber[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lottoNumber));

		// 2. 두 번째 로또 뽑는 방법
		// - 일단은 중복 상관없이 각 배열 위치에 랜덤 숫자를 다 넣는다.
		// 그 다음에 각 인덱스를 서로 일일이 비교하면서 
		// 하나라도 중복 숫자가 존재한다면 다시 랜덤 숫자를 전체 뽑는다.
/* 강사님 풀이
		while(true) {
	         for(int i = 0; i < lottoNumber.length; i++) {
	            lottoNumber[i] = r.nextInt(6) + 1;
	         }
	         
	         boolean isCheck = true; // 중복이있는지 없는지 알 수 있는 변수
	         // 0 - 1 , 0 - 2, 0 - 3, 0 - 4, 0 -5
	         for(int i = 0; i < lottoNumber.length - 1; i++) {
	            for(int j = i + 1; j < lottoNumber.length; j++) {
	               if(lottoNumber[i] == lottoNumber[j]) {
	                  isCheck = false;
	               }
	            }
	         }
	         if(isCheck) {
	            break;
	         }
	      }
	      System.out.println(Arrays.toString(lottoNumber));
*/	      
	      
	    // 내 풀이
		while (true) {
			boolean isCheck = true; // 중복이 있는지 없는지 확인 변수
			
			for (int i = 0; i < lottoNumber.length; i++) {
				lottoNumber[i] = r.nextInt(6) + 1;
				for (int j = 0; j < i; j++) {
					if (lottoNumber[i] == lottoNumber[j]) {
						isCheck = false;
					}
				}
			}
			if (isCheck) {
				break;
			}
		}
		System.out.println(Arrays.toString(lottoNumber));
	}
}
