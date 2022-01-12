package bianmati.test01;

public class 堆满 {


    public static void main(String[] args) {
         a1();
    }

      public static void a1(){
          System.out.println("a1");
          a2();
      }

    public static void a2(){
        System.out.println("a2");
        a1();
    }
}
