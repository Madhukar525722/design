import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class DSA {
    
    public static void main(String[] args) {
        //Array
        int[] arr1 = new int[2];
        arr1[0] = 0;
        arr1[1] = 1;

        for(int i=0;i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        //Intialization
        int size = 2;
        int initialValue = 5;
        int[] array = new int[size];

        Arrays.fill(array, initialValue);

        //ArrayList
        //import java.util.ArrayList;
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");

        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        //Initalization of arrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Collections.nCopies(size, initialValue));
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(arrayList.size() - 1);

        //Linked List
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("Numbers: " + numbers);

        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("Updated numbers: " + numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("Final numbers: " + numbers);

        for(int i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i) + " ");
        }

        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        
        // Checking if a key is present
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present in the map.");
        }

        map.remove("Banana");

        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }

        

    }
}
