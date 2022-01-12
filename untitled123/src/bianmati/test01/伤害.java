package bianmati.test01;

public class 伤害 {
    //题目：敌人攻击会使友军中毒，数组中存放的是第x秒敌人攻击，中毒持续时间3秒，求解中毒时间总长。。。如果在3秒内中毒又一次被攻击
    //则会刷新时间（比如数组{1，2}在第一秒开始中毒，第二秒敌人还攻击了一次，此时会刷新第一秒的状态，总共时间为4S中毒时间（1+3））
    //num为时间数组int[]{1,3,7,9,2,8,15,19}
    public static void main(String[] args) {
           int[] num={1,3,7,9,2,8,15,19};
           int p=a(num);
           System.out.println(p);
    }

    public static int a(int[] arr)
    {
        int times=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>(arr[j+1])) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j+1<arr.length) {
                int time = arr[j + 1] - arr[j];
                if (time > 1) {
                    if(time<3)
                    {
                        times=times+time;
                    }else {
                        times = times + 3;
                    }
                } else {
                    if (time==0)
                    {
                        times=times;
                    }else {
                        times = times + 1;
                    }
                }
            }else
            {
                times=times+3;
                break;
            }
        }
        return times;
    }
}
