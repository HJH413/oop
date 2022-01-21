package z_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoTest {
	
	//-------------------------------------
	//[1] 멤버변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	
	//-------------------------------------
	//[2] 멤버변수 객체 생성
	public InfoTest() {
		f = new JFrame("DB test1"); // 창 생성
		
		tfName = new JTextField(10);  // 한줄입력 
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		
		ta = new JTextArea(100,100); //텍스트 영역 크기
		
		ImageIcon phoneimg = new ImageIcon("src/Button_Image/phone.png"); //버튼이미지 
		ImageIcon showimg = new ImageIcon("src/Button_Image/show.png");
		ImageIcon searchimg = new ImageIcon("src/Button_Image/search.png");
		ImageIcon deleteimg = new ImageIcon("src/Button_Image/delete.png");
		ImageIcon cancelimg = new ImageIcon("src/Button_Image/cancel.png");
		ImageIcon exitimg = new ImageIcon("src/Button_Image/exit.png");
		
		bAdd = new JButton("Add", phoneimg);  // 버튼 이름 및 이미지추가
		bAdd.setToolTipText("정보를입력합닏/");
		bShow =  new JButton("Show", showimg);
		bSearch =  new JButton("Search", searchimg);
		bDelete =  new JButton("Delete",deleteimg);
		bCancel =  new JButton("Cancel",cancelimg);
		bExit =  new JButton("Exit",exitimg);
		
//		bAdd = new JButton("Add"); // 버튼 이름
//		bShow =  new JButton("Show");
//		bSearch =  new JButton("Search");
//		bDelete =  new JButton("Delete");
//		bCancel =  new JButton("Cancel");
//		bExit =  new JButton("Exit");
		
		
		
	}
	
	//-------------------------------------
	//[3] 화면 붙이기
	void addLayout() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 종료
		f.setBounds(100, 100, 1300, 500); // 위치 및 크기(가로,세로) 
		f.setVisible(true); // 창보이게
		
		f.setLayout(new BorderLayout());  //main BorderLayout
		
		f.add(ta, BorderLayout.CENTER); // main TextArea
		
		JPanel pinfo = new JPanel();  // info Panel 
		pinfo.setLayout(new GridLayout(6,2)); // 6행 2열
		pinfo.add(new JLabel("Name" , JLabel.CENTER));  //이름 , 상수(위치 값)
		pinfo.add(tfName);
		pinfo.add(new JLabel("Id" , JLabel.CENTER));
		pinfo.add(tfId);
		pinfo.add(new JLabel("Tel" , JLabel.CENTER));
		pinfo.add(tfTel);
		pinfo.add(new JLabel("Sex" , JLabel.CENTER));
		pinfo.add(tfSex);
		pinfo.add(new JLabel("Age" , JLabel.CENTER));
		pinfo.add(tfAge);
		pinfo.add(new JLabel("Home" , JLabel.CENTER));
		pinfo.add(tfHome);
		f.add(pinfo, BorderLayout.WEST); // info Panel exit
		
		JPanel pbtn = new JPanel(); // button Panel
		pbtn.setLayout(new GridLayout(1,6));  //1행 6열
		pbtn.add(bAdd);
		pbtn.add(bShow);
		pbtn.add(bSearch);
		pbtn.add(bDelete);
		pbtn.add(bCancel);
		pbtn.add(bExit);
		f.add(pbtn,BorderLayout.SOUTH); // button Panel exit
		
	}
	
	//-------------------------------------
	//[4] 이벤트 처리
	void eventProc() {
		
	}
	public static void main(String[] args) {
		InfoTest info = new InfoTest();
		info.addLayout();
		info.eventProc();
	} // end of main
} // end of class

/*
JLabel name = new JLabel("Naame");
name.setHorizontalAlignment(JLabel.CENTER);
*/