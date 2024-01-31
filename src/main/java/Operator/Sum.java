package Operator;

import java.util.logging.Logger;

public class Sum implements Operator {

    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.realPart+ num2.realPart;
        double imag = num1.imagPart+num2.imagPart;
        ComplexNumber result = new ComplexNumber(real,imag);
        Logger.getAnonymousLogger().info(num1 + "+" + num2 + "=" + result);
        return result;
    }
}
