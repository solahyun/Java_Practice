// 초를 입력받아 [시, 분, 초] 형태로 출력하세요.

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
//		시간, 분, 초 연산하기
//		1분 = 60초, 1시간 = 3600초
		int hour = totalSecond/3600;
		int min = totalSecond%3600/60;
		int sec = totalSecond%60;
//		int sec = totalSecond%3600%60; 
		
		System.out.println(hour+"시 "+min+"분 "+sec+"초");
		
		sc.close();
	}

}
