package bianmati.test02;

public class 整数反转 {
    public static void main(String[] args) {
        整数反转 t = new 整数反转();
        System.out.println(t.reverse(-2143847412));
    }

    public int reverse(int x) {
        int number = 0;
        if (x >= 0) {
            if (x >= 1534236469) {
                number = 0;
            } else {
                char[] chars = String.valueOf(x).toCharArray();
                int length = chars.length;
                char tmp;
                for (int i = 0; i < length / 2; i++) {
                    tmp = chars[i];
                    chars[i] = chars[length - 1 - i];
                    chars[length - 1 - i] = tmp;
                }
                number = Integer.valueOf(new String(chars));
            }
        } else {
            if (x <= -2147483642) {
                number = 0;
            } else {
                char[] chars = String.valueOf((-x)).toCharArray();
                int length = chars.length;
                char tmp;
                for (int i = 0; i < length / 2; i++) {
                    tmp = chars[i];
                    chars[i] = chars[length - 1 - i];
                    chars[length - 1 - i] = tmp;
                }
                number = (-Integer.valueOf(new String(chars)));
            }
        }
        return number;
    }
}
