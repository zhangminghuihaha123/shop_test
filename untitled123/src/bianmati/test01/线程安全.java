package bianmati.test01;

public  class 线程安全 {
    private static String name="我是线程";

    private static Thread A;
    private static Thread B;

    public static void main(String[] args) {
        线程安全 x=new 线程安全();
        x.s4();
    }

    public static synchronized void s1(){
        A=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + "   1");
                }
            }
        });
        A.start();
    }


    public static synchronized void s2(){
        B=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + "   2");
                }
            }
        });
        B.start();
    }

    public void s3(){
        Thread C=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread D=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<10;i++){
                            System.out.println("D");
                        }
                    }
                });
                try {
                    D.start();
                    D.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Thread E=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Thread F=new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for(int i=0;i<10;i++){
                                    System.out.println("F");
                                }
                            }
                        });
                        try {
                            F.start();
                            F.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        for(int i=0;i<10;i++){
                            System.out.println("E");
                        }
                    }
                });
                try {
                    E.start();
                    E.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0;i<10;i++){
                    System.out.println("C");
                }
            }
        });
        C.start();
    }

    public void s4(){
        A=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1");
                System.out.println(A.getPriority());
            }
        });
        B=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2");
                System.out.println(B.getPriority());
            }
        });

        A.setPriority(3);
        A.start();
        B.setPriority(10);
        B.start();
    }
}
