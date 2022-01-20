package language_pack;

import java.util.Scanner;

public class SelectLanguage {
    public static void main(String[] args) {
        LanguageInterface pack = null; //
        OUTTER:while (true){ // OUTTER를 이용해서 사용자의 오 입력시 초기화 및 종료
            Scanner input = new Scanner(System.in);
            System.out.println("언어를 선택하세요. 1.한국어 2.영어 3.일본어");
            int selectLanguage = input.nextInt();
            switch (selectLanguage){
                case 1:
                    pack = new KoreanPack();
                    break ;
                case 2:
                    pack = new EnglishPack();
                    break ;
                case 3:
                    pack = new JapanesePack();
                    break ;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
                    System.out.println("--------------------- ");
                    continue OUTTER;
            } // 언어 선택 및 오입력시 초기화
            System.out.println("질문를 선택하세요. 1.인사말 2.자기소개 3.잡담");
            int selectInterface = input.nextInt();
            switch (selectInterface){
                case 1:
                    pack.greeting();
                    break ;
                case 2:
                    pack.introduce();
                    break ;
                case 3:
                    pack.chat();
                    break ;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
                    System.out.println("--------------------- ");
                    continue OUTTER;
            }

            System.out.println("다시하시겠습니까? 'Y' 입력");
            System.out.println("종료하시겠습니까? 'N' 또는 아무키 입력");
            String reset = input.next(); // 실행 또는 종료키 입력받기
            if (reset.equals("Y")){
                continue OUTTER;
            } else if (reset.equals("N")){
                break OUTTER;
            } else {
                break OUTTER;
            }

        }

        System.out.println("프로그램 종료");// 프로그램이 끝나면 보내기

    } // end of main
} // end of class
