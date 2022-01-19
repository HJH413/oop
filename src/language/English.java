package language;

public class English extends LanguagePack {
	
private String english;
	
	public English(String english) {
		this.english = english;
	}
	
	public void output() {
		System.out.println(english+" = 1.인사말 2.자기소개 3.하고픈말");
	}

}
