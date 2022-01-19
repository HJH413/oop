package b_static;

public class Book {
	
	private static int count; 
	
	

	Book() {
		count++;
	}
		
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}
	
	 // 생성자 함수는 void 안들어감
	
}
