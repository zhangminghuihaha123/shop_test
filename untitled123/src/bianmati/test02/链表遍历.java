package bianmati.test02;

public class 链表遍历 {

    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value=value;
        }
    }


    public static void print(ListNode listNode){
        while (listNode!=null){
            System.out.println(listNode.value);
            listNode=listNode.next;
        }
    }


    public static void main(String[] args) {
        ListNode first=new ListNode(0);
        ListNode arange;
        arange=first;
        for(int i=1;i<10;i++){
            ListNode listNode=new ListNode(i);
            arange.next=listNode;
            arange=arange.next;
        }

        arange=first;
        print(arange);
    }
}
