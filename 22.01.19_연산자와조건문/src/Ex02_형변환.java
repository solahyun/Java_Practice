
public class Ex02_형변환 {

	public static void main(String[] args) {
		// 자동형변환 -> 작은 데이터 타입이 큰 데이터 타입으로 들어가는 현상
		byte num1 = 10;
		int num2 = num1;
		
		// 강제형변환 -> 큰 데이터 타입에서 작은 데이터 타입으로 변환하는 현상
		int num3 = 300; // 4byte
		byte num4 = (byte)num3; // 1byte
		System.out.println(num4); // 44, overflow 데이터 유실
		
		// 같은 4byte를 가졌다고 하더라도 java에서는 정수형보다 실수형을 
		// 더 큰 타입이라고 생각
		int num5 = 30;
		float num6 = num5;
		
		float num7 = 100.7f; // (float)100.7
		int num8 = (int)num7;
		System.out.println(num8); // 100
		 
		int num9 = 7;
		int num10 = 3;
		double num11 = 3.0;
		
		// 데이터 타입끼리 연산을 할 시,
		// 더 큰 데이터 타입의 연산 결과로 나오게 된다.(자동형변환)
		System.out.println(num9/num10); // 2
		System.out.println(num9/num11); // 2.3333333333333335
	}
}
