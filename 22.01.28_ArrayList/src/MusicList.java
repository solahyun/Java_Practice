import java.util.ArrayList;
import java.util.Scanner;

public class MusicList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �뷡 ������ ����� ArrayList ����
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ð� �� �̾߱�");
		list.add("Loving you girl");
		list.add("������ �׷���");
		list.add("������ ����");		
		
		while(true) {
			// 4���� �Է¹޾��� �� �����Ŵ
			System.out.print("[1]�뷡��ȸ [2]�뷡�߰� [3]�뷡���� [4]���� >> ");
		
			// ����ڷκ��� � ���ڸ� �Է¹���
			int select = sc.nextInt();
			
			if(select == 1) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}else if(select == 2) {
				System.out.print("���� �Է� >> ");
				list.add(sc.next());
			}else if(select == 3) {
				System.out.print("������ �뷡 �Է� >> ");
				String remove = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(remove.equals(list.get(i))) {
						list.remove(i);						
					}
				}	
			}else if(select == 4) {
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
	}

}
