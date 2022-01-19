package d_Inheritance;

public class Dvd extends Item {
	
	private String actor;
	private String director;
	
	public Dvd() {
		
	}

	public Dvd(int number, String title, String actor, String director) {
		super(number, title);
		this.actor = actor;
		this.director = director;
	}
	
	public void output() {
		System.out.println("번호: " + number + ", 제목: " + title + "/배우: " + actor + "/감독: " + director);
	
	}
	
}
