package bianmati.test01;

public class a1
{
    //有一个int值，现在我们需要拆分开来,比如1234,则会拆成1，2，3，4，然后计算总和，得到总和为10，现在
    //我们输入一个int值来获取总和   Integer number=123456789;
    public static void main(String[] args) {
        Integer number=123456789;
        String num=String.valueOf(number);
        String[] str=number.toString().split("");
        int[] arr=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.valueOf(str[i]);
        }
        //算和
        int all=0;
        for(int k=0;k<arr.length;k++)
        {
           all=all+arr[k];
        }
        System.out.println(all);

    }
}
