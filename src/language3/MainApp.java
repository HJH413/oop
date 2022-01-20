package language3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        OUTTER: while (true){ // 반복문 라벨 설정

            Scanner input = new Scanner(System.in);//시스템 입력받기
            Lang2 lang2 = null;

            System.out.print("언어를 선택하세요 (1.한국어 2.영어 3.일본어) > ");
            int select1 = input.nextInt(); //언어팩 선택 입력하기
            switch (select1){   // 입력받은 언퍼팩 불러오기
                case 1:  // 한국어
                    lang2 = new Kor2();
                    break ;
                case 2: // 영어
                    lang2 = new Eng2();
                    break ;
                case 3: // 일본어
                    lang2 = new Jap2();
                    break ;
                default: // 이상한 숫자 입력되면 처음으로
                    System.out.println("잘못 입력하셨습니다. 처음으로");
                    continue OUTTER;
            }

            System.out.print("메시지를 선택하세요 (1.인사말 2.자기소개 3.하고픈말) > ");
            int select2 = input.nextInt(); // 언어별 메시지 선택 입력하기
            switch (select2){ // 입력받은 메시지 불러오기
                case 1: // 인삿말
                    lang2.greeting();
                    break ;
                case 2: // 소개
                    lang2.introduce();
                    break ;
                case 3: // 잡담
                    lang2.chat();
                    break ;
                default: // 이상한 숫자 입력되면 처음으로
                    System.out.println("잘못 입력하셨습니다. 처음으로");
                    continue OUTTER;
            }

            System.out.println("다시 하시겠습니까? 'Y' ");
            System.out.println("종료하기 : N 또는 아무키 입력.");
            String replay = input.next();

            if(replay.equals("Y")){
                continue OUTTER;
            } else if(replay.equals("N")){
                break OUTTER;
            } else {
                break OUTTER;
            }
        }

        System.out.println("프로그램 종료");

    }
}















/*
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
        System.out.println("잘못 입력 하셨습니다.");
        continue OUTTER;
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
        System.out.println("잘못 입력 하셨습니다.");
        continue OUTTER;
        }
        System.out.println("다시하시겠습니까? Y/N");
        String replay = input.next();
        if (replay.equals("Y")){
        continue OUTTER;
        } else if (replay.equals("N")){
        break OUTTER;
        } else {
        System.out.println("잘못 입력 하셨습니다.");
        System.exit(0);
        }
        input.close();
        }

        System.out.println("프로그램 종료");
*/
