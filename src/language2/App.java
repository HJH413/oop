package language2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lang lang = null;
        char check = ' ';

        while (check !='N'){
            System.out.println("언어를 선택하세요. 1.한국어 2.영어 3.일본어");
            int q1 = input.nextInt();
            switch (q1){
                case 1 :
                    lang = new Kor();
                    break;
                case 2 :
                    lang = new Eng();
                    break;
                case 3 :
                    lang = new Jap();
                    break;
            }
            System.out.println("메시지를 선택하세요. 1.인사말 2.소개 3.잡담");
            int q2 = input.nextInt();
            switch (q2) {
                case 1 :
                    lang.greeting();
                    break;
                case 2 :
                    lang.introduce();
                    break;
                case 3 :
                    lang.chat();
                    break;
            }
            System.out.println("다시하시겠습니까? Y/N");
            check = input.next().charAt(0);
            if (check == 'N'){
                break;
            }

        }

    }
}
















/*
Lang lang = null;
char check = ' ';
while (check!='N') {
        System.out.println("언어를 선택하세요 (1.한국어 2.영어 3.일본어)");
        int q1 = input.nextInt();
        switch (q1) {
        case 1 :
        lang = new Kor();
        break;
        case 2 :
        lang = new Eng();
        break;
        case  3 :
        lang = new Jap();
        break;
        }
        System.out.println("메시지를 선택하세요 (1.인사말 2.자기소개 3.하고픈말)");
        int q2 = input.nextInt();
        switch (q2) {
        case 1 :
        lang.greeting();
        break;
        case 2 :
        lang.introduce();
        break;
        case 3:
        lang.chat();
        break;
        }
        System.out.println("다시 하시겠습니까? Y/N");
        check = input.next().charAt(0);
        if(check == 'N'){
        break;
        }
        }*/
