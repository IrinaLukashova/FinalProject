package Operator;

import java.util.logging.Logger;

public class Division implements Operator {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        if (num2.realPart == 0 && num2.imagPart == 0) {
            Logger.getAnonymousLogger().severe("деление на 0");
            throw new IllegalArgumentException("деление на 0");
        }

            double real = num1.realPart * num2.realPart + num1.imagPart*num2.imagPart;
            double imag = num1.imagPart*num2.realPart-num2.imagPart*num1.realPart;
            double mod2 = num2.realPart*num2.realPart+num2.imagPart*num2.imagPart;
            ComplexNumber result = new ComplexNumber(real/mod2,imag/mod2);
            Logger.getAnonymousLogger().info(num1 + "/" + num2 + "=" + result);
            return result;
    }
    }

