package z_etc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm9 {
    Frame f;
    Button b;
    TextField tf;
   

    MyForm9(){ //생성자
        f = new Frame("나의 첫 화면"); // 프레임 창 제목
        b = new Button("Ok");
        tf = new TextField(20);
    }
    void addlayout() {   // 위치 설정

        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(tf);
        
        
        f.setBounds(100,200,300,200); //뭔가 지정하는것들은 set~~~~ window의 위치 및 창 크기 설정
        f.setVisible(true);

        //이벤트 처리
		/*
		 * MyEvent evt = new MyEvent(); b.addActionListener(evt);//B 액션에 연결해주세요.
		 */   
        
        b.addActionListener(new ActionListener(){ //Java만든 거를 불러와서
        	public void actionPerformed(ActionEvent e) { // 오버라이딩
        		JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
        	} 
        }); // end of addActionListener
        
        tf.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) { // 오버라이딩
        		JOptionPane.showMessageDialog(null, "엔터를이 쳤습니다.");
        	} 
        });
        
     }   
    // 이벤트 관련된 것 들을 이벤트 핸들러라 부름
//    class MyEvent implements ActionListener{  // innerClass
//        public void actionPerformed(ActionEvent e) { // 오버라이딩
//            JOptionPane.showMessageDialog(null, "버튼이 눌렸습니다.");
//        }
    
}
public class Test9 {
    public static void main(String[] args) {
        MyForm9 my = new MyForm9();
        my.addlayout();
    }
}
