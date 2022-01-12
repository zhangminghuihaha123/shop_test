package bianmati.test02;

class ListNodedelete{
    int value;
    ListNodedelete next;

    public ListNodedelete(int value) {
        this.value = value;
    }
}


public class 删除链表 {

    private ListNodedelete first;
    private ListNodedelete listNode;

    public static void main(String[] args) {
        test test=new test();
        test.a();
        test.c(5);
    }

    public  void a(){
        first=new ListNodedelete(1);
        listNode=first;
        for(int i=2;i<11;i++){
            ListNodedelete listNodes=new ListNodedelete(i);
            listNode.next=listNodes;
            listNode=listNode.next;
        }
        listNode=first;
        print(listNode);
    }

    public void c(int index){
        while (listNode!=null){
            if(listNode.value==(index-1)){
                ListNodedelete delete=listNode.next;
                listNode.next=listNode.next.next;
                delete.next=null;
            }
            listNode=listNode.next;
        }
        listNode=first;
        print(listNode);
    }

    public void print(ListNodedelete listNode){
        while (listNode!=null){
            System.out.print(listNode.value+"   ");
            listNode=listNode.next;
        }
        System.out.println();
    }
}
