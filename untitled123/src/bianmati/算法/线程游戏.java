package bianmati.算法;

public class 线程游戏 {

    public static int num;

    public static void main(String[] args) throws InterruptedException {
        线程游戏 u=new 线程游戏();
        num=1;
        System.out.println(u.arr());
    }


    public synchronized int arr() throws InterruptedException {
        while (num<100) {
            if (num > 10 && num % 2 == 0) {
                Thread thread1 = new Thread(new h1().s1);
                thread1.start();
                num+=1;
            } else {
                Thread thread2 = new Thread(new h2().s1);
                num=num*2;
                thread2.start();
            }
        }
        return num;
    }

}
class h1{
    Thread s1=new Thread(new Runnable() {
        @Override
        public synchronized void run() {
            System.out.println("线程1运行");
        }
    });
}

class h2{
    Thread s1=new Thread(new Runnable() {
        @Override
        public synchronized void run() {
            System.out.println("线程2运行");
        }
    });
}
