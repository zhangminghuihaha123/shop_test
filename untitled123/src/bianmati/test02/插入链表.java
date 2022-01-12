package bianmati.test02;

public class 插入链表 {

    private ListNode listNode;
    private ListNode first;

    public static void main(String[] args) {
        插入链表 test=new 插入链表();
        test.a();
        //index插入在Index值的后面，这个节点的值为num
        test.add(5,99);
    }

    public void a(){
        first=new ListNode(0);
        listNode=first;

        for(int i=1;i<10;i++){
            ListNode listNode1=new ListNode(i);
            listNode.next=listNode1;
            listNode=listNode.next;
        }

        listNode=first;
        print(listNode);
    }

    public void add(int index,int num){
         ListNode listNodes=new ListNode(num);
         ListNode after;
         while (listNode!=null) {
             if ((listNode.value)==index) {
                 after = listNode.next;
                 listNode.next = listNodes;
                 listNodes.next = after;
             }
             listNode=listNode.next;
         }
         listNode=first;
        print(listNode);
    }


    public void print(ListNode listNodes){
        while (listNodes!=null){
            System.out.print(listNodes.value+"   ");
            listNodes=listNodes.next;
        }
        System.out.println();
    }

}

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}
