package language3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        OUTTER: while (true) {
            Scanner input = new Scanner(System.in); // 시스템 입력
            Lang2 lang2 = null; // 부모 객체 생성
            System.out.println("언어를 선택하세요 (1.한국어 2.영어 3.일본어) > ");
            int select1 = input.nextInt();

            switch (select1) {
                case 1:
                    lang2 = new Kor2();
                    break ;
                case 2:
                    lang2 = new Eng2();
                    break ;
                case 3:
                    lang2 = new Jap2();
                    break ;
                default:
                    break OUTTER;
            }
            System.out.println("메시지를 선택하세요 (1.인사말 2.자기소개 3.하고픈말) > ");
            int select2 = input.nextInt();

            switch (select2) {
                case 1:
                    lang2.greeting();
                    break ;
                case 2:
                    lang2.introduce();
                    break ;
                case 3:
                    lang2.chat();
                    break ;
                default:
                    break OUTTER;
            }
            System.out.println("다시하시겠습니까? Y/N");
            String replay = input.next();
            if (replay.equals("Y")){
                continue OUTTER;
            } else if (replay.equals("N")){
                break OUTTER;
            }
            input.close();
        }

        System.out.println("프로그램 종료");

    }
}
