package BreakLeetcode;
import java.util.*;
public class ValidTraigleNumber {
    public static int triangleNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    if(nums[i]+nums[j]>nums[k])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] a={4,2,3,4};
        int res=triangleNumber(a);
        System.out.println(res);
    }
}
