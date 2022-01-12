package bianmati.test03;



public class test implements y1,y2,y3{

    public int b=2;

    //1
   private int t1(){
      return b;
   }


   //2
   public int gett1(){
       return this.t1();
   }

    public int t2(){
        return b;
    }

    protected int t3(){
       return b;
    }

    int t4(){
       return b;
    }





    public static void main(String[] args) {
        // write your code here
        test test= new test();
        System.out.println(test.t1());
        test.t2();
        test.t3();
        test.t4();
    }

    @Override
    public void v1() {

    }

    @Override
    public void v2() {

    }

    @Override
    public void v3() {

    }


    public interface y4{
        public void v4();
    }
}

interface y1{
    public void v1();
}
interface y2{
    public void v2();
}
interface y3{
    public void v3();
}

