package language;

public class Japan extends LanguagePack {

private String japan;
	
	public Japan(String japan) {
		this.japan = japan;
	}
	
	public void output() {
		System.out.println(japan+" = 1.인사말 2.자기소개 3.하고픈말");
	}
}
