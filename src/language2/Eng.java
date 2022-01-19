package language2;

public class Eng extends Lang {
    @Override
    public void greeting() {
        System.out.println("Hello!!");
    }

    @Override
    public void introduce() {
        System.out.println("I'm Java");
    }

    @Override
    public void chat() {
        System.out.println("Java is good!");
    }
}
