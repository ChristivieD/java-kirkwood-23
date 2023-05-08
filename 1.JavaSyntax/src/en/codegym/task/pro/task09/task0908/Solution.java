package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }
        if (!binaryNumber.matches("[01]+")) {
            return "";
        }
        int length = binaryNumber.length();
        if (length % 4 != 0) {
            binaryNumber = "0".repeat(4 - length % 4) + binaryNumber;
            length = binaryNumber.length();
        }
        StringBuilder hexBuilder = new StringBuilder(length / 4);
        for (int i = 0; i < length; i += 4) {
            int decimal = Integer.parseInt(binaryNumber.substring(i, i + 4), 2);
            hexBuilder.append(Integer.toHexString(decimal));
        }
        return hexBuilder.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return "";
        }
        if (!hexNumber.matches("[0-9a-fA-F]+")) {
            return "";
        }
        int length = hexNumber.length();
        StringBuilder binaryBuilder = new StringBuilder(length * 4);
        for (int i = 0; i < length; i++) {
            int decimal = Character.digit(hexNumber.charAt(i), 16);
            String binary = Integer.toBinaryString(decimal);
            binaryBuilder.append("0".repeat(4 - binary.length())).append(binary);
        }
        return binaryBuilder.toString();
    }
}
