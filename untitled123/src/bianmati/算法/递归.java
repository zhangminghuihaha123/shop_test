package bianmati.算法;

public class 递归 {
    public static void main(String[] args) {
        递归 t=new 递归();
        t.digui(10,10);
    }

    public void digui(int i,int index){
        if(index==0&&i==0){
            System.out.println("两者都为0");
            return;
        }
        if(index==0){
            System.out.println("爆炸了，我不干了");
            return;
        }
        if(i==0){
            System.out.println(i+"，这就是递归!");
        }else {
            System.out.print(i+"   ");
            i--;
            index--;
            digui(i,index);
        }
    }
}
