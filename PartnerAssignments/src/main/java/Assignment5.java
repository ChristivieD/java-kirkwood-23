import java.math.BigInteger;

public class Assignment5 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        System.out.println(fraction1);

        Fraction  fraction2 = null;
        try {
            fraction2 = new Fraction(27, 0);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            fraction2 = new Fraction();
        }
        System.out.println(fraction2);
        System.out.println(fraction2.getNumerator());
        System.out.println(fraction2.getDenominator());
        fraction2.setNumerator(30);
        try{
            fraction2.setDenominator(45);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction2);

        try{
            Fraction fraction3 = new Fraction(3,0);

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            fraction2.setDenominator(0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(Fraction.greatestCommonDivisor(75,45));
        System.out.println(Fraction.greatestCommonDivisor(2,4));
        System.out.println(Fraction.greatestCommonDivisor(5,7));



    }
}
class Fraction{
    private int numerator;
    private int denominator;

    @Override
    public String toString() {
        String result = String.format("%d/%d", this.numerator, this.denominator);
        return result;
    }

    public Fraction(){
        numerator = 1;
        denominator = 1;


    }


    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0) {
            throw new IllegalArgumentException(" the denomination cannot be zero");
        }
        this.denominator = denominator;
    }
     public static int greatestCommonDivisor(int num1, int num2){
         BigInteger a = BigInteger.valueOf(num1);
         BigInteger b = BigInteger.valueOf(num2);
         BigInteger gcd = a.gcd(b);
         return gcd.intValue();
     }

}

