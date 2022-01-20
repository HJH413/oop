package z_etc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm {
    Frame f;
    Button b;

    MyForm(){
        f = new Frame("나의 첫 화면"); // 프레임 창 제목
        b = new Button("Ok");
    }
    void addlayout() {

        f.setLayout(new FlowLayout());
        f.add(b);

        f.setBounds(100,200,300,200); //뭔가 지정하는것들은 set~~~~
        f.setVisible(true);

        //이벤트 처리
        MyEvent evt = new MyEvent();
        b.addActionListener(evt);//B 액션에 연결해주세요.
    }
    // 이벤트 관련된 것 들을 이벤트 핸들러라 부름
    class MyEvent implements ActionListener{
        public void actionPerformed(ActionEvent e) { // 오버라이딩
            JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyForm my = new MyForm();
        my.addlayout();
    }
}
