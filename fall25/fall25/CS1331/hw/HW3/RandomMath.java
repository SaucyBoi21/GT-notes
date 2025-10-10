import java.util.Scanner;
import java.util.Random;

public class RandomMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1, Powers of a Number");
        System.out.println("2, Random Positive Integer with Maximum");
        System.out.println("3, Area of Random Circle");
        System.out.println("4, Area of Random Square");
        System.out.println("What would you like to do?");

        int userInput = 0;
        boolean validInput = false;

        while(!validInput) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            } 
            else {
                validInput = true;
                userInput = choice;
            }
        }

        if (userInput == 1) {
            System.out.println("What number would you like to calculate the powers of? ");
            userInput = scanner.nextInt();
            if (userInput == -1) {
                System.out.println("-1 raised to 0 is 1");
                System.out.println("-1 raised to odd powers greater than 0 is -1");
                System.out.println("-1 raised to even powers greater than 0 is 1");
            }

            else if (userInput == 0) {
                System.out.println("0 raised to the 0 is 1");
                System.out.println("0 raised to powers greater than 0 is 0");
            }

            else if (userInput == 1) {
                System.out.println("1 raised to any power is still 1");
            }

            int power = 0;
            int exponent = 0; 

            do {
                exponent = (int) Math.pow(userInput, power);
                System.out.printf("%d raised to the power of %d is %d.%n", userInput, power, exponent);
                power++;
            }
            while (exponent * userInput < 100);
        }

        else if (userInput == 2) {
            System.out.println("What is the max value you want your random number to be?");
            userInput = scanner.nextInt();
            if (userInput < 1) {
                System.out.println("User input must be positive and non-zero.");
                return;
            }
            int randomInt = (int) (Math.random() * userInput) + 1;
            System.out.printf("Your random number %d.%n", randomInt);
        }

        else if (userInput == 3) {
            Random random = new Random();
            int circleRadius = random.nextInt(100) + 1;
            double circleArea = Math.PI * Math.pow(circleRadius, 2);
            double roundedCircleArea = Math.round(circleArea * 100.0) / 100.0;
            System.out.printf("A circle of radius %d has an area of %.2f.%n", circleRadius, roundedCircleArea);
        }

        else if (userInput == 4) {
            int sideLength = (int) (Math.random() * 100) + 1;
            int squareArea = sideLength * sideLength;
            System.out.printf("A square of side length %d has an area of %d.%n", sideLength, squareArea);
        }

        scanner.close();


        
    }
    
}
