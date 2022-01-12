package bianmati.test01;

//生产者，消费者，产品，缓冲区
public class 线程生产者与消费者 {
    public static void main(String[] args) {
          Container container=new Container();
          new productor(container).start();
          new cousumer(container).start();
    }
}
//生产者
class productor extends Thread{
      Container container;

      public productor(Container container){
          this.container=container;
      }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("生产了"+i+"只鸡");
            container.push(new pro(i));
        }
    }
}
//消费者
class cousumer extends Thread{
    Container container;

    public cousumer(Container container){
        this.container=container;
    }

    @Override
    public void run() {
        for(int j=0;j<100;j++){
            System.out.println("消费者消费"+ container.pop().id+"只鸡");
        }
    }
}
//产品
class pro{
   int id;

   public pro(int id){
       this.id=id;
   }

}

//缓冲区
class Container{
    pro[] pros=new pro[100];
    int count=0;
    public synchronized void push(pro pro){
        if(count==pros.length){
             try{
                 this.wait();
             }catch (Exception e){
                 e.printStackTrace();
             }
        }
        pros[count]=pro;
        count++;

        this.notifyAll();
    }

    //消费者消费产品
    public synchronized pro pop(){
        if(count==0){
              try{
                  this.wait();
              }catch (Exception e){
                  e.printStackTrace();
              }
        }
        count--;
        pro pro=pros[count];

        this.notifyAll();
        return pro;
    }
}

