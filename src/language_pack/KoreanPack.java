package language_pack;

public class KoreanPack implements LanguageInterface{

    @Override
    public void greeting() {
        System.out.println("안녕");
    }

    @Override
    public void introduce() {
        System.out.println("나는 자바야");
    }

    @Override
    public void chat() {
        System.out.println("자바는 재밌어");
    }
}
