import java.util.*;

public class ahashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 50);
        hm.put("UK", 20);
        hm.put("us", 1);
        hm.put("JAPAN", 10);
        System.out.println(hm);

        // get key --> will give the value of particular key
        int pop = hm.get("india");
        System.out.println(pop);

        // contains key---> check the following key is exist or not and them give true
        // or false
        System.out.println(hm.containsKey("india"));

        // remove ---> delete the particular value for the corresponding key and return
        // the value
        System.out.println(hm.remove("india"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isempty
        System.out.println(hm.isEmpty());
        // clear
       // hm.clear();

        // iterations
        Set<String> keys = hm.keySet(); // we are storing all the key in a set name key by using the keySet function

        // now we have all the key with us we will use for each loop to get value for each key
        for (String k : keys) {
            System.out.println("key = " + k + "value = " + hm.get(k));
        }

    }
}
