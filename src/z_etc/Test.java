package z_etc;

import java.awt.*;

class MyForm {
    Frame f;

    MyForm(){
        f = new Frame("나의 첫 화면"); // 프레임 창 제목
    }
    void addlayout() {
        f.setBounds(100,200,300,200); //뭔가 지정하는것들은 set~~~~
        f.setVisible(true);
    }

}
public class Test {
    public static void main(String[] args) {
        MyForm my = new MyForm();
        my.addlayout();
    }
}
