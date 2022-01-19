package language;

public class Japan extends LanguagePack {

private String japan;

	@Override
	public void greeting() {
		System.out.println("おはようございます"); //안녕하세요
	}

	@Override
	public void introduce() {
		System.out.println("私はジンヒョクです."); //나는 진혁입니다.
	}

	@Override
	public void chat() {
		System.out.println("Javaは難しい."); // 자바는 어려워
	}
}
