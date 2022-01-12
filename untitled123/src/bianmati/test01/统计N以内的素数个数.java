package bianmati.test01;

public class 统计N以内的素数个数 {
    public static void main(String[] args) {
        System.out.println(a(100));
    }
    public static int a(int num)
    {
        int t=0;
        for(int i=2;i<num;i++)
        {
            t=t+b(i);
        }
        return t;
    }
    public static int b(int k)
    {
        int num=1;
        for (int j=2;j<k;j++)
        {
            if(k%j==0)
            {
                num= 0;
            }
        }
        return num;
    }
}
