package Collections;

/*LinkedList internally uses a doubly linked list to store the elements.
* Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
*
* */
import java.util.*;
public class LinkedListExample{
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.add("Sneha");
        al.add("Gadam");
        al.add("Phanii");
        al.add("Momo");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
