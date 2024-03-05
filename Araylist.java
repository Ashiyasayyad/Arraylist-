import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Accessing elements using get() method
        System.out.println("Element at index 1: " + fruits.get(1));

        // Removing element using remove() method
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Checking if an element is present using contains() method
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Getting the size of the ArrayList using size() method
        System.out.println("Size of ArrayList: " + fruits.size());

        // Clearing the ArrayList using clear() method
        fruits.clear();
        System.out.println("After clearing ArrayList: " + fruits);
    }
}
