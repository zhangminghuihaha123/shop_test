package bianmati.test01;

public class 替换字符 {
    public static void main(String[] args) {
        String s="hello world to you";
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.toCharArray()[i]!=' ')
            {
                stringBuilder.append(s.toCharArray()[i]);
            }
            else {
                stringBuilder.append("//");
            }
        }
        String s1=stringBuilder.toString();
        System.out.println(s1);
    }
}
