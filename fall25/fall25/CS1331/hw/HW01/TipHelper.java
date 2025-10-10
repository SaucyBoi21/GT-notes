/*
 * Hello! My name is Saahas Swaroop.
 * One thing that I wish more people knew about me is that I am a huge fan of chess.
 * 
 */

public class TipHelper {
    public static void main(String[] args) {
        double tipPercentage = 0.15;
        double mealTotal = 20.179;
        int numberOfItemsOrdered = 3;
        String customerName = "Jacob";
        double totalTip = (tipPercentage * mealTotal);
        
        int tempTip = (int)(totalTip * 100);
        double tipTrunc = tempTip / 100.0;

        double totalAmountPaid = tipTrunc + mealTotal;

        int tempTotal = (int)(totalAmountPaid * 100);
        double totalTrunc = tempTotal / 100.0;

        System.out.println(customerName + " ordered " + numberOfItemsOrdered + " meal items");
        System.out.println("The total tip was $" + tipTrunc);
        System.out.println("They owe a total of $" + totalTrunc);
    }
}