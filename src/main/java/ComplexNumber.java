public class ComplexNumber {
    double realPart;
    double imagPart;
    
    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    double getImaginePart(){
        return imagPart;
    }
    double getRealPart(){
        return realPart;
    }

    @Override
    public String toString() {
        return "ComplexNumber = "+ realPart +
                " i" + imagPart;
    }
}
