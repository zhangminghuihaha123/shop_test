package bianmati.test03;

public class 汽水瓶 {

    private static int all;
    private static int num;

    public static void main(String[] args) {
        汽水瓶 t=new 汽水瓶();
        t.fuzhi(80);
        huanqu1();
        if(num!=0){
            System.out.println(all);
        }
    }

    public void fuzhi(int n){
        this.num=n;
    }

    public static void huanqu1(){
        if(num==0){
            return;
        }
        int n=num/3;
        all+=n;
        int shenyu=num%3+n;
        if(shenyu<3){
            if(shenyu==2){
                all+=1;
            }
        }else {
            num=shenyu;
            huanqu1();
        }
    }
}
