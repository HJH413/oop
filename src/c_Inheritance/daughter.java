package c_Inheritance;

public class daughter extends mother {  // extends <- 상속할때 필수 
	
	public daughter() {
		System.out.println("딸 생성");
	}
	
	public void study() {
		System.out.println("딸은 열심히 공부");
	}
	
	public void gene() {
		System.out.println("딸은 딸이다.");
	}
}
