package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 16;
            hexadecimal.insert(0, HEX.charAt(remainder));
            decimalNumber /= 16;
        }

        return hexadecimal.toString();

    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }

        int decimal = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            char c = hexNumber.charAt(i);
            int digit = HEX.indexOf(Character.toLowerCase(c));
            if (digit == -1) {
                return 0;
            }
            decimal = 16 * decimal + digit;
        }

        return decimal;
    }
}
