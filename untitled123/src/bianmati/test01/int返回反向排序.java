package bianmati.test01;

import java.util.LinkedList;

public class int返回反向排序 {
    public static void main(String[] args) {
        System.out.println(arr(123456729));
    }

    public static String arr(int a)
    {
        String s0=String.valueOf(a);
        char[] chaes=new char[s0.length()];
        StringBuilder stringBuilder=new StringBuilder();
        for(int j=0;j<chaes.length;j++)
        {
            chaes[j]=s0.toCharArray()[j];
        }
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<s0.length();i++)
        {
            linkedList.addFirst(chaes[i]);
        }
        char[] strings=new char[chaes.length];
        for(int k=0;k<chaes.length;k++)
        {
            strings[k]= (char) linkedList.getFirst();
            linkedList.removeFirst();
        }
        String str=new String(strings);
        return str;
    }
}
