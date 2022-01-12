package bianmati.算法;

public class hash探究 {

    private static String name3;

    public static void main(String[] args) {
         new hash探究().s1("重地","通话");
        System.out.println(name3);
    }

    public void s1(String name1, String name2){
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        this.name3=name1;
        System.out.println(name1==name2);
        String s2=new String("你好");
        String s1=new String("你好");
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2==s1);
    }
}
