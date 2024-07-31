package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

// Remove elements: Remove the elements from given collection by using List Iterator.

public class LI1 {

    public static void main(String[] args) {
        
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Tomato");
        fruit.add("Potato");
        fruit.add("Chilli");
        fruit.add("Lemon");
        fruit.add("Avocado");
        fruit.add("Broccoli");
        System.out.println("Original List: " + fruit);
        
        ListIterator<String> s = fruit.listIterator();
        while (s.hasNext()) {
            String a = s.next();
            if (a.startsWith("o") || a.endsWith("o") || a.startsWith("O") || a.endsWith("O")) {
                s.remove();
            }
        }
        System.out.println("Updated List: " + fruit);
    }
}

