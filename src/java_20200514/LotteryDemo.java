package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		//�ζǺ���
		//1. 1���� 45������ ���� �� ���� ���� 6���� �����Ѵ�.
		//2. 6���� ������ �ߺ��� ���ڰ� ������ �ȵȴ�.
		//Math. random() => 0���� ũ�ų� ���� 1���� ���� ����� 
		//double ������ ��ȯ�Ѵ�.0,00000~0.99999
		
		//1~45�� ���� �������� ��ȯ
		//int random = (int)(Math.random()*45) +1;
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45) +1;
			
		
			//�ߺ��Ǵ� ���� �ִ��� ü���ϴ� ����
			boolean isExisted = false;
			
			//�ߺ�üũ�ϴ� �ڵ�
			for (int j = 0; j< i ; j++) {
				if(lotto[j]==random) {
					isExisted = true;
					break;
					
				}
				
			}

			if(!isExisted) {
				lotto[i]=random;
			}else {
				i--;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length -(i+1) ; j++) {
				if(lotto[j] < lotto[j+1]) {
					int temp = lotto[j+1];
					lotto[j+1]=lotto[j];
							lotto[j]=temp;
				}
				
				
			}
			
		}
		
		for (int i : lotto) {
			System.out.print(i +"\t");
		}
		
		
	}
}
