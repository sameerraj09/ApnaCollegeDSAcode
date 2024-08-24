import java.util.HashMap;

public class FindItinerary {
    public static String getFirst(HashMap<String, String> hm) {
        HashMap<String, String> rev = new HashMap<>();
        for (String k : hm.keySet()) {
            rev.put(hm.get(k), k);
        }
        for (String k : hm.keySet()) {
            if (!rev.containsKey(k)) {
                return k;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String start = getFirst(hm);
        if (start == null) {
            System.out.println("No valid starting point found.");
            return;
        }

        System.out.print(start);
        while (hm.containsKey(start)) {
            String next = hm.get(start);
            System.out.print(" --> " + next);
            start = next;
        }
    }
}
