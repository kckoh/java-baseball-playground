package study;

import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {
        Baseball baseball = new Baseball();
        System.out.println(baseball.getTarget());

        Scanner scanner = new Scanner(System.in);
        String value = "";
        int strike = 0;
        int ball = 0;
        while (!value.equals("1")){
            System.out.println("Please enter a number: ");
            value = scanner.nextLine();
            strike = baseball.strike(value);
            ball = baseball.ball(value);
            System.out.println("Strike: " + strike + " Ball: " + ball);
            value = checkWin(strike);

        }
    }

    public static String checkWin(int strike){
        if( strike==3 ){
            System.out.println("Congratulations. You won");
            return "1";
        }
        return "";

    }
}
