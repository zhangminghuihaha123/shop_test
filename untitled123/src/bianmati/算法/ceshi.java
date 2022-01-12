package bianmati.算法;

import java.util.ArrayList;

public class ceshi {
    public static void main(String[] args) {
       input(12345);
    }
    public static void input(int a){
        String str=String.valueOf(a);
        int num=str.length();
        System.out.println(num);
        char[] chars=str.toCharArray();
        //1 2 3 4 5  5位
        for(int i=0;i<str.length()/2;i++){
            char x=chars[str.length()-1-i];
            chars[str.length()-1-i]=chars[i];
            chars[i]=x;
        }
        String s=new String(chars);
        int s1=Integer.valueOf(s);
        System.out.println(s1);
    }
}
