public class HealthyEating {
    public static Food[] mealPrep(int numFoods) {
        Food[] foodArray = new Food[numFoods];
        Food[] values = Food.values();

        for (int i = 0; i < foodArray.length; i++) {
            int randomIndex = (int) (Math.random() * values.length);
            foodArray[i] = values[randomIndex];
        }
        return foodArray;

    }

    public static Food[] followRecipe(String recipe) {
        String[] recipeParts = recipe.split(" ");
        Food[] recipeArray = new Food[recipeParts.length];

        for (int i = 0; i < recipeArray.length; i++) {
            recipeArray[i] = Food.valueOf(recipeParts[i]);
        }

        return recipeArray;
    }

    public static void mealAnalyzer(Food[] foodArray) {
        System.out.println("The following types of food are in your meal:");

        for (Food foodType : Food.values()) {
            int count = 0;

            for (Food food : foodArray) {
                if (food == foodType) {
                    count++;
                }
            }

            System.out.printf("%s %d%n", foodType, count);
        }
    }

    public static void healthyChoice(Food[] meal1, Food[] meal2) {
        int ordinal1 = 0;
        int ordinal2 = 0;

        for (Food food : meal1) {
            ordinal1 += food.ordinal();
        }
        for (Food food : meal2) {
            ordinal2 += food.ordinal();
        }

        if (ordinal1 > ordinal2) {
            System.out.printf("The first meal is the healthier choice with a score of %d.%n", ordinal1);
        } else if (ordinal2 > ordinal1) {
            System.out.printf("The second meal is the healthier choice with a score of %d.%n", ordinal2);
        } else {
            System.out.printf("The two meals are equally healthy with a score of %d.%n", ordinal1);
        }

    }

    public static void main(String[] args) {
        Food[] meal1 = mealPrep(5);
        Food[] meal2 = mealPrep(5);

        meal1 = followRecipe("PROTEIN GRAIN VEGETABLE FRUIT");
        meal2 = followRecipe("JUNK_FOOD PROTEIN DAIRY VEGETABLE");

        mealAnalyzer(meal1);
        mealAnalyzer(meal2);

        healthyChoice(meal1, meal2);

    }

}