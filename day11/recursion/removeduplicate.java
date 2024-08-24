public class removeduplicate {
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean[] map) {
        if (idx == str.length()) {// base case
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {// present in array, duplicate
            removeDuplicate(str, idx + 1, newString, map);
        } else { // did not encounter
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newString.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollenge";
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
