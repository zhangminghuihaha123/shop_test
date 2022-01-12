package bianmati.test02;

public class 双向链表 {

    private ListNodeDouble01 first;
    private ListNodeDouble01 double01;

    class ListNodeDouble01{
        int value;
        ListNodeDouble01 next;
        ListNodeDouble01 prev;

        public ListNodeDouble01(int value) {
            this.value = value;
        }
    }

    //遍历
    public void a(){
        first=new ListNodeDouble01(1);
        double01=first;

        for(int i=2;i<11;i++){
            ListNodeDouble01 listNode=new ListNodeDouble01(i);
            double01.next=listNode;
            listNode.prev=double01;
            double01=double01.next;
        }
        double01=first;
        print(double01);
    }

    //修改
    public void b(int index,int num){
        while (double01!=null){
            if(double01.value==index){
                ListNodeDouble01 before=double01.prev;
                ListNodeDouble01 after=double01.next;
                ListNodeDouble01 listNodeDouble01=new ListNodeDouble01(num);
                before.next=listNodeDouble01;
                listNodeDouble01.next=after;
                after.prev=listNodeDouble01;
                listNodeDouble01.prev=before;
            }
            double01=double01.next;
        }
        double01=first;
        print(double01);
    }

    //增加
    public void c(int index,int num){
        while (double01!=null){
            if(double01.value==index){
                ListNodeDouble01 before=double01.prev;
                ListNodeDouble01  newone=new ListNodeDouble01(num);
                before.next=newone;
                newone.next=double01;
                double01.prev=newone;
                newone.prev=before;
            }
            double01=double01.next;
        }
        double01=first;
        print(double01);
    }

    //删除
    public void d(int index){
        while (double01!=null){
            if(double01.value==index){
                ListNodeDouble01 before=double01.prev;
                ListNodeDouble01 after=double01.next;
                before.next=after;
                after.prev=before;
            }
            double01=double01.next;
        }
        double01=first;
        print(double01);
    }


    //打印
    public void print(ListNodeDouble01 listNodeDouble01){
        while (listNodeDouble01!=null){
            System.out.print(listNodeDouble01.value+"    ");
            listNodeDouble01=listNodeDouble01.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        双向链表 t=new 双向链表();
        t.a();//遍历链表，1到10
        t.c(5,99);//添加一个节点99，插入到5之前
        t.b(99,88);//把99变成88
        t.d(88);//删除节点为88的元素
    }
}
