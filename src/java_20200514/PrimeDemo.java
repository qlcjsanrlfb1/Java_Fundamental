package java_20200514;



public class PrimeDemo {
	public static void main(String[] args) {
		//2�� �������� 1�� ���� ��
		int i = 2;
		boolean isPrime=true;
		//true �� ��� ������ ���� ���� �� �� ���� �ݺ���� �Ǿ�� �Ѵ� �� 100 ���� ���� 2�� �����ִ� �۾��� �ݺ��ȴ�. 
		while(i<=100) {
			isPrime = true;
			
			for (int j = 2; j < i; j++) {
				if(i%2==0) {
					isPrime=false;
				}
				continue;
			}	
			if(isPrime==true)
				System.out.println(i);
			i++;
				}
			}
		
		
}

