package bianmati.test02;

public class 重载重写 {
    public static void main(String[] args) {
        重载重写 t=new 重载重写();
        System.out.println(t.s1(1234));
        System.out.println(t.s1("4321"));
    }

    public String s1(int num){
        return String.valueOf(num);
    }

    public String s1(String name){
        return name;
    }
}
