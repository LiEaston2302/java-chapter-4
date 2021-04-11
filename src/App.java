import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {
    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Declare the Chapter 2 Milestone 2 method here
    void milestone2(double num2_2) {
        System.out.println((int) num2_2);
        System.out.println((int) ((num2_2 - (int) num2_2) * 100));
    }

    // Declare the Chapter 2 Milestone 3 method here
    void milestone3() {
        int i;
        int j;
        for (i = 2; i < 101; i++) {
            boolean isprime = true;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
        }
    }

    // Declare the Chapter 2 Milestone 4 method here
    void milestone4(int seconds){
    int days;
    int hours;
    int minutes;
    int user_seconds;
    days = seconds / (60 * 60 * 24);
    seconds = seconds % (60 * 60 * 24);
    hours = seconds / (60 * 60);
    seconds = seconds % (60 * 60);
    minutes = seconds / (60);
    seconds = seconds % (60);
    user_seconds = seconds / 1;
    seconds = seconds % 1;
    System.out.println("Days: " + days);
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + user_seconds);
    }
}


public class App {
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }

    // Declare the Chapter 1 Milestone 2 method here
    static void chapter1milestone2(double num1_2a, double num1_2b) {
        System.out.println("The average is: " + ((num1_2a + num1_2b) / 2));
    }

    // Declare the Chapter 1 Milestone 3 method here
    static void chapter1milestone3(double radius){
        double circumfrence;
        double area;
        double pi;
        pi = 3.14;
        area = (pi * radius) * radius;
        circumfrence = (pi * radius) * 2;
        System.out.println("Circumfrance: " + String.format("%.2f", circumfrence));
        System.out.println("Area: " +  String.format("%.2f", area));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        // Call the Chapter 1 Milestone 3 method here
        chapter1milestone3(radius);

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        // Call the Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 Milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        System.out.println("The Prime Numbers Between 2-100\n");
        // Call the Chapter 2 Milestone 3 method here
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 Milestone 4 method here
        chapter2.milestone4(seconds);

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        // Call the Chapter 3 Milestone 1 method here. Write the code below like usual
        Chapter3 chapter3 = new Chapter3();
        chapter3.milestone1(num3_1a, num3_1b);

        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        // Call the Chapter 3 Milestone 2 method here
        System.out.println("Enter a positive number: \n");
        chapter3.milestone2(scanner);

        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        int min = 1;
        int max = 12;
        int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randNum1);
        System.out.println(randNum2);
        System.out.println("What is the product of these two numbers?");
        int num3_3 = scanner.nextInt();
        // Call the Chapter 3 Milestone 3 method here
        chapter3.milestone3(randNum1, randNum2, num3_3);

        scanner.close();
    }
}
