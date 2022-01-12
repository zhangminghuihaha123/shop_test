package bianmati.算法;

import java.util.HashMap;

public class 斐波那契 {
    /*一般来说，循环比递归更高效，因为add1方法只需要走一次，而add方法需要走n-2次*/
    public static void main(String[] args) {
        System.out.println(new 斐波那契().add(20));
        System.out.println(new 斐波那契().add1(20));
    }

    //递归
    public int add(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int num=add(n-1)+add(n-2);
        return num;
    }

    //循环
    public int add1(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int i1=1;//指针1
        int i2=2;//指针2
        int num = 0;
        for(int i=3;i<=n;i++){
            num=i1+i2;
            i1=i2;
            i2=num;
        }
        return num;
    }
}
