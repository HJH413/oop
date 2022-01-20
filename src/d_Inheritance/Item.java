package d_Inheritance;

public abstract class Item {
	
	protected int number;        //상속을 해줄때는 protected로 
	protected String title;
	
	public Item () {  // 생성자 만들기 **** void 넣지 않기 중요****
		System.out.println("부모의 인자 없는 생성자");
	}

	public Item(int number, String title) {  // 생성자 안에 인자 넣기
		this.number = number;
		this.title = title;
		System.out.println("부모의 인자 있는 생성자");
	}
	
	public abstract void output(); // 함수선언 abstract 미완성이라는 신호

	//public void output(){};// 완벽한 함수 구현
	// abstract 사용할때에는 클래스에도 넣어야함
}


//값 지정 방법에는 생성자랑 setter,getter
//상속 하는 이유
//여러 클래스에서 중복되는 것들을 한번에 관리하기
//

// {  //호출하는거
//		 System.out.println("번호: " + number + ", 제목: " + title);
//
//		 }