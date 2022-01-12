package bianmati.test01;

import java.util.ArrayList;
import java.util.List;

public class 判断数组A中是否含有数组B的元素 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list=a("ASDFGHJKLDEDEDE","DE");
        for(int j=0;j<list.size();j++)
        {
            System.out.println("第"+list.get(j)+"位");
        }
    }

    public static List a(String s1, String s2)
    {
        int length=s2.length();
        char x=s2.charAt(0);
        int key=-1;
        List list=new ArrayList();
        list.add(key);
        char[] chars=s1.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==x)
            {
                String s3=s1.substring(i,i+s2.length());
                if(s3.equals(s2)){
                    key=i+1;
                    if(list.get(0).equals(-1))
                    {
                        list.remove(0);
                        list.add(key);
                    }else {

                        list.add(key);
                    }
                }
            }
        }
        return list;
    }
}
