package java_20200515;


public class ArrayCopy {
	public static void main(String[] args) {
		String[] fruit = {"apple","banana","watermelomn","blueberry"} ;
		
		String[] temp = new String[6];
		
				
		//fruit가 의미하는건 원본배열
		//0 이 의미하는건 원본복사해갈 정보의 배열의 위치
		//tmep 는 복사할 배열
		//2 복사할 배열의  위치
		//4 원본배열 4개 요소 복시
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
