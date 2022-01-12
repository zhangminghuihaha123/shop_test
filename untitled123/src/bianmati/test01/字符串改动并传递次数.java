package bianmati.test01;

import java.util.ArrayList;
import java.util.List;

public class 字符串改动并传递次数 {
    public static void main(String args[])
    {
        List list=new ArrayList();
        list=arr("dsafanfvapdifiaiogfa");
        System.out.println("字符串+    "+list.get(0));
        System.out.println("改动次数+    "+list.get(1));
    }
    public static List arr(String s1)
    {
        StringBuilder s0=new StringBuilder();
        int number=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.toCharArray()[i]=='a')
            {
                s0.append('b');
                number=number+1;
            }else{
                s0.append(s1.toCharArray()[i]);
            }
        }
        List list=new ArrayList();
        list.add(s0.toString());
        list.add(number);
        return list;

    }
}
