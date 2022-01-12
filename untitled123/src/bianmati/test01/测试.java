package bianmati.test01;

public class 测试 {
    private static int number;

    public static void main(String[] args) {
        测试 a=new 测试();
        a.a(10);
        System.out.println(number);
        a.a(20);
        System.out.println(number);
        a.a(30);
        System.out.println(number);
    }

    public void a(int number)
    {
        this.number=number;
    }
}
