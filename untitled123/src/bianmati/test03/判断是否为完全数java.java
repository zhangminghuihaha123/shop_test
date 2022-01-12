package bianmati.test03;

import java.util.ArrayList;
import java.util.Scanner;

public class 判断是否为完全数java {
    public static void main(String[] args) {
        // write your code here
        // read data from console

        // output the answer to the console according to the
        // requirements of the question
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        ArrayList according=new ArrayList();
        according.add(1);
        for(int i=2;i<num-1;i++){
            if((num%i)==0){
                according.add(i);
            }
        }
        int all = 0;
        for(int j=0;j<according.size();j++){
            all=all+(int)according.get(j);
        }
        if(all==num){
            System.out.println("is perfect number");
        }else{
            System.out.println("not perfect number");
        }
    }
}
