package bianmati.test01;

import java.util.ArrayList;
import java.util.List;

public class 零矩阵 {
    public static void main(String[] args) {
       setZeroes(new int[][]{
               {0,1,2,0},
               {3,4,5,2},
               {1,3,1,5}
       });
    }
    public static void setZeroes(int[][] matrix) {
          int m=matrix[0].length;
          int n=matrix.length;
          List list=new ArrayList();
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<m;j++)
              {
                  if(matrix[i][j]==0){
                      list.add(i);
                      list.add(j);
                  }
              }
          }
        int length=list.size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++) {
                for(int t=0;t<length;t+=2) {
                    matrix[(int) list.get(t)][j] = 0;
                    matrix[i][(int) list.get(t+1)] = 0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
