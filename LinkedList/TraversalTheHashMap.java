package LinkedList;

import java.util.HashMap;
import java.util.Map.Entry;

public class TraversalTheHashMap {
	public static void main(String[] args) 
    { 
        // initialize a HashMap 
        HashMap<String, Integer> map = new HashMap<>(); 
  
        // Add elements using put method 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
        map.put("vaibhav", 40); 
  
        // Iterate the map using 
        // for-each loop 
        for (Entry<String, Integer> e : map.entrySet()) 
            System.out.println("Key: " + e.getKey() 
                               + " Value: " + e.getValue()); 
    } 
}
