
public class Ex00_�������迭 {

	public static void main(String[] args) {

		// 2���� �迭�̶�?
		// : 1���� �迭 �ȿ� 1���� �迭�� �ִ� ��

		// 2���� �迭�� ���� �� ���� ���?
		// : ������Ÿ��[][] ������ = new ������Ÿ��[��][��];

		// 3�� 2���� 2���� �迭 ���� -> intArray
		int[][] intArray = new int[3][2];
		System.out.println(intArray);         // [[I@2ff4acd0
		System.out.println(intArray[0]);      // [I@54bedef2

		// 2���� �迭 ���ҿ� ���� ���
		// 1���� �迭�� ����, array[index]
		// 2���� �迭�� ����, intArray[��_index][��_index]

		// 2�� 2���� 22��� ������ �־��ְ� ���
		intArray[1][1] = 22;
		System.out.println(intArray[1][1]);
		
		// ���ڿ��� ���� �� �ִ� �������迭�� �����
		// ũ��� 5*5
		String[][] stringArray = new String[5][5];
		
		// ��� 3�� 3���� �ִ� ���� "���� �����!" �����ϰ� ���
		stringArray[2][2] = "���� �����!";
		System.out.println(stringArray[2][2]);
		
		// 2���� �迭�� length
		// -> intArray.length : 2���� �迭�� ���� ��
		System.out.println(intArray.length);
		
		// �׷��ٸ�, �츮�� ���� �����Ϸ���?
		// -> intArray[i].length : i��° ���� ���� ����, 2���� �迭�� ���� ����
		System.out.println(intArray[0].length);
		System.out.println(intArray[1].length);
		System.out.println(intArray[2].length);
	}
}
