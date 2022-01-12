package bianmati.算法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zhunbei {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        for(int i=1;i<21;i++){
            hashMap.put("num"+i,i);
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.get("num11"));
        Set o1=hashMap.keySet();
        Object[] ch=o1.toArray();
        for(int j=0;j<o1.size();j++){
            System.out.println(ch[j]);
        }
    }
}
