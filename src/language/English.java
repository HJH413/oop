package language;

public class English extends LanguagePack {
	
private String english;

	@Override
	public void greeting() {
		System.out.println("Hello");
	}

	@Override
	public void introduce() {
		System.out.println("I'm Jinhyuk.");
	}

	@Override
	public void chat() {
		System.out.println("Java is hard.");
	}
}
