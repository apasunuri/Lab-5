import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputNumber, numberLowerCase;
        int length, i, value, power = 0;
        long decimalNumber = 0;

        System.out.println("Enter a hexadecimal number:");
        inputNumber = scan.nextLine();

        numberLowerCase = inputNumber.toLowerCase();
        length = numberLowerCase.length();
        i = length - 1;

        while(i >= 0) {
           if (numberLowerCase.charAt(i) == 'a') {
               decimalNumber += Math.pow(16, power) * 10;
           } else if (numberLowerCase.charAt(i) == 'b') {
               decimalNumber += Math.pow(16, power) * 11;
           } else if (numberLowerCase.charAt(i) == 'c') {
               decimalNumber += Math.pow(16, power) * 12;
           } else if (numberLowerCase.charAt(i) == 'd') {
               decimalNumber += Math.pow(16, power) * 13;
           } else if (numberLowerCase.charAt(i) == 'e') {
               decimalNumber += Math.pow(16, power) * 14;
           } else if (numberLowerCase.charAt(i) == 'f') {
               decimalNumber += Math.pow(16, power) * 15;
           } else if (numberLowerCase.charAt(i) == 'x') {
               break;
           } else {
               value = (int) numberLowerCase.charAt(i);
               decimalNumber += (value - 48) * Math.pow(16, power);
           }
           i--;
           power++;
        }
        System.out.println("Your number is " + decimalNumber + " in decimal");
        }
    }
