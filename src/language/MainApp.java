package language;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //시스템 입력받기
		LanguagePack i = null; // 언어 모음 선택을 위한 변수 선언
		char check = ' '; // Y,N 선정 하기 위한 변수 선언
		System.out.println("시작하실려면 "+"( Y )"+"입력");
		check = input.next().charAt(0);
		if(check == 'Y') {
			while (check != 'N') {
				System.out.println("언어를 선택하세요. (1.한국어 2.영어 3.일본어)");
				int question1 = input.nextInt();
				switch (question1) {
					case 1:
						i = new Korean();
						break;
					case 2:
						i = new English();
						break;
					case 3:
						i = new Japan();
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						System.exit(0);
				}
				System.out.println("메시지를 선택하세요. (1.인사 2.소개 3.잡담)");
				int question2 = input.nextInt();
				switch (question2) {
					case 1:
						i.greeting();
						break;
					case 2:
						i.introduce();
						break;
					case 3:
						i.chat();
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
						System.exit(0);
				}

				System.out.println("다시하겠습니까? (Y/N)");
				check = input.next().charAt(0);
				if (check == 'N') {
					break;
				}
			} // end of while
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
	} //end of main
} //end of class




//System.out.println("메시지를 선택 -> 1.인사말 2.자기소개 3.하고픈말");

/*
System.out.println("언어를 선택 -> 1.한국어 2.영어 3.일본어");
		int select = input.nextInt();
		switch(select) {
		case 1: i = new Korean("한국어"); break;
		case 2: i = new English("영어"); break;
		case 3: i = new Japan("일본어"); break;
default: System.out.println("번호를 다시 골라주세요.");
		}
		i.output();
		*/


			/*	System.out.println("다시 하겠습니까? Y/N");
						chcek = input.next();
						if (input.equals(chcek = "Y")) {
						continue;
						} else if (input.equals(chcek = "N")) {
						break;
						} else {
						System.out.print("Y나 N만 입력해 주세요. 잘못된 입력으로");
						break;
						}*/
