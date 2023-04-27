import java.math.BigInteger;
import java.util.Scanner;

//import static org.apache.commons.lang.time.DurationFormatUtils;

public class Assignment5 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        Fraction fraction4 = new Fraction();
        Fraction fraction5 = new Fraction();
        Fraction fraction6 = new Fraction();
        Fraction fraction7 = new Fraction();
        Fraction fraction8 = new Fraction();
        Fraction fraction9 = new Fraction();
        Fraction fraction10 = new Fraction();
        Fraction fraction11 = new Fraction();
        Fraction fraction12 = new Fraction();
        Fraction fraction13 = new Fraction();
        Fraction fraction14 = new Fraction();
        Fraction fraction15 = new Fraction();
        Fraction fraction16 = new Fraction();
        Fraction fraction17 = new Fraction();
        Fraction fraction18 = new Fraction();
        Fraction fraction19 = new Fraction();
        Fraction fraction20 = new Fraction(13,5);
        Fraction fraction21 = new Fraction(4,8);
        Fraction fraction22 = new Fraction(-13,-5);
        Fraction fraction23 = new Fraction(13,-5);
        Scanner scanner = new Scanner(System.in);
        // first fraction
        System.out.println("enter the first numerator: ");
        int num1 = scanner.nextInt();
        System.out.println("enter the first denominator: ");
        int denom1 = scanner.nextInt();
        // second fraction
        System.out.println("enter the second numerator: ");
        int num2 = scanner.nextInt();
        System.out.println("enter the second denominator: ");
        int denom2 = scanner.nextInt();
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

        try{
            fraction4 = new Fraction(75,45);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction4.simplify());

        try{
            fraction5 = new Fraction(2,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction5.simplify());

        try{
            fraction6 = new Fraction(5,7);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction6.simplify());

        try{
            fraction7 = new Fraction(-2,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction7.simplify());
        try{
            fraction8 = new Fraction(2,-4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction8.simplify());
        try{
            fraction9 = new Fraction(-2,-4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction9.simplify());

        try{
            fraction10 = new Fraction(4,1);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction10.mixedNumber());
        try{
            fraction11 = new Fraction(0,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction11.mixedNumber());
        try{
            fraction12 = new Fraction(4,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction12.mixedNumber());
        try{
            fraction13 = new Fraction(8,4);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction13.mixedNumber());
        try{
            fraction14 = new Fraction(4,8);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction14.mixedNumber());
        try{
            fraction15 = new Fraction(13,5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction15.mixedNumber());
        try{
            fraction16 = new Fraction(-13,5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction16.mixedNumber());
        try{
            fraction17 = new Fraction(13,-5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction17.mixedNumber());
        try{
            fraction18 = new Fraction(-13,-5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction18.mixedNumber());
        try{
            fraction19 = new Fraction(-4,-5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction19.mixedNumber());
        try {
            fraction20 = new Fraction(13, 5);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            fraction20 = new Fraction();
        }
        fraction20.setNumerator(13);
        try{
            fraction20.setDenominator(5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction20.add(fraction21));
        try {
            fraction22 = new Fraction(-13, -5);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            fraction22 = new Fraction();
        }
        fraction22.setNumerator(-13);
        try{
            fraction22.setDenominator(-5);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction22.add(fraction23));


        Fraction fraction0 = null;
        Fraction fraction = null;
        try {
            fraction0 = new Fraction(num1, denom1);
            fraction = new Fraction(num2, denom2);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            fraction0 = new Fraction();
        }
        fraction0.setNumerator(num1);
        try{
            fraction0.setDenominator(denom1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(fraction0.add(fraction));
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }


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

    public Fraction simplify(){
        int gcd = greatestCommonDivisor(numerator, denominator);
        Fraction simplifiedFraction = new Fraction(numerator/ gcd , denominator/gcd);
        if((simplifiedFraction.numerator >= 0 && simplifiedFraction.denominator < 0) || (simplifiedFraction.numerator < 0 && simplifiedFraction.denominator < 0)){
            simplifiedFraction.numerator *= -1;
            simplifiedFraction.denominator *= -1;

        }
        return simplifiedFraction;
    }
    public String mixedNumber(){
        Fraction fraction = simplify();
        int quotient = fraction.numerator / fraction.denominator;
        int remainder = fraction.numerator % fraction.denominator;
        if(fraction.denominator == 1 || fraction.numerator == 0){
            return Integer.toString(fraction.numerator);
        }else if(fraction.numerator > fraction.denominator){
            if(remainder == 0){
                return Integer.toString(quotient);
            }
            else{
                return String.format("%d %d/%d", quotient,remainder, fraction.denominator);
            }
        }else if(fraction.numerator < 0 && Math.abs(fraction.numerator) > fraction.denominator){
            if(remainder == 0){
                return Integer.toString(quotient);
            }
            else{
                return String.format("%d %d/%d", quotient,remainder * -1, fraction.denominator);
            }
        } else if(fraction.numerator == fraction.denominator){
            return "1";
        } else{
            return String.format("%d/%d", fraction.numerator, fraction.denominator);
        }

    }

    public String add(Fraction other){

       Fraction addedFraction = new Fraction((this.numerator* other.denominator) + (other.numerator * this.denominator),
               this.denominator * other.denominator);
        return this.mixedNumber() + " + " + other.mixedNumber() + " = " + addedFraction.mixedNumber();
    }

}

