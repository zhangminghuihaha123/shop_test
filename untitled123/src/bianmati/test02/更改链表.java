package bianmati.test02;

class ListNodeupdate{
    int value;
    ListNodeupdate next;

    public ListNodeupdate(int value) {
        this.value = value;
    }
}


public class 更改链表 {
        private ListNodeupdate first;
        private ListNodeupdate listNode;

        public static void main(String[] args) {
            更改链表 test=new 更改链表();
            test.a();
            test.d(5,6);
        }

        public  void a(){
            first=new ListNodeupdate(1);
            listNode=first;
            for(int i=2;i<11;i++){
                ListNodeupdate listNodes=new ListNodeupdate(i);
                listNode.next=listNodes;
                listNode=listNode.next;
            }
            listNode=first;
            print(listNode);
        }

        public void d(int index,int num){
            while (listNode!=null){
                if(listNode.value==(index-1)){
                    ListNodeupdate node=new ListNodeupdate(num);
                    ListNodeupdate update=listNode.next.next;
                    listNode.next=node;
                    node.next=update;
                }
                listNode=listNode.next;
            }
            listNode=first;
            print(listNode);
        }

        public void print(ListNodeupdate ListNodeupdate){
            while (ListNodeupdate!=null){
                System.out.print(ListNodeupdate.value+"   ");
                ListNodeupdate=ListNodeupdate.next;
            }
            System.out.println();
        }
}
