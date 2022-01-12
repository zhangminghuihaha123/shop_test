package bianmati.test02;

class ListNodetest{
    int value;
    ListNode next;

    public ListNodetest(int value) {
        this.value = value;
    }
}


public class test {

    private ListNode first;
    private ListNode listNode;

    public static void main(String[] args) {
         test test=new test();
         test.a();
        test.d(5,6);
    }

    public  void a(){
         first=new ListNode(1);
         listNode=first;
         for(int i=2;i<11;i++){
            ListNode listNodes=new ListNode(i);
            listNode.next=listNodes;
            listNode=listNode.next;
         }
         listNode=first;
         print(listNode);
    }

    public void b(int index,int num){
      ListNode listNodes=new ListNode(num);
      while (listNode!=null){
          if(listNode.value==index){
              ListNode last=listNode.next;
              listNode.next=listNodes;
              listNodes.next=last;
          }
          listNode=listNode.next;
      }
        listNode=first;
        print(listNode);
    }

    public void c(int index){
        while (listNode!=null){
            if(listNode.value==(index-1)){
                ListNode delete=listNode.next;
                listNode.next=listNode.next.next;
                delete.next=null;
            }
            listNode=listNode.next;
        }
        listNode=first;
        print(listNode);
    }

    public void d(int index,int num){
             while (listNode!=null){
                 if(listNode.value==(index-1)){
                     ListNode node=new ListNode(num);
                     ListNode update=listNode.next.next;
                     listNode.next=node;
                     node.next=update;
                 }
                 listNode=listNode.next;
             }
             listNode=first;
             print(listNode);
    }

    public void print(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.value+"   ");
            listNode=listNode.next;
        }
        System.out.println();
    }
}

