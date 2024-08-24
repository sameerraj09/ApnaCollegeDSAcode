import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ahashset {
 public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    hs.add(2);
    hs.add(3);
    hs.add(4);
    hs.add(2);
    System.out.println(hs.contains(2));
    // iteration
    //1st way
    Iterator it = hs.iterator(); //making iterator for our set
    while(it.hasNext()) // check there is next value or not id yes then it will print and update the iterator
    {
      System.out.println(it.next());
    }
    //2nd way advance iteration
    for(int i :hs){
      System.out.println(i);
    }
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    System.out.println(set);

    TreeSet<String> ts  = new TreeSet<>();
    ts.add("sameer");
    ts.add("raj");
    System.out.println(ts);

 }   
}
