import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ex01_�ζǹ�ȣ�̱� {

	public static void main(String[] args) {

		Random r = new Random();
		// ������ �迭�� �ּҸ� ����
		int[] lottoNumber = new int[6];

		// 1. ù ��° �ζ� �̴� ���
		// - �ش� �ε��� ��ġ�� ���� ���ڸ� �̰� ���� ��������
		// ���� ������ �ִ��� �� ��,
		// �ߺ����� ������ �ش� ��ġ�� ���� �ٽ� �̰� �ٽ� ��
		// �ߺ����� ������ �׳� �Ѿ��.

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

		// 2. �� ��° �ζ� �̴� ���
		// - �ϴ��� �ߺ� ������� �� �迭 ��ġ�� ���� ���ڸ� �� �ִ´�.
		// �� ������ �� �ε����� ���� ������ ���ϸ鼭 
		// �ϳ��� �ߺ� ���ڰ� �����Ѵٸ� �ٽ� ���� ���ڸ� ��ü �̴´�.
/* ����� Ǯ��
		while(true) {
	         for(int i = 0; i < lottoNumber.length; i++) {
	            lottoNumber[i] = r.nextInt(6) + 1;
	         }
	         
	         boolean isCheck = true; // �ߺ����ִ��� ������ �� �� �ִ� ����
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
	      
	    // �� Ǯ��
		while (true) {
			boolean isCheck = true; // �ߺ��� �ִ��� ������ Ȯ�� ����
			
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
