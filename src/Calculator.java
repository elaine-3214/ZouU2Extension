public class Calculator {
    //instance variables
    private double num1;
    private double num2;
    private String oper;

    //constructor
    Calculator (double num1, String oper, double num2) {
        this.num1 = num1;
        this.oper = oper;
        this.num2 = num2;
    }

    public double answer () {
        double ans;
        if (oper.equals("+")) {
            ans = num1 + num2;
        } else if (oper.equals("-")) {
            ans = num1 - num2;
        } else if (oper.equals("*")) {
            ans = num1 * num2;
        } else if (oper.equals("/")) {
            ans = num1/num2;
        } else if (oper.equals("%")) {
            ans = num1%num2;
        } else if (oper.equals("^")) {
            ans = Math.pow(num1, num2);
        } else {
            ans = 0;
        }
        return ans;
    }
}
