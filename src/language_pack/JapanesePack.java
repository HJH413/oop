package language_pack;

public class JapanesePack implements LanguageInterface{

    @Override
    public void greeting() {
        System.out.println("こんにちは");
    }

    @Override
    public void introduce() {
        System.out.println("僕はジャバだよ");
    }

    @Override
    public void chat() {
        System.out.println("面白いジャワ");
    }
}
