package language3;

import language2.Lang;

public class Eng2 extends Lang2 {
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
