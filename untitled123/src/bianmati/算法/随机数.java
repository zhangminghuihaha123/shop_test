package bianmati.算法;

public class 随机数 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            System.out.println((int) (Math.random() * 100));
        }
        System.out.println(Math.ceil(Math.random()*100));
    }
}
