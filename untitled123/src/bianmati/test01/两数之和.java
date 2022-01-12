package bianmati.test01;

public class 两数之和 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1,3}));
    }
    public static int pivotIndex(int[] nums) {
        int num=0;
        int all=0;
        int v=-1;
        for(int k=0;k<nums.length;k++)
        {
            num=num+nums[k];
        }
        int key=num-nums[0];
        if(key==0)
        {
            v=1;
        }else {
        for(int i=0;i<nums.length;i++)
        {
            all=all+nums[i];
            if((i+1)<nums.length) {
                if ((num - nums[i + 1]) == 2 * all) {
                    v = i+1;
                }
            }else {
                break;
            }
        }
        }
        return v;
    }
}
