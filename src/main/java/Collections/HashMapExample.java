package Collections;


import java.util.HashMap;
import java.util.Map;


/*
* Points to remember
Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
*
* */
public class HashMapExample {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Sneha");  //Put elements in Map
        map.put(2,"Gadam");
        map.put(3,"Phani");
        map.put(4,"Momo");
        map.put(null,null);

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
