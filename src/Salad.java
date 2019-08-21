import Ingredients.Vegetable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Salad {
    public ArrayList<Vegetable> salad;

    Salad( ArrayList<Vegetable> salad)
    {
        this.salad = salad;
    }

    public double calculateCalories()
    {
        double saladCalories = 0;
        for (Vegetable vegetable : salad) {
            saladCalories += vegetable.getCalories();
        }
        return saladCalories;
    }

    public void sortIngredientsByAlphabet()
    {
        Collections.sort(salad, new Comparator<Vegetable>() {
            public int compare(Vegetable o1, Vegetable o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public ArrayList<Vegetable> getVegetablesByCaloriesRange(double theLeastCalorie, double theBiggestCalorie)
    {
        ArrayList<Vegetable>vegetablesByCaloriesRange = salad;
        vegetablesByCaloriesRange.removeIf(v -> v.getCalories()<theLeastCalorie || v.getCalories()>theBiggestCalorie);
        return vegetablesByCaloriesRange;
    }
}
