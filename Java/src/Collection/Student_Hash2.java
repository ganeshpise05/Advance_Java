package Collection;

import java.util.HashSet;
import java.util.Objects;

class Fruit {
    String name;
    String color;

    // Constructor
    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return name.equals(fruit.name) && color.equals(fruit.color);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Fruit{name='" + name + "', color='" + color + "'}";
    }
}

public class Student_Hash2 {

    public static void main(String[] args) {
        // Create a HashSet of Fruit objects
        HashSet<Fruit> fruitSet = new HashSet<>();

        // Add elements to the HashSet
        fruitSet.add(new Fruit("Apple", "Red"));
        fruitSet.add(new Fruit("Banana", "Yellow"));
        fruitSet.add(new Fruit("Orange", "Orange"));

        // Trying to add a duplicate element
        fruitSet.add(new Fruit("Apple", "Red")); // This will be ignored

        // Print the HashSet
        System.out.println("Fruit set: " + fruitSet);

        // Check if a specific element is in the HashSet
        System.out.println("Does the set contain an orange? " + fruitSet.contains(new Fruit("Orange", "Orange")));

        // Remove an element
        fruitSet.remove(new Fruit("Banana", "Yellow"));
        System.out.println("After removing Banana: " + fruitSet);

        // Print the size of the set
        System.out.println("Number of fruits in the set: " + fruitSet.size());

        // Clear the set
        fruitSet.clear();
        System.out.println("Is the set empty after clear? " + fruitSet.isEmpty());
    }
}

