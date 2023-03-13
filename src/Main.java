import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int number = 0;
        while (50>=number) {

            System.out.println(number);
            number++;
        */

        /*Scanner sc = new Scanner(System.in); //tablisa umnojenie
        int number = sc.nextInt();
        int score = 1;
        while (score <= 9) {
            System.out.println(number + " * " + score + " = " + number * score);
            score++;
        }
    }*/
        int num = 1;
        while (num <= 9) {
            System.out.println();
        int score = 1;
            while (score<=9) {
                System.out.print(num + " * " + score + " = " + num * score+"\t\t");
                score++;
            }
            System.out.println();
                num++;
        }
    }
}

