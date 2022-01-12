package bianmati.test01;

import java.util.Iterator;
import java.util.LinkedList;

public class 双向链表 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<10;i++){
            linkedList.add(i);
        }
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
