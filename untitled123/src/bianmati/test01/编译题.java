package bianmati.test01;

import java.util.LinkedList;

public class 编译题 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 7, 9}, 6));
    }
    public static int searchInsert(int[] nums, int target) {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                n=i;
            }
            if((i+1)<nums.length) {
                if (nums[i] < target && nums[i + 1] > target) {
                    n = i + 1;
                }
            }
            if(nums[nums.length-1]<target){
                n=nums.length;
            }
        }
        return n;
    }
}
