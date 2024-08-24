public class optimizeduplicate {
    public static boolean duplicate(int [] arr) {
        HashSet<Integer>set =new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(set.contains(num[i])){
                return true;
            }
            set.add(nums[i]);
        }
    
    return false;
}
}

