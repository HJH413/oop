package c_Inheritance;

public class MainApp {
	public static void main(String[] args) {
		
//		mother mom = new mother();
//		mom.gene();
//		mom.job();
//		
//		daughter dau = new daughter();
//		dau.gene();
//		dau.study();
//		//*
//		dau.job();
	
		//=======================
		// 부모 변수에 자식 객체 생성
		mother z = new daughter();
		z.job();
		// z.study();
		z.gene();//****
		
		//-------------------
		// 형변환 - 기본형끼리
//				-  클래스끼리(상속관계일 때만 가능)
		daughter dd = new daughter();
		mother mm = (mother)dd; 
		daughter dd2 = (daughter)mm;
				
				
	}
}
