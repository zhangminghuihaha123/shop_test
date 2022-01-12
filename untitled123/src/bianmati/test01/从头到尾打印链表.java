package bianmati.test01;

import java.util.LinkedList;

public class 从头到尾打印链表 {
    public static void main(String[] args) {
        LinkedList  linkedList=new LinkedList();
        String[] arr={"a","b","c","d","e","f"};
        for(int i=0;i<arr.length;i++)
        {
            linkedList.addFirst(arr[i]);
        }
        String[] num=new String[linkedList.size()];
        for(int j=0;j<arr.length;j++)
        {
            num[j]= (String) linkedList.getFirst();
            linkedList.removeFirst();
        }
        for(int d=0;d<num.length;d++)
        {
            System.out.println(num[d]);
        }
    }
}
