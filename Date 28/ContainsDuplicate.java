package BreakLeetcode;
import java.util.*;
public class ContainsDuplicate {

        public static boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    return true;
                }
                map.put(nums[i],1);
            }
            return false;
        }

    public static void main(String[] args) {
            int []a={1,2,3,1};
            boolean res=containsDuplicate(a);
        System.out.println(res);

    }
}
