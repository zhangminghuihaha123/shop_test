package bianmati.test03;

public class 数组元素加到所有元素相等 {

    private static long n=0;

    public static void main(String[] args) {
        System.out.println(array(new int[]{3, 4, 6, 6, 3}));
    }

    public static long array(int[] num){
        int max=num[0];
        int maxindex=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
                maxindex=i;
            }
        }
        int index=0;
        for(int j=0;j<num.length;j++){
            if(j!=maxindex){
                num[j]=num[j]+1;
            }
        }
        n++;
        for(int k=0;k<num.length-1;k++){
            if(num[k]==num[k+1]){
                index++;
            }
        }
        if(index!=num.length-1){
            array(num);
        }
        return n;
    }

}
