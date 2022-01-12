package bianmati.算法;

public class test1 {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        Thread d1=new Thread(new t1());
        d1.start();
        try {
            d1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
class t1 extends Thread{
    public void run(){
        System.out.println("线程1开始");
        Thread i1=new Thread(new t2().r1);
        i1.start();
        try {
            i1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1结束");
    }
}
class  t2{
    Thread r1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("线程2开始");
            System.out.println("线程2结束");
        }
    });
}
