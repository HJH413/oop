package language3;

import language2.Lang;

public class Jap2 extends Lang2 {
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
