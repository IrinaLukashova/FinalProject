package Calculator;
import Fabric.Fabric;
import Operator.Operator;
import Operator.ComplexNumber;


public class Calculator {
        public ComplexNumber calculate (ComplexNumber num1, ComplexNumber num2, String operat) {
            Operator operator = Fabric.createOperation(operat);
            return operator.operate(num1, num2);
        }
}
