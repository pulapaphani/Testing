package Collections;

/*
* A list can contain duplicate elements whereas Set contains unique elements only.
*   HashSet contains unique elements only.
    HashSet allows null value.
    HashSet class is non synchronized . -- not thread safe
    * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.


 * */
import java.util.*;
class HashSetExample{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("Sneha");
        set.add("Gadam");
        set.add("Phani");
        set.add("Sneha");
        set.add("Momo");
        set.add("Sneha");
        set.add("Momo");
        set.add(null);
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}

// observe duplicates are removed
