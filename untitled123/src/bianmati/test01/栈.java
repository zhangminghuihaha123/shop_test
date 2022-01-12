package bianmati.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 栈 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        for(int i=0;i<10;i++) {
            stack.push(i);
        }
        for(int k=0;k<4;k++) {
            stack.pop();
        }
        for(int j=0;j<6;j++)
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
