package bianmati.test03;

import java.util.Stack;

public class 栈拦截 {

    public static void main(String[] args) {
        System.out.println(isOutByStack(new int[]{3, 2, 1, 7, 8, 4, 5, 6}));
    }

    public static boolean isOutByStack(int[] nums) {
        // write your code here
        Stack stack=new Stack();
        int index=0;
        int n=0;
        boolean b=true;
        int ku=0;
        //数据 1,2,3,4
        for(int i=1;i<=nums.length;i++){
            if(nums[index]>i){
                stack.push(i);
                n++;
            }
            if(nums[index] == i){
                if(nums[ku]==(i-1)){
                    n+=1;
                }
                ku=index;
                index=n;
            }
            if(nums[index]<i){
                if((int)stack.peek()==nums[index]){
                    stack.pop();
                    index+=1;
                }else{
                    b=false;
                }
            }
        }
        return b;
    }
}
