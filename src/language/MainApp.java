package language;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LanguagePack i = null;
		System.out.println("언어를 선택 -> 1.한국어 2.영어 3.일본어");
		int select = input.nextInt();
		switch(select) {
		case 1: i = new Korean("한국어"); break;
		case 2: i = new English("영어"); break;
		case 3: i = new Japan("일본어"); break;
		default: System.out.println("번호를 다시 골라주세요.");
		}
		i.output();
		
//		int select2 = input.nextInt();
//		KoreanLanguagePack pack = new KoreanLanguagePack(outputkr1)
//		switch (select2) {
//		case 1: 
//			j = new 
//			break;
//
//		default:
//			break;
//		}
//	
	} //end of main
} //end of class




//System.out.println("메시지를 선택 -> 1.인사말 2.자기소개 3.하고픈말");