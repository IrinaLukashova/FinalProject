package Fabric;

import Operator.*;

import java.util.logging.Logger;

public class Fabric {
    public static Operator createOperation (String operator) {
        switch (operator) {
            case "+":
                return new Sum();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                Logger.getAnonymousLogger().severe("недопустимый оператор");
                throw new IllegalArgumentException("недопустимый оператор");
        }
    }
}
