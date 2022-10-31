import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        double number1 = 0;
        double number2 = 0;
        String operator = "";

        if(expression.indexOf("*")>0) {
            int idx = expression.indexOf("*");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "*";
        }
        if(expression.indexOf("/")>0) {
            int idx = expression.indexOf("/");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "/";
        }
        if(expression.indexOf("+")>0) {
            int idx = expression.indexOf("+");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "+";
        }
        if(expression.indexOf("-")>0) {
            int idx = expression.indexOf("-");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "-";
        }
        if(expression.indexOf("%")>0) {
            int idx = expression.indexOf("%");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "%";
        }
        if(expression.indexOf("^")>0) {
            int idx = expression.indexOf("^");
            number1 = Double.parseDouble (expression.substring(0, idx-1));
            number2 = Double.parseDouble (expression.substring(idx+2));
            operator = "^";
        }


        Calculator test = new Calculator(number1, operator, number2);
        System.out.println(test.answer());
    }
}