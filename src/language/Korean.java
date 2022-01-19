package language;

public class Korean extends LanguagePack {

	private String korean;
	
	public Korean(String korean) {
		this.korean = korean;
	}
	
	public void output() {
		System.out.println(korean+" = 1.인사말 2.자기소개 3.하고픈말");
	}
	
}
