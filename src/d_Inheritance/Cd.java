package d_Inheritance;

public class Cd extends Item {
	
	private String singer;
	
	public Cd() {
		
	}
	
	public Cd(int number , String title, String singer) {
		super(number, title);
		this.singer = singer;
	}
	
	public void output() {
		System.out.println("번호: " + number + ", 제목: " + title + "/가수: " + singer);
		
	}
	
}
