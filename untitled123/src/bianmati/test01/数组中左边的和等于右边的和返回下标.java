package bianmati.test01;

import java.util.Arrays;

public class 数组中左边的和等于右边的和返回下标 {
    public static void main(String[] args) {
        System.out.println(a(new int[]{1, 2, 3, 4, 5, 6,2,3, 7, 8, 6,5}));
    }

    public static int a(int[] arr)
    {
          int sum= Arrays.stream(arr).sum();
          int total=0;
          int key=0;
          for(int i=0;i<arr.length;i++)
          {
              total+=arr[i];
              if(sum==(2*total))
              {
                  key=i;
              }
          }
          return (key+1);
    }
}
