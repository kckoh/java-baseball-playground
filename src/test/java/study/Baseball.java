package study;

import java.util.Random;

public class Baseball {
    private String target;
    private String expected;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Baseball(){
        target = "";
        genRandom();
    }

    public void genRandom(){
        Random random = new Random();
        for (int i = 0; i < 3; i ++) {
            target += random.nextInt(10);
        }
    }

    public int equalsGuessTarget(char guessNum, char targetChar){
        if (guessNum== targetChar){
            return 1;
        }
        return 0;
    }

    public int strike(String guessNum){
        int result = 0;
        for (int i = 0; i < guessNum.length(); i++) {
            result += equalsGuessTarget(guessNum.charAt(i), target.charAt(i));
        }
        return result;
    }

    public int ball(String guessNum){
        int result = 0;
        int len = guessNum.length();
        for (int i = 0; i < len; i++) {
            result += ballCheck(guessNum,i);
        }
        return result;

    }

    public int ballCheck(String guessNum, int i){
        int len= guessNum.length();
        int result = 0;
        for (int j = 0; j <len ; j++) {
            if(i == j){
                continue;
            }
            else if (guessNum.charAt(j) == target.charAt(i) ){
                result++;
            }
        }
        return result;
    }

    public void guess(String guessNum){
        int strike, ball = 0;


    }

    public String result(){
        return  "str";
    }

}
