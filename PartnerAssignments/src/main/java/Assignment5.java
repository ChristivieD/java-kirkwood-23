import java.math.BigInteger;

import static org.apache.commons.lang.time.DurationFormatUtils.d;

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
            fraction1 = new Fraction(-4,-5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fraction13.mixedNumber());

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
        int gcd = greatestCommonDivisor(this.numerator, this.denominator);
        Fraction simplifiedFraction = new Fraction(this.numerator/ gcd , this.denominator/gcd);
        if((simplifiedFraction.numerator >= 0 && simplifiedFraction.denominator < 0) || (simplifiedFraction.numerator < 0 && simplifiedFraction.denominator < 0)){
            simplifiedFraction.numerator *= -1;
            simplifiedFraction.denominator *= -1;

        }
        return simplifiedFraction;
    }
    public String mixedNumber(){
        simplify();
        int quotient = this.numerator / this.denominator;
        int remainder = this.numerator % this.denominator;
        if(this.denominator == 1 || this.numerator == 0){
            return Integer.toString(this.numerator);
        }else if(this.numerator > this.denominator){
            if(remainder == 0){
                return Integer.toString(quotient);
            }
            else{
                return String.format("%d %d/%d", quotient,remainder, this.denominator);
            }
        }else if(this.numerator < 0 && Math.abs(this.numerator) > this.denominator){
            return String.format("%d %d/%d", quotient,remainder * -1, this.denominator);
        } else{
            return String.format("%d/%d", this.numerator, this.denominator);
        }

    }

    public String add(Fraction other){

//        Fraction addedFraction = new Fraction(this.numerator* this.denominator + this.numerator * this.denominator);
        return " ";
    }

}

