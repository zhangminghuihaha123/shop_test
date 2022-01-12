package bianmati.test02;

public class 链表反转 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode head) {
          ListNode prev=null,next;
          ListNode cor=head;
          while(cor!=null){
              next=cor.next;
              cor.next=prev;
          }
          return head;
    }

    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
