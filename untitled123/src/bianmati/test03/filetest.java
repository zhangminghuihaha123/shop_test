package bianmati.test03;

import java.io.File;

public class filetest {
    public static void main(String[] args) {
        File file=new File("D:\\原神\\Genshin Impact");
        System.out.println(file.getName());
        System.out.println(file.exists());
        System.out.println(file.getParent());
        System.out.println(file.length());
    }
}
