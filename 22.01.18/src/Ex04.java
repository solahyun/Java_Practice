
public class Ex04 {

	public static void main(String[] args) {
		int org = 3729;
		int nbr = 52;
		
		// 몇 개의 박스가 필요한지 결과를 담을 수 있는 변수 생성
		int box = org / nbr;
		
		// 박스에 담지 못한 갯수
		int remain = org % nbr;
		
		System.out.println("가능한 귤 박스의 수는? " + box);
		System.out.println("남는 귤의 갯수? "+ remain);
		
	}

}
