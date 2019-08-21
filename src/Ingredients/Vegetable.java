package Ingredients;
import static java.lang.Math.abs;

public class Vegetable {
    private String name;
    private double calories;

    public Vegetable(String name, double calories) {
        this.name = name;
        this.calories = abs(calories);
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name + " " + calories;
    }
}
