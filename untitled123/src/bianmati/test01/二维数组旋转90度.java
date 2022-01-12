package bianmati.test01;

public class 二维数组旋转90度 {
    public static void main(String[] args) {
        int arr[][]= {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        new 二维数组旋转90度().rotate(arr);
    }
    public void rotate(int[][] matrix) {
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=tmp;
            }
        }
        for(int k=0;k<m;k++)
        {
            for(int l=0;l<n;l++)
            {
                System.out.print(matrix[k][l]+" ");
            }
            System.out.println();
        }
    }
}
