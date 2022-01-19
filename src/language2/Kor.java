package language2;

public class Kor extends Lang {
    @Override
    public void greeting() {
        System.out.println("안녕");
    }

    @Override
    public void introduce() {
        System.out.println("나는 자바");
    }

    @Override
    public void chat() {
        System.out.println("자바는 좋아");
    }
}
