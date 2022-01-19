package a_basic;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("학생이름 ->");
		String stuname = input.next();
		
		System.out.println("국어 ->");
		int stukor = input.nextInt();
		
		System.out.println("영어 ->");
		int stueng = input.nextInt();
		
		System.out.println("수학 ->");
		int stumath = input.nextInt();
		
		Student student = new Student(stuname, stukor, stueng, stumath);
		
//		Student student = new Student("ㅁㅁㅁ", 100,100,100); // 변수 student 선언하고 = 객체 new Student(); 생성
		
		student.calculatorTotal();
		student.calculatorAvg();
		student.output();
	}
}


//		Student stu;  //변수 선언
//		stu = new Student() // 객체 생성

//		student.name = "진혁";
//		student.kor = 100;
//		student.eng = 90;
//		student.math = 80;
		
//		student.setName("홍진혁");
//		student.setKor(80);
//		student.setEng(100);
//		student.setMath(100);
		