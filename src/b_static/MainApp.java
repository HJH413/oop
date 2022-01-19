package b_static;

public class MainApp {
	public static void main(String[] args) {
// 공개 		
//		Book b1 = new Book();
//		System.out.println("책의 갯수:"+b1.getCount());
//		
//		Book b2 = new Book();
//		System.out.println("책의 갯수:"+b1.getCount());	
//		
//		Book b3 = new Book();
//		System.out.println("책의 갯수:"+b1.getCount());
		
		System.out.println("책의 갯수:"+Book.getCount());
		// 객체가 아닌 클래스 명으로 접근하기 위해서는 static이 붙어야함
		
	}
}

/*
 * ****static****
 * - 메모리에 단 한 번만 실행 되게 끔
 * - 공유하고 싶을 때
 * - 객체명이 아닌 클래스명으로 접근 가능(객체생성없이 가능)
 * - 객체가 없어도됨
 *  비객체 영역은 가비지 컬렉터의 영향으로부터 자유롭고, 
 *  메모리에 상주하게 되어 있는데 이런 상주의 의미를 
 *  ‘static'이라는 뜻으로 사용된다.
 *  값을 공유

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

