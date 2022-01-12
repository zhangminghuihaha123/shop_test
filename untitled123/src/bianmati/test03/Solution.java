package bianmati.test03;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public  List<Integer> removeNumber(List<Integer> list) {
        List listadd=new ArrayList();
        List<Integer> listup=new ArrayList();
        listup=removeNumber1(list);
        for(int k=0;k<listup.size();k++){
            if(listup.get(k)%3!=0){
                listadd.add(listup.get(k));
            }
        }
        return listadd;
    }

    public List<Integer> removeNumber1(List<Integer> lists){
        for(int i=0;i<lists.size();i++){
            char chars[]=lists.get(i).toString().toCharArray();
            for(int j=0;j<chars.length;j++){
                if(chars[j]=='3'){
                    lists.remove(i);
                    removeNumber1(lists);
                }
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num=new int[]{52};
        List<Integer> list= Arrays.stream(num).boxed().collect(Collectors.toList());
        for(int i=0;i<solution.removeNumber(list).size();i++){
            System.out.print(solution.removeNumber(list).get(i)+" ");
        }
    }
}
