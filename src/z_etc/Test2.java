package z_etc;

import java.awt.*;

class MyForm2 extends Frame {
    MyForm2(){
        super("나의 두번째 창");
    }
    void addLayout() {
        setBounds(100,200, 300,200);
        setVisible(true);
        setBackground(Color.darkGray);
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyForm2 my2 = new MyForm2();
        my2.addLayout();
    }
}
