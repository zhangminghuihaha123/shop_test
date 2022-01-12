package bianmati.算法;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 双数组合并 {
    public static void main(String[] args) {
       双数组合并 t=new 双数组合并();
        t.brr(new int[]{7,6,5,4,3,2,1}, new int[]{9,8,7});
    }
    public int[] arr(int[] a1,int[] a2){
        int length1=a1.length;
        int length2=a2.length;
        for(int i=0;i<length2;i++){
           a1[(length1-length2)+i]=a2[i];
        }
       Arrays.sort(a1);
        return a1;
    }

    public void brr(int[] a1,int[] a2){
        int length1=a1.length;
        int length2=a2.length;
        int[] news=new int[length1+length2];
        int i = 0,j=0;
        while (i!=length1){
            news[i]=a1[i];
            i++;
        }
        while (j!=length2){
            news[i+j]=a2[j];
            j++;
        }
        Arrays.sort(news);//快速排序
        for(int k=0;k<length1+length2;k++) {
            System.out.print(news[k]+"  ");
        }
    }



}
