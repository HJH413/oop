package a_basic;

public class Student {
		
		// 서로다른 자료형의 멤버변수(field)와 멤버메소드(method, 함수) => 클래스
		private	String name;
		private	int kor, eng, math;
		private	int total;
		private	double avg;
		
//		---------------------------------------	
		public Student() {  // 생성자 생성하기(void return 금지!) - 객체 초기화
			this.name = "진혁";
			this.kor = 80;
			this.eng = 100;
			this.math = 100;  
		}
		
//		public Student(String n, int k, int e, int m) {  //생성자 
//			this.name = n;
//			this.kor = k;
//			this.eng = e;
//			this.math = m;
//		}
		// 		클래스명   ( 인자 )				
		public Student(String name, int kor, int eng, int math) {  // 멤버 변수를 표현하는 this.
			this.name = name; // this가 없으면 일반 파라미터
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public void calculatorTotal() {
			total = kor + eng + math;
		}
		
		public void calculatorAvg( ) {
			avg = total /3.;  // 3. <- double형 0이 생략한것
		}
		
		public void output() {
			System.out.println("학생명 : " + name);
			System.out.println("총점 : " + total + ", 평균 : " + avg);
		}

		// -----------------------------------
		//Setter(값을 외부에서 지정) Getter(값을 내부에서 정한걸 외부로 보냄) 자동으로 만들자!!	
		
		public String getName() { //값을 내부에서 지정 후 외부 호출시 값 보냄
			return name;
		}

		public void setName(String name) { // 값을 외부에서 지정 후 내부에 값을 받음
			this.name = name;  // (class Student)this.name = (setName)name
		}

		public int getKor() {
			kor = 100;
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}
		
		
}

// 클래스명은 첫글자는 대문자 (권장사항)
// 변수명의 첫글자는 소문자  
// 함수명의 첫글자는 소문자
// 라벨명의 전체다 대문자
// 패키지명 전체다 소문자

// 영단어로 첫글자를 대문자 -> 낙타표기법 (camelCase)
// ex) 원을 그리느 함수 : drawCircle


/*
 * 0)클래스란
 *  // 서로 다른 자료형의 멤버변수(field)와 멤버 메소드 -> 클래스
 * 
 * 1) 클래스와객체의 관계
 * 
 * 2) 캡슐화
 * 		- 멤버변수 : private
 * 		- 멤버메소드 : public
 * 		직접 메소드로 접근을 막고 한단계 과정을 거쳐서 코드를 불러오는 것 setter, getter
 * 
 * 3) 객체 초기화 : 생성자 함수
 * 		생성자 함수는 new 하는 순간에 자동으로 불려지는 함수
 * 		이름이 반드시 클래스명 동일
 * 		리턴형이 없음 (주의!!!!!! void안됨)
 * 
 * 4) 동일한 함수명으로 여러개의 함수 선언
 * 		인자의 자료형이나 갯수가 다른 동일한 이름의 함수들
 *		 		
 * 
 */
/*
 * [참고] 초기화
 * int a ; // 변수선언 -> 메모리확보
 * a = 10; // 값을 지정
 * 
 * int b = 20; // 변수선언(즉, 메모리 확보)하면서 값을 처음부터 지정 -> 초기화
 */
