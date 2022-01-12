package bianmati.算法;

import java.util.HashMap;
import java.util.Scanner;

public class 出售 {

    private static int m,n=0;


    public static void main(String[] args) {
      zhanshi();
    }

    public static int[] shuruint(){
        Scanner s1=new Scanner(System.in);
        String s2=s1.next();
        char[] char1=s2.toCharArray();
        int[] s=new int[2];
        int k=0;
        for(int i=0;i<char1.length;i++){
            if(char1[i]!=','){
                String j= String.valueOf(char1[i]);
                s[k]=Integer.valueOf(j);
                k++;
            }
        }
        return s;
    }

    public static String[] shuruString(){
        Scanner s2=new Scanner(System.in);
        String g=s2.next();
        char[] char1=g.toCharArray();
        String[] s=new String[3];
        int k=0;
        for(int i=0;i<char1.length;i++){
            if(char1[i]!=','){
                String j= String.valueOf(char1[i]);
                s[k]=j;
                k++;
            }
        }
        return s;
    }

    public static String[] shuruString2(){
        Scanner s2=new Scanner(System.in);
        String g=s2.next();
        char[] char1=g.toCharArray();
        String[] s=new String[2];
        int k=0;
        for(int i=0;i<char1.length;i++){
            if(char1[i]!=','){
                String j= String.valueOf(char1[i]);
                s[k]=j;
                k++;
            }
        }
        return s;
    }


    public static void zhanshi(){
        int[] number1=shuruint();
        m=number1[0];
        n=number1[1];
        HashMap hashMap1=new HashMap();
        for(int j=0;j<m;j++){
            String[] name=shuruString();
            hashMap1.put("name"+j,name);
        }
        HashMap hashMap2=new HashMap();
        for(int j=0;j<n;j++){
            String[] name=shuruString2();
            hashMap1.put("names"+j,name);
        }
        System.out.println(hashMap1.keySet());
        System.out.println(hashMap2.keySet());
    }
}
