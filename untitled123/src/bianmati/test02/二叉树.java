package bianmati.test02;

public class 二叉树 {

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void a(){
        Node first=new Node(1);
        Node nodes;
        nodes=first;
        for (int i=2;i<11;i++){
            Node node=new Node(i);
            if(nodes.value<node.value){
                nodes.right=node;
            }else {
                nodes.left=node;
            }
            nodes=nodes.left;
        }
        nodes=first;
        System.out.println(nodes.value);
        System.out.println(nodes.left.value);
        System.out.println(nodes.right.value);
        System.out.println(nodes.left.left.value);
    }

    public static void main(String[] args) {
        二叉树 e=new 二叉树();
        e.a();
    }
}
