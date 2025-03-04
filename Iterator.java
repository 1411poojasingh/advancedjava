import java.util.*;
import java.util.Iterator;
class Iteratorex 
{
 public static void main(String[] args) {
      ArrayList <String> a = new ArrayList <String>();
     a.add("Apple");
     a.add("Banana");
     a.add("Orange");
     a.add("Mango");
     a.add("Grapes");
    Iterator it = a.iterator();
    while(it.hasNext())
    System.out.println(it.next());

 }
}