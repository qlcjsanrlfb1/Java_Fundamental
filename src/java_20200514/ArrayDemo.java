package java_20200514;

public class ArrayDemo {
 public static void main(String[] atgs) {
	 //1. �迭 ���� �� ����
	 int[] a = new int[4];
	 
	 //2. ���� �Ҵ�
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 4;
	
	
	//3.�迭 ����
	//a.length : �迭��; ����
	for(int i=0 ;i<a.length;i++) {
		System.out.println(a[i]);
		
	//�迭 ����,����,�Ҵ��� ���ÿ� �̷����
		int[] b = {100,200,300,400,500};
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;
		
		//�迭�� Ǯ��
	for (int j = 0; i < b.length; i++) {
		System.out.println(b[i]);
		
		//�迭 ��� enhanced for loop
		for(int value : b) {
			System.out.println(value);
		}
	int[] c = a;
	c[0] = 11;
	
	System.out.println(a[0]);
	System.out.println(c[0]);
	 
	int a1 = 10;
	int b1 = a1;
	a1 = 20;
	}
	}
 }
}
			
		
	
 

