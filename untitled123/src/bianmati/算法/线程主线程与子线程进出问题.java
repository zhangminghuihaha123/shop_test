package bianmati.算法;

public class 线程主线程与子线程进出问题 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主线程开始");
        Thread t1=new Thread(new s1());
        t1.start();
        t1.join();
        System.out.println("主线程结束");
    }
}
class s1 implements Runnable{
    @Override
    public void run() {
        System.out.println("线程s1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread=new Thread(new s2());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程s1结束");
    }
}
class s2 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程s2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2结束");
    }
}
