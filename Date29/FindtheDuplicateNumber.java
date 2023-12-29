package BreakLeetcode;

public class FindtheDuplicateNumber {
    public static int findDuplicate_bs(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
    public static void main(String[] args) {
        int []aa={1,3,4,2,2};
        int res=findDuplicate_bs(aa);
        System.out.println(res);


    }
}
