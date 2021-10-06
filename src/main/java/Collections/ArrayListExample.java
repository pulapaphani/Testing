package Collections;


import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Sneha");//Adding object in arraylist
            list.add("Gadam");
            list.add("Phani");
            list.add("Momo");
            //Printing the arraylist object
            System.out.println(list);

            //Traversing list through Iterator
            Iterator itr=list.iterator();//getting the Iterator
            while(itr.hasNext()){//check if iterator has the elements
                System.out.println(itr.next());//printing the element and move to next
            }
        }
    }
