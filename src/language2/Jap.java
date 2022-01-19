package language2;

public class Jap extends Lang {
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
        System.out.println("Javaは面白い");
    }
}
