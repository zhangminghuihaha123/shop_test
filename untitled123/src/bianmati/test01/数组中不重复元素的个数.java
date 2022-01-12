package bianmati.test01;

public class 数组中不重复元素的个数 {
    //有序数组
    public static void main(String[] args) {
        System.out.println(a(new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7}));
    }

    public static int a(int[] arr)
    {
        int i=0;
        if(arr.length==0)
        {
            i=0;
        }else {
        for (int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        }
        return (i+1);
    }
}
