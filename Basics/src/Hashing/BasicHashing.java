package Hashing;

import java.util.HashMap;

public class BasicHashing {
    public static void main(String[] args) {
        HashMap<String , Integer>  map = new HashMap<>();
        map.put("Ashish" , 1);
        map.put("Virat" , 18);
        map.put("Rohit" , 45);
        System.out.println(map.containsKey("Ashish"));
    }
}
