package d_Inheritance;

public class Book extends Item {

	private String author;
	private String  publisher;
	
	public Book() {
		
	}

	public Book(int number, String title,String author, String publisher) {  
		super.number = number;   // super 부모것을 명확하게 지칭하는거
		super.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public void output() {
		System.out.println("번호: " + number + ", 제목: " + title 
				+ "/ 작가:" + author + "/ 출판사 :" + publisher);
	}
	
}
