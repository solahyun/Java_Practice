
public class Ex00_이차원배열 {

	public static void main(String[] args) {

		// 2차원 배열이란?
		// : 1차원 배열 안에 1차원 배열이 있는 것

		// 2차원 배열의 선언 및 생성 방법?
		// : 데이터타입[][] 변수명 = new 데이터타입[행][열];

		// 3행 2열의 2차원 배열 생성 -> intArray
		int[][] intArray = new int[3][2];
		System.out.println(intArray);         // [[I@2ff4acd0
		System.out.println(intArray[0]);      // [I@54bedef2

		// 2차원 배열 원소에 접근 방법
		// 1차원 배열일 때는, array[index]
		// 2차원 배열일 때는, intArray[행_index][열_index]

		// 2행 2열에 22라는 정수를 넣어주고 출력
		intArray[1][1] = 22;
		System.out.println(intArray[1][1]);
		
		// 문자열을 넣을 수 있는 이차원배열을 만들고
		// 크기는 5*5
		String[][] stringArray = new String[5][5];
		
		// 가운데 3행 3열에 있는 곳에 "나는 정가운데!" 대입하고 출력
		stringArray[2][2] = "나는 정가운데!";
		System.out.println(stringArray[2][2]);
		
		// 2차원 배열의 length
		// -> intArray.length : 2차원 배열의 행의 수
		System.out.println(intArray.length);
		
		// 그렇다면, 우리가 열에 접근하려면?
		// -> intArray[i].length : i번째 행의 열의 개수, 2차원 배열의 열의 개수
		System.out.println(intArray[0].length);
		System.out.println(intArray[1].length);
		System.out.println(intArray[2].length);
	}
}
