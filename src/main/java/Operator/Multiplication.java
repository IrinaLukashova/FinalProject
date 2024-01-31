package Operator;

import java.util.logging.Logger;

public class Multiplication implements Operator {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.realPart * num2.realPart - num1.imagPart*num2.imagPart;
        double imag = num1.imagPart*num2.imagPart+num1.imagPart*num2.imagPart;
        ComplexNumber result = new ComplexNumber(real,imag);
        Logger.getAnonymousLogger().info(num1 + "*" + num2 + "=" + result);
        return result;
    }
}

//    @Override
//    public ComplexNumber getOperation(ComplexNumber num1, ComplexNumber num2) {
//        double real = num1.realPart*num2.realPart - num1.imagPart*num2.imagPart;
//        double imag = num1.realPart*num2.imagPart + num1.imagPart*num2.realPart;
//
////        Logger.getAnonymousLogger().info(num1 + "-" + num2 + "=" + result);
//
//        return new ComplexNumber(real,imag);
//    }

