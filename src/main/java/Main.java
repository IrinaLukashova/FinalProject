import Calculator.Calculator;
import Operator.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        ComplexNumber num1 = new ComplexNumber(5,3);
        ComplexNumber num2 = new ComplexNumber(1,-1);
        ComplexNumber num3 = new ComplexNumber(0,3);
        ComplexNumber num4 = new ComplexNumber(-2,4);
        ComplexNumber num5 = new ComplexNumber(1,0);

        System.out.println(calculator.calculate(num1, num2, "+"));
        System.out.println(calculator.calculate(num3, num4, "-"));
        System.out.println(calculator.calculate(num4, num5, "*"));
        System.out.println(calculator.calculate(num4, num5, "/"));

    }
}
