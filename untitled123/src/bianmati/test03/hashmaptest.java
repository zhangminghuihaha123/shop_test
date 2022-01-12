package bianmati.test03;

import java.util.HashMap;
import java.util.Scanner;

public class hashmaptest {
    public static void main(String[] args) {
        String str = "anihC";
        // write your code here
        char[] chars=str.toCharArray();
        char a;
        for(int i=0;i<chars.length/2;i++){
            a=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=a;
        }
        StringBuilder s=new StringBuilder(String.valueOf(chars));
        System.out.println(s.toString());
    }
}
