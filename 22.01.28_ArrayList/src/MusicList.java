import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 노래 제목을 담아줄 ArrayList 선언
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("시가 될 이야기");
		list.add("Loving you girl");
		list.add("영원은 그렇듯");
		list.add("찬란한 계절");		
		
		while(true) {
			// 4번을 입력받았을 때 종료시킴
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
		
			// 사용자로부터 어떤 숫자를 입력받음
			int select = sc.nextInt();
			
			if(select == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}else if(select == 2) {
				System.out.print("제목 입력 >> ");
				list.add(sc.next());
			}else if(select == 3) {
				System.out.print("삭제할 노래 입력 >> ");
				String remove = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(remove.equals(list.get(i))) {
						list.remove(i);						
					}
				}	
			}else if(select == 4) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

}
