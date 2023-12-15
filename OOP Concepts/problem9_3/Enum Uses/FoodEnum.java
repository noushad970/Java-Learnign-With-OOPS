public class FoodEnum{
    enum Food {
        APPLE("Fruit", 95),
        BANANA("Fruit", 105),
        CARROT("Vegetable", 25);

        private final String type;
        private final int calories;

        Food(String type, int calories) {
            this.type = type;
            this.calories = calories;
        }

        public String getType() {
            return type;
        }

        public int getCalories() {
            return calories;
        }
    }

    public static void main(String[] args) {
        System.out.println("Food Information:");
        for (Food food : Food.values()) {
            System.out.println("Name: " + food.name());
            System.out.println("Type: " + food.getType());
            System.out.println("Calories: " + food.getCalories() + " calories");
            System.out.println();
        }
    }
}
