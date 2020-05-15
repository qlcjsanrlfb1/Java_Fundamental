package java_20200514;



public class PrimeDemo {
	public static void main(String[] args) {
		//2로 나눴을때 1이 남는 수
		int i = 2;
		boolean isPrime=true;
		//true 인 경우 거짓이 딜때 까지 블럭 내 에서 반복계산 되어야 한다 즉 100 이하 까지 2로 나눠주는 작업이 반복된다. 
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

