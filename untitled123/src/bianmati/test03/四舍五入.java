package bianmati.test03;

public class 四舍五入 {
    public int[] rounding(int[] array) {
        // write your code here
        int[] arr=new int[array.length];
        for(int i=0;i<array.length;i++){
            int n=array[i];
            char[] chars=String.valueOf(array[i]).toCharArray();
            int num=chars.length;
            if(array[i]>0) {
                if (chars[num - 1] >= 5) {
                    arr[i]= (int) Math.ceil(array[i]);
                } else {
                    arr[i]= (int) Math.floor(array[i]);
                }
            }else {
                arr[i]=array[i];
            }
        }
        return arr;
    }
}
