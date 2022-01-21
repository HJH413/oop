package z_etc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MySwing {
	// 1. 멤버변수 선언
	
	JFrame f;  // 향상된 기능 J <- 중요!!
	JButton b1;
	JButton b2;
	JTextField tf;
	JTextArea ta;
	JList<String> color;
	JComboBox<String> color2;
	
	
	// 2. 객체 생성
	public MySwing() {
		f = new JFrame("나의 화면"); // 창 생성
		b1 = new JButton("확인");
		b2 = new JButton("취소");
		tf = new JTextField("한줄 입력", 30);  // 입력창 안에 텍스트 넣기 , column 입력받을 텍스트 창 크기
		ta = new JTextArea("여러줄 입력", 5, 30);
		String[] data = {"빨강", "노랑", "초록", "파랑"};
		color = new JList<String>(data);
		color2 = new JComboBox<String>(data);
	}
	
	
	// 3. 화면붙이기
	void addLayout( ) {  //창 설정
		
//		f.setLayout(new GridLayout(4,2)); / 바둑판식
		f.setLayout(new BorderLayout()); // Center/North/South/West/East //영역 붙이기
//		f.setLayout(new FlowLayout()); //창안에 붙히는거 설정하기
		f.add(b1, BorderLayout.WEST);  //  BorderLayout.WEST(상수)
		f.add(b2, BorderLayout.EAST);
		f.add(tf, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		//패널
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JLabel("주소 입력"), BorderLayout.CENTER);  //라벨 같은건 바로 붙혀도됨
		p.add(color, BorderLayout.WEST);
		p.add(color2, BorderLayout.EAST);
		
		f.add(p, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프로그램 종료 ()
		f.setBounds(100, 200, 500, 300); // 창의 위치 및 크기
		f.setVisible(true); // 창을 보이게 할지 말지
	}
	
	
	// 4. 이벤트처리
	void eventProc() {
		
	}
}

public class Test5 {
	
	public static void main(String[] args) {
		
	MySwing my = new MySwing(); // 클래스 부르기
	
	my.addLayout();  // 메소드 부르기
	my.eventProc();

	
	
		
	}
}
