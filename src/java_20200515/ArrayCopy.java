package java_20200515;


public class ArrayCopy {
	public static void main(String[] args) {
		String[] fruit = {"apple","banana","watermelomn","blueberry"} ;
		
		String[] temp = new String[6];
		
				
		//fruit�� �ǹ��ϴ°� �����迭
		//0 �� �ǹ��ϴ°� ���������ذ� ������ �迭�� ��ġ
		//tmep �� ������ �迭
		//2 ������ �迭��  ��ġ
		//4 �����迭 4�� ��� ����
		System.arraycopy(fruit, 0, temp, 2, 4);
		
		temp[0] = "peach";
		temp[1] = "pear";
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			for(String value : temp) {
				System.out.println(value);
				}
			
		}
	}
}
