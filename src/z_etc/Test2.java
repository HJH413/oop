package z_etc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm2 extends Frame {
    //interface Frame 가져옴
    Button btn;
    //MyForm의 Frame f 를 생성안함

    MyForm2(){ //생성자
        super("나의 두번째 창"); // Frame 상속해서 super() 사용
        btn = new Button("Hi"); //button 변수 메소드생성
    }

    void addLayout() { // window 정보

        setLayout(new FlowLayout()); //
        add(btn); // 버튼 추가
        setBounds(100,200, 300,200); // 위치 크기
        setVisible(true); // 창을 보이게할지

        MyEvent2 evtt = new MyEvent2(); // 이벤트 메소드
        btn.addActionListener(evtt); // btn.이벤트 불러오기

    }
    class MyEvent2 implements ActionListener{  // 이벤트 설정
        public void actionPerformed(ActionEvent e) { // 오버라이딩
            JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
        }
    }
}

public class Test2 { //
    public static void main(String[] args) {
        MyForm2 my2 = new MyForm2(); // my2에 addLayout 메소드 집어넣기
        my2.addLayout();
    }
}
