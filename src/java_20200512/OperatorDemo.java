package java_20200512;
				
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		
		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);
		
		d = (double)b / a;
		System.out.println(d);
		
		c = a * b;
		System.out.println(c);
		
		//������ ������
		c = b % a;
		System.out.println(c);
		
		a += b;// a = a + b ;
		System.out.println(a);
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			//sum = sum + i;
			sum += i;
			
		}
		System.out.println(sum);
		
		a = 10;
		b = 20;
		
		a++; // a = a+1;
		++b; // b = b+1;
		
		System.out.println(a);
		System.out.println(b);
		
		//���� �� ����
		c = a++;// c=>11
		System.out.println(c);
		
		//���� �� ����
		c = ++b; // c => 22
		System.out.println(c);
		
		a = 10;
		b = 20;
		d = 10.0;
		
		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		 
		isSuccess = a <= b;
		System.out.println(isSuccess);
		//primitive data type�� == ���꘴�� �ڷ����� ������� ���� ������
		//true�� ��ȯ�Ѵ�
		isSuccess = a ==d;
		System.out.println(isSuccess);
		
		isSuccess = a!=b;
		System.out.println(isSuccess);
		
		
		System.out.println( 4 & 5 );
		System.out.println( 4 | 5 );
		System.out.println( 4 ^ 5 );
		
		a = 10;
		b = 20;
		
		//a && b => a�� false�̸� b�� �������� ����(short circuit)
		//a || b => a�� true�̸� b�� �������� ���� (short circuit)
		
		isSuccess = (a==b) || (++a==b++);
		
		
		
		//+ => +�� ���Ῥ�갡, ��������� �̴�
		//, => ���������(�ΰ� ��� ������ ���)
		
		System.out.println(1+2+3+"456");
		System.out.println("123"+4+(56));
		
		
		
	}
}
