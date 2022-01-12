package bianmati.test01;

public class 判断字符串中是否是数字 {
    public static void main(String[] args) {

        for(int j=0;j<a("1561436.yfgsdgv.").toString().length();j++) {
            System.out.println(a("1561436.yfgsdgv."));
        }
    }

    public static Boolean a(String s) {
        String s1 = String.valueOf(s);
        Boolean b[]=new Boolean[s1.length()];
        char[] chars = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++)
        {
            chars[i]=s1.toCharArray()[i];
            if((chars[i]>='0'&&chars[i]<='9')||chars[i]=='.')
            {
                  if(chars[0]!='.'||chars[chars.length-1]!='.')
                  {
                      b[i]=true;
                  }
                  else {
                      b[i]=false;
                  }
            }
            else {
                b[i]=false;
            }
        }
        Boolean b1=false;
        for(int i=0;i<b.length;i++)
        {
             if(b[i]==true)
             {
                 b1=true;
             }
             else {
                 b1=false;
             }
        }
        return b1;
    }
}

