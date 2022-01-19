package d_Inheritance;

public class Book extends Item {

	private String author;
	private String publisher;
	
	public Book() {
		System.out.println("Book의 인자 없는 생성자");
	}

	public Book(int number, String title,String author, String publisher) {  
//		super.number = number;   // super 부모것을 명확하게 지칭하는거
//		super.title = title;
		super(number, title); // * this()와 super() 무조건 첫줄에 기술!!!!!
		this.author = author;
		this.publisher = publisher;
		System.out.println("Book의 인자 있는 생성자");
	}
	
	public void output() {
		System.out.println("번호: " + number + ", 제목: " + title 
				+ "/ 작가:" + author + "/ 출판사 :" + publisher);
	}
	
}
