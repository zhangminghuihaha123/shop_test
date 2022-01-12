package bianmati.test03;

public class 数组字符串转换 {
    /*小明在读取控制台中的数组（数组中的值都为整数类型）时，只能读取到这个数组对应的字符串。
      如：控制台输入数组 [1, 2, 3] 时，接收时却收到了 "[1, 2, 3]"。请你忙他将这个数组字符串，转换成正常的数组。
      请在 Solution 中的 arrayConversion 方法中编写你的代码。*/

    public static void main(String[] args) {
        for(int t : arrayConversion("[5, 10, 7, 1, 8, 9]")){
            System.out.print(arrayConversion("[5, 10, 7, 1, 8, 9]")[t-1]+"  ");
        }
    }


    public static int[] arrayConversion(String str1) {
        // -- write your code here --
        char[] chars=str1.toCharArray();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(chars[i]!='"'&&chars[i]!=' '){
                str.append(chars[i]);
            }
        }
        chars=str.toString().toCharArray();
        int n=(chars.length-1)/2;
        int[] arr=new int[n];
        int p=0;
        for(int k=0;k<chars.length;k++){
            if(k%2!=0){
                arr[p]=Character.getNumericValue(chars[k]);
                p++;
            }
        }
        return arr;
      }
}
