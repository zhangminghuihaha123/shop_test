package bianmati.test01;

public class 打家劫舍 {
    //你是一名强盗，你需要入室抢劫，但有一个问题，每个房间存在监控，一旦进入房间1再到房间2就会报警，这时会失败
    //比如说当前数组为{1,2,3,4,5,6,7,8,9,10}，那么一共有10个房间，每个房间都存在一个值即为该房间的金额，如果你选择1则不能选择2，否则会报警，挨着会触发警报
    //那么如何获取最大的利润呢
    public static void main(String[] args) {
        int[] s={1,2,3,4,5,6,7,8,9,10};
        System.out.println(a(s));
    }

    public static int a(int[] arr)
    {
        int num1=0;
        int num2=0;
        for(int i=0;i<arr.length;i++)
        {
            if((i+1)%2==0)
            {
                num1=num1+arr[i];
            }else {
                num2=num2+arr[i];
            }
        }
        if(num1>num2||num1==num2)
        {
            return num1;
        }else {
            return num2;
        }

    }
}
