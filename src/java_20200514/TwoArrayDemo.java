package java_20200514;

public class TwoArrayDemo {
	public static void main(String[] args) {
		
		//�迭 ����� ����
		int[][] a = new int[3][2];
		
		//�迭 �Ҵ�
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		//�迭 ���� �� ������ �Ҵ�
		int[][]b= {{10,20},{30,40},{50,60}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
	
				
	}
}
