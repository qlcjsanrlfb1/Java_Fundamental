package java_20200512;

public class IfDemo {
	public static void main(String[] args) {
		//run configuration => arguments => program arguments
		int month = Integer.parseInt(args[0]);
		
		String season = null;
		if(month == 12 || month==1 || month ==2) {
			season = "�ܿ�";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "��";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "����";
		}else if(month == 9 || month == 10 || month ==11) {
			season = "����";
		}else {
			season = "���� ����";
		}
		System.out.println(month+"���� " +season+ "�Դϴ�.");
		
		}
			
			//if���� ��� ���Ŀ� ���� �� �ִٶ�� ���� 
			//switch case �� �ٸ����̴�. 
	}
	

