package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		//Ŭ���� ��ü ����
		//Customer Ÿ��
		//c1  ���� (���۷���)
		//new Customer() ��ü����
		Customer c1 = new Customer();
		c1.name = "������";
		c1.email = "wlstjrwns20@naver.com";
		c1.phone = "010-7814-8965";
		c1.balance = 100_000_000;
		c1.isreleased = false;
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
				
		Customer c2 = new Customer();
		c1.name = "������";
		c2.email = "jrwns20@naver.com";
		c2.phone = "010-7845-8965";
		c2.balance = 1_000_000;
		c2.isreleased = false;	
		
		
		Customer c3 = c2;
		c3.name="�ո�����";
				
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
	}
}
