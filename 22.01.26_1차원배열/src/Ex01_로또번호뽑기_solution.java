import java.util.Arrays;
import java.util.Random;

public class Ex01_�ζǹ�ȣ�̱�_solution {

   public static void main(String[] args) {
      // �ߺ��� ���� 6���� ���ڸ� �������� �̱�
      Random r = new Random();
      // �ζǹ�ȣ�� ������ �迭
      int[] lottoNumber = new int[45];

      // 1. ù��° �ζ� �̴� ���
      // - �ش��ε��� ��ġ�� ������ ���ڸ� �̰��� �������� ���� ������ �ִ��� �� ��
      // �ߺ����� ������ �ش���ġ�� ���� �ٽ� �̰� �ٽú�
      // �ߺ����� ������ �׳� �Ѿ��

//      for (int i = 0; i < lottoNumber.length; i++) {
//         lottoNumber[i] = r.nextInt(6) + 1;
//         for (int j = 0; j < i; j++) {
//            if (lottoNumber[i] == lottoNumber[j]) {
//               i--;
//               break;
//            }
//         }
//      }
      
      // 2. �ι�° �ζǻ̴� ���
      // - �ϴ��� �ߺ�������� �� �迭��ġ�� �������ڸ� �� ����ִ´�
      //   �״����� �� �ε����� ���� ������ ���ϸ鼭 �ϳ��� �ߺ� ���ڰ� �����Ѵٸ�
      //   �ٽ� �������ڸ� ��ü �̴´�
      
      while(true) {
         for(int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = r.nextInt(45) + 1;
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
   }
}