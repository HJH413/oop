package language_pack;

public class EnglishPack implements LanguageInterface{
    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    @Override
    public void introduce() {
        System.out.println("I'm Java");
    }

    @Override
    public void chat() {
        System.out.println("funny Java");
    }
}
