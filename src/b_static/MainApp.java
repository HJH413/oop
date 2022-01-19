package b_static;

public class MainApp {
	public static void main(String[] args) {
// 공개 		
//		Book b1 = new Book();
//		System.out.println("책의 갯수:"+b1.count);
//		
//		Book b2 = new Book();
//		System.out.println("책의 갯수:"+b2.count);	
//		
//		Book b3 = new Book();
//		System.out.println("책의 갯수:"+b3.count);
		
		System.out.println("책의 갯수:"+Book.count);
		
	}
}

/*
 * ****static****
 * - 메모리에 단 한 번만 실행 되게 끔
 * - 공유하고 싶을 때
 * - 객체명이 아닌 클래스명으로 접근 가능
 * - 객체가 없어도됨
 * 
 * JVM = 자바 실행기
 *  	MainApp 클래스 안에 main() 실행
 *  
 *  	MainApp a = new MainApp();
 *  	a.main();
 *  
 *  	MainApp.main();
 *  
 *  	객체생성없이도 실행할려고 static이 붙음
 */

