import java.util.HashMap;

public class dnagram {

    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // If lengths are not equal, they cannot be anagrams
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // Count the frequency of each character in s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Decrease the frequency based on characters in s2
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!hm.containsKey(c)) {
                return false;
            }
            hm.put(c, hm.get(c) - 1);
            if (hm.get(c) == 0) {
                hm.remove(c);
            }
        }

        // If HashMap is empty, the strings are anagrams
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        boolean result = anagram(s1, s2);
        System.out.println(result);
    }
}
