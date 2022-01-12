package bianmati.算法;

public class 不用加法算加法 {
    public static void main(String[] args) {
          不用加法算加法 t=new 不用加法算加法();
        System.out.println(t.arr(1, 3));
    }
    public int arr(int a,int b){
        int t1, t2 = 0;
        while(b != 0){
            t1 = a^b;
            t2 = (a&b)<<1;
            a = t1;
            b = t2;
        }
        return a;
    }
}
