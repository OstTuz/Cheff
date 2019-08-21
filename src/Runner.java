import Ingredients.Vegetable;
import java.util.ArrayList;

public class Runner {
    static ArrayList<Vegetable> vegetables = new ArrayList<>()
    {
        {
            this.add(new Vegetable("Cabbage", 227));
            this.add(new Vegetable("Potato", 164));
            this.add(new Vegetable("Olives", 2));
            this.add(new Vegetable("Tomato", 20));
            this.add(new Vegetable("Spinach",78));
            this.add(new Vegetable("Corn", 562));
        }
    };

    public static void main(String[] args) {
        Salad summerSalad = new Salad(vegetables);
        summerSalad.salad.add(new Vegetable("Cucumber", 66));
        System.out.println("Summer salad has "+summerSalad.calculateCalories()+" calories");
        summerSalad.sortIngredientsByAlphabet();
        System.out.println("Ingredients:");
        System.out.println(summerSalad.salad.toString());
        int theLeastCalorieInRange = 100;
        int theBiggestCalorieInRange = 500;
        System.out.println("Ingredients that have more than "+theLeastCalorieInRange+" and less than "+theBiggestCalorieInRange+" calories:");
        System.out.println(summerSalad.getVegetablesByCaloriesRange(100, 500).toString());
    }
}
