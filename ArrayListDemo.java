
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

   public static void main(String[] args) {
      // Static Binding
      System.out.println("Static Binding");
      ArrayList l = new ArrayList();
      l.add(60);
      l.add(22.22f);
      l.add("Alfiya A T");
      System.out.println(l);
      l.remove(1);
      System.out.println(l);
      l.add(1, 80);
      l.add(500);
      l.add(500);
      System.out.println(l);
      System.out.println("\n");
      System.out.println("Dynamic Binding");
      // Dynamic Binding
      List list = new ArrayList();
      list.add(10);
      list.add(20);
      list.addAll(l);
      System.out.println(list);
      Iterator i = list.iterator();
      while (i.hasNext()) {
         System.out.println(i.next());
      }
      System.out.println("\n");
      System.out.println("Generics in ArrayList");
      // By using Generics
      List<Integer> l1 = new ArrayList<Integer>();
      l1.add(10);
      l1.add(100);
      System.out.println(l1);
   }

}