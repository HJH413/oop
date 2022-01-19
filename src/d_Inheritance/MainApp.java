package d_Inheritance;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		
//		Book book = new Book(100, "자바", "김자바", "가산디지털");
//		book.output();
		
		Item i = null;
		System.out.println("종류를 선택하세요=> 1:책, 2:Dvd, 3:Cd");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt(); //입력값
		
		switch(sel) {
		case 1: i = new Book(100,"자바","김저자","가산"); break;
		case 2: i = new Dvd(200,"좋은영화","김배우","이감독"); break;
		case 3: i = new Cd(300,"좋은노래","김가수"); break;
		// 다른 종류별로 객체 생성
		}
		
		i.output(); // 다형성 상황에 따른 다른 함수 호출
	}
}
