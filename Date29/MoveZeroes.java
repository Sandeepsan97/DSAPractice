package BreakLeetcode;

public class MoveZeroes {

        public  static void moveZeroes(int[] nums) {
            if (nums.length == 1) {
                return;
            }

            int nonZeroIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[nonZeroIndex] = nums[i];
                    nonZeroIndex++;
                }
            }


            while(nonZeroIndex<nums.length){
                nums[nonZeroIndex] = 0;
                nonZeroIndex++;
            }
        }

    public static void main(String[] args) {
        int [] a={0,1,0,3,12};
        moveZeroes(a);
        System.out.println(a);
    }
}
