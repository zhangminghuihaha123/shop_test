package bianmati.test01;

public class 测试2 {
    public static void main(String[] args) {
        String s1="a";
        String s2="a";
        String s3=new String("a");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
