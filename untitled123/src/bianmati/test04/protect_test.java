package bianmati.test04;


import bianmati.test03.test;
import bianmati.test03.test.y4;

public class protect_test implements test.y4 {

    public static void main(String[] args) {
         protect_test protect_test1= new protect_test();
         protect_test1.v4();
    }

    @Override
    public void v4() {
        System.out.println("NB");
    }
}
