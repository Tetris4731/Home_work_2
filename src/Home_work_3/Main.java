package Home_work_3;

import org.w3c.dom.ls.LSOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main( String[] args ) {
        int n = rand.nextInt(9);
        int attempts = 3;
        check(n,attempts);
        int userAnswer = sc.nextInt();
        int retstard = 1;
        int end = 0;
        if (userAnswer==retstard){
            check(n,attempts);
        }else{
            System.out.println("Игра окончена");
            sc.close();
        }

    }


    public static void check( int range, int attempts ) {
        while (true) {
            System.out.println("Привет! Угадай чило от 0 до 9");
            int userAnswer = sc.nextInt();
            if (attempts == 0) {
                System.out.println("Попытки закончились, вы проиграли\nПовторить игру еще раз?\n 1 – да  \n0  – нет");
                break;
            } else if (userAnswer == range) {
                System.out.println("Поздравляю вы угадали!\nПовторить игру еще раз?\n1 – да\n0  – нет");
                break;
            } else if (userAnswer < range) {
                System.out.println("Вы написали слишком маленькое число.\nУ вас осталось  " + attempts + " попытко");
                attempts--;
            } else {
                System.out.println("Вы написали слишком большое число\nУ вас осталось " + attempts + " попытко ");
                attempts--;
            }
        }
    }
}






