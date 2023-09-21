/* I have neither given nor received any unauthorised aid on this piece of work */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a test for the add method (2 integers)!");
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        int resultOne = add(a, b);
        System.out.println("The final sum is:  " + resultOne);

        System.out.println("\nThis is a test for the greeting method!");
        System.out.println("What's your name? ");
        String yourName = scanner.next();
        String resultTwo = greeting(yourName);
        System.out.println(resultTwo);

        System.out.println("\nThis is a test for the add method (4 integers)!");
        System.out.println("Enter the first number: ");
        int one = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int two = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int three = scanner.nextInt();
        System.out.println("Enter the fourth number: ");
        int four = scanner.nextInt();
        int resultThree = add(one, two, three, four);
        System.out.println("The final sum is: " + resultThree);

        System.out.println("\nThis is a test for the printMe method!");
        System.out.println("What message do you want to be printed? ");
        String message = scanner.next() + scanner.nextLine();
        printMe(message);
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int tempOne = add(numOne, numTwo);
        int tempTwo = add(tempOne, numThree);
        return add(tempTwo, numFour);
    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }
}
