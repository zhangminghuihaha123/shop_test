package bianmati.test01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class 对角线遍历 {
    //不对
    public static void main(String[] args) {
        for(int i=0;i<9;i++){
            System.out.println(a(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})[i]);
        }
    }
    public static int[] a(int[][] arr){
        int num=arr.length*arr[0].length;
        int[] r=new int[num];
        Map map=new HashMap();
        int[] s=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                 for(int t=0;t<(arr.length-1)*(arr[0].length-1);t++)
                 {
                     if((i+j)==t){
                         s= new int[]{i, j};
                         map.put(t,s);
                     }
                 }
            }
        }
        int o=1;
        int p=0;
        int[] q=new int[(arr.length-1)*(arr[0].length-1)];
        for (int m=0;m<arr.length;m++)
        {
            for(int n=0;n<arr[0].length;n++)
            {
                for(int t=0;t<(arr.length-1)*(arr[0].length-1);t++){
                    if(map.size()==t)
                    {
                        if(map.keySet().size()!=1){
                            LinkedList linkedList=new LinkedList();
                            for(int x=0;x<map.keySet().size();x++)
                            {
                                linkedList.add((int)((int[])map.get(t))[0]);
                                linkedList.add((int)((int[])map.get(t))[1]);
                            }
                            for(int h=0;h<linkedList.size();h+=2){
                                if(arr[(int) linkedList.get(h)][(int) linkedList.get(h+1)]>arr[(int) linkedList.get(h+1)][(int) linkedList.get(h)]){
                                    int tmp=arr[(int) linkedList.get(h+1)][(int) linkedList.get(h)];
                                    arr[(int) linkedList.get(h+1)][(int) linkedList.get(h)]=arr[(int) linkedList.get(h)][(int) linkedList.get(h+1)];
                                    arr[(int) linkedList.get(h)][(int) linkedList.get(h+1)]=tmp;
                                }
                                int e=map.keySet().size();
                                for(o=1+p*e;o<e;o++)
                                {
                                    r[o]=arr[(int) linkedList.get(o)][(int) linkedList.get(o+1)];
                                }
                                p=1;
                            }
                        }else {
                            q= (int[]) map.get(t);
                            if(arr[q[0]][q[1]]==arr[0][0]){
                                r[0]=arr[q[0]][q[1]];
                            }
                            else {
                                r[num-1]=arr[q[0]][q[1]];
                            }
                        }
                    }
                }
            }
        }
        return r;
    }
}
