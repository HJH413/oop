package z_info;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoTest9 {
	
	//-------------------------------------
	//[1] 멤버변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	Calendar now;
	
	
	//-------------------------------------
	//[2] 멤버변수 객체 생성
	public InfoTest9() {
		
		
		f = new JFrame("DB test9"); // 창 생성
		
		tfName = new JTextField(10);  // 한줄입력 
		tfId = new JTextField(10);
		tfTel = new JTextField(10);
		tfSex = new JTextField(10);
		tfAge = new JTextField(10);
		tfHome = new JTextField(10);
		
		ta = new JTextArea(100,100); //텍스트 영역 크기
		
//		ImageIcon phoneimg = new ImageIcon("./Button_Image/phone.png");
//		ImageIcon showimg = new ImageIcon("./Button_Image/show.png");
//		ImageIcon searchimg = new ImageIcon("./Button_Image/search.png");
//		ImageIcon deleteimg = new ImageIcon("./Button_Image/delete.png");
//		ImageIcon cancelimg = new ImageIcon("./Button_Image/cancel.png");
//		ImageIcon exitimg = new ImageIcon("./Button_Image/exit.png");
//		
//		bAdd = new JButton("Add", phoneimg);  // 버튼 이름 및 이미지추가
//		bShow =  new JButton("Show", showimg);
//		bSearch =  new JButton("Search", searchimg);]
//		bDelete =  new JButton("Delete",deleteimg);
//		bCancel =  new JButton("Cancel",cancelimg);
//		bExit =  new JButton("Exit",exitimg);
		
		
		bAdd = new JButton("Add", new ImageIcon("src/Button_Image/phone.png"));
		
		bAdd.setRolloverIcon(new ImageIcon("src/Button_Image/test1.png"));
		bAdd.setPressedIcon(new ImageIcon("src/Button_Image/test2.png"));
		bAdd.setToolTipText("정보를 입력합니다.");
		
		bShow =  new JButton("Show", new ImageIcon("src/Button_Image/show.png"));
		bShow.setToolTipText("정보를 입력합니다.");
		
		bSearch =  new JButton("Search", new ImageIcon("src/Button_Image/search.png"));
		
		bDelete =  new JButton("Delete", new ImageIcon("src/Button_Image/delete.png"));
		
		bCancel =  new JButton("Cancel", new ImageIcon("src/Button_Image/cancel.png"));
		
		bExit =  new JButton("Exit", new ImageIcon("src/Button_Image/exit.png"));
		bExit.setToolTipText("종료 합니다.");
//		
//		bAdd = new JButton("Add");
//		bShow =  new JButton("Show");
//		bSearch =  new JButton("Search");'
//		bDelete =  new JButton("Delete");
//		bCancel =  new JButton("Cancel");
//		bExit =  new JButton("Exit");
//	
	}
	
	//-------------------------------------
	//[3] 화면 붙이기
	void addLayout() {
		
		
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
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 종료
		f.setBounds(100, 100, 1300, 500); // 위치 및 크기(가로,세로) 
		f.setVisible(true); // 창보이게
		
	}
	
	//-------------------------------------
	//[4] 이벤트 처리
	void eventProc() {
		// 주민번호 입력창 (tfId) 에서 엔터 쳤을 때
		tfId.addActionListener(new ActionListener(){ //Java만든 거를 불러와서
			
        	public void actionPerformed(ActionEvent e) { // 오버라이딩
        		String id = tfId.getText();
        		
        		// 성별을 구해서
        		char sex = id.charAt(7); // 문자열에 몇 번째 문자 불려오기 0부터 시작
        		
        		if(sex == '1' || sex == '3') {
        			tfSex.setText("남자");
        		} else {
        			tfSex.setText("여자");
        		}
        		
        		// 출신지를 구해서
        		char home = id.charAt(8);
        		// 0 -서울
        		// 1 -광역시
        		// 2 -경기
        		// 3 -지방
        		// 9 -제주도
        		switch (home) { // 문자, 정수, 스트링 변수
        		case '0':
        			tfHome.setText("서울");
        			break;
        		case '1':
        			tfHome.setText("광역시");
        			break;
        		case '2':
        			tfHome.setText("경기");
        			break;
        		case '3':
        			tfHome.setText("지방");
        			break;
        		case '9':
        			tfHome.setText("제주도");
        			break;
        		default:
        			System.out.println("알수없음");
        			break;			
        		}
        
        		//-----------------------
        		// 나이를 구해서
        		
        		Calendar now = Calendar.getInstance();
        		int yearii = now.get(Calendar.YEAR);
        		
        		String idage = id.substring(0,2);  // 몇 번째 부터 몇 번까지
        		if(sex == '1' || sex == '2') {
        			String year1 = "19" ;
        			int intage1 = yearii-(Integer.parseInt(year1+idage))+1;
        			tfAge.setText(Integer.toString(intage1));
        		} else if(sex == '3' || sex == '4') {
        			String  year2 = "20" ;
        			int intage2 = yearii-(Integer.parseInt(year2+idage))+1;
        			tfAge.setText(Integer.toString(intage2));
        		}
    
        		
        	
        	} 
        }); // end of addActionListener
		
		//취소버튼이 눌렸을 때 
		bCancel.addActionListener(new ActionListener(){ //Java만든 거를 불러와서
			
        	public void actionPerformed(ActionEvent e) { // 오버라이딩
        		tfName.setText(" "); //공백은 지우기
        		tfId.setText(" ");
        		tfTel.setText(" ");
        		tfSex.setText(" ");
        		tfAge.setText(" ");
        		tfHome.setText(" ");
        		ta.setText(" ");
        	} 
        }); // end of addActionListener
		
		//종료버튼이 눌렀을 때 프로그램 종료함
		bExit.addActionListener(new ActionListener(){ //Java만든 거를 불러와서
			
        	public void actionPerformed(ActionEvent e) { // 오버라이딩
        		System.exit(0); // 종료
        	} 
        }); // end of addActionListener
	} // end of eventProc
	public static void main(String[] args) {
		InfoTest9 info = new InfoTest9();
		info.addLayout();
		info.eventProc();
	} // end of main
} // end of class
