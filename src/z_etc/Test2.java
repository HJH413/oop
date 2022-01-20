package z_etc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm2 extends Frame {

    Button btn;

    MyForm2(){
        super("나의 두번째 창");
        btn = new Button("Hi");
    }

    void addLayout() {

        setLayout(new FlowLayout());
        add(btn);
        setBounds(100,200, 300,200);
        setVisible(true);

        MyEvent2 evtt = new MyEvent2();
        btn.addActionListener(evtt);

    }
    class MyEvent2 implements ActionListener{
        public void actionPerformed(ActionEvent e) { // 오버라이딩
            JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyForm2 my2 = new MyForm2();
        my2.addLayout();
    }
}
