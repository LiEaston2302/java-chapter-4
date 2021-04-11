import java.util.Scanner;
public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here

    public void milestone1(int num3_1a, int num3_1b) {
        int x = 0;
        for (x = num3_1a; x <= num3_1b; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
                if (x % num3_1a == 0) {
                    break;
                }
            }
        }
    }
    
    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner) {
        int usernum1; 
        int sum = 0; 
        int count = 0; 
        System.out.println("Enter a positive number: \n");
        usernum1 = scanner.nextInt();
        while (usernum1 > 0) {
            System.out.println(
                    "Please enter another number. If you wish to stop, enter a negative number to see your average.");
            count++;
            sum += usernum1;
            usernum1 = scanner.nextInt();
        }
        System.out.println((double) sum / count);
    }

    public void milestone3(int num1, int num2, int answer) {
        if (num1 * num2 == answer)
            System.out.println("Correct!");
        else
            System.out.println("Incorrect, the answer was " + (num1 * num2));
    }
}