package study;

public class StringCalculator {
    private String numString;
    private String[] numArr;

    public StringCalculator(String num){
        numString = num;
    }

    public void splitNum(){
        setNumArr(numString.split(" "));
    }

    public int operatorParse(String operator, String num,int output){
        int outputReturn = output;
        if (operator.equals("+")){
            outputReturn +=  Integer.parseInt(num);

        }
        else if (operator.equals("-")){
            outputReturn -=  Integer.parseInt(num);
        }

        else if(operator.equals("*")){
            outputReturn *=  Integer.parseInt(num);
        }
        else if (operator.equals("/")){
            outputReturn /=  Integer.parseInt(num);
        }
        return outputReturn;
    }

    public int calculate(){
        int x = Integer.parseInt(numArr[0]);

        String operator = "";
        for (int i = 1; i < numArr.length ; i++){
            if(i%2 == 0){
                x = operatorParse(operator,numArr[i],x);
                continue;
            }
            operator = numArr[i];
        }
        return x;
    }

    public String getNumString() {
        return numString;
    }

    public void setNumString(String numString) {
        this.numString = numString;
    }

    public String[] getNumArr() {
        return numArr;
    }

    public void setNumArr(String[] numArr) {
        this.numArr = numArr;
    }

}
