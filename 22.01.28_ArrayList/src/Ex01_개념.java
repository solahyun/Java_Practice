import java.util.ArrayList;

public class Ex01_개념 {

	public static void main(String[] args) {
		
		// 가변적인 배열과 같은 형태를 가지고 있는 클래스 -> ArrayList
		// Collection(책 390p 참고)
		
		// 1. ArrayList 생성
		String s = "행복행";
		String a = new String("행복행");
		System.out.println(a);
		
		// ArrayList<저장할 데이터 자료형> 변수명 = new ArrayList<저장할 데이터 자료형>();
		// 맨 뒤에 (); 꼭 붙이기!
		// 저장할 데이터 자료형이 레퍼런스 타입이어야한다.
		// String, Integer, Double... (대문자로 시작)
		// import 해줘야 한다! -> 정의된 기능을 가지고 와서 사용
		
		ArrayList<String> list = new ArrayList<String>();
		
		// <> : 제네릭 기법
		// - ArrayList를 생성하는 순간에 저장할 자료형을 결정하는 기법
		// 레퍼런스 변수 형태, 객체 형태만을 저장할 수 있다.(기본자료형 저장 X)
	
		// 2. 값을 추가하기
		// 값을 추가하는 메서드가 내부적으로 설계가 되어있다.
		list.add("돈까스");
		list.add("찜닭");
		list.add("깁밥");
		
		// 3. 값 가져오기
//		list.get(1);
		System.out.print(list.get(0));
		System.out.println(" 먹고 싶다!");
		
		// 4. 값 삭제하기
		list.remove(0);
		// 돈까스가 사라지고 뒤에 있는 값들의 인덱스가 앞으로 이동
		// 뒤의 값의 인덱스가 0이 된다. -> 찜닭의 인덱스 값이 1로 이동
		System.out.println(list.get(0));
		
		// 5. 원하는 위치에 값을 추가하기
		list.add(1, "치킨");
		
		// 6. 저장되어있는 데이터의 총 크기 가져오기
		list.size();
		System.out.println(list.size());
		
		// 7. 모든 값을 삭제하는 방법
		list.clear();
		System.out.println(list.size());
	}
}
