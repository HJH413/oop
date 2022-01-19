package language;

public class Korean extends LanguagePack {

	@Override
	public void greeting() {
		System.out.println("안녕하세요");
	}

	@Override
	public void introduce() {
		System.out.println("나는 홍진혁입니다.");
	}

	@Override
	public void chat() {
		System.out.println("자바는 어려워");
	}
}
