public class Ternary {
    public static void main(String[] args) {
        int initialNum = 100;
        String answer = "";
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        int currentNum = initialNum;

        while (currentNum != 0) {
            int digit = currentNum % 3;

            if (digit == 0) {
                zeroCount++;
            }
            if (digit == 1) {
                oneCount++;
            }
            if (digit == 2) {
                twoCount++;
            }

            answer = digit + answer;
            currentNum /= 3;
        }

        System.out.printf("\nDecimal representation: %d", initialNum);
        System.out.printf("\nTernary representation: %s", answer);
        System.out.printf("\n%d zeros, %d ones, %d twos.", zeroCount, oneCount, twoCount);

        int digitSum = zeroCount + oneCount + twoCount;

        switch (digitSum % 5) {
            case 0 -> System.out.println("The ternary digits sum to a multiple of 5!");
            case 1 -> System.out.println("The ternary digits almost summed to a multiple of 5!");
            case 4 -> System.out.println("Nope!");
            default -> System.out.println("Nope!");
        }

        String output = (zeroCount > oneCount && zeroCount > twoCount) ? "Zero is the most used digit."
                : "Zero is not the most used digit.";
        System.out.printf("\n%s", output);

    }

}
