package bianmati.test01;

import java.util.LinkedList;

public class 栈2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<10;i++)
        {
            linkedList.addFirst(i);
        }
        for(int i=0;i<4;i++)
        {
            linkedList.removeFirst();
        }
        for(int j=0;j<6;j++)
        {
            System.out.println(linkedList.getFirst());
            linkedList.removeFirst();
        }
    }
}
