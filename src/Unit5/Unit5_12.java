package Unit5;

import java.util.Scanner;

public class Unit5_12 {
    public static int[][] input(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要初始化矩阵的行数和列数");
        int row = input.nextInt();
        int line = input.nextInt();
        int[][] Array = new int[row][line];
        int i;
        for (i = 0;i < Array.length;i++){
            System.out.println("请输入第"+(i+1)+"行的数据");
            for (int j = 0; j< Array[i].length;j++){
                System.out.println("请输入第"+(j+1)+"列的数据");
                Array[i][j] = input.nextInt();
            }
        }
        System.out.println("你输入的矩阵为");
        int j;
        for (i = 0; i <Array.length;i++){
            for (j = 0;j < Array[i].length;j++){
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println("");
        }
        return Array;
    }
    public static void CHENGFA(int[][] a,int[][] b){
        int[][] result = new int [a.length][b[0].length];
        int i,j,k;
        for (i = 0;i < a.length;i++){
            for (j = 0;j<a[i].length;j++){
                for (k=0;k<b[j].length;k++){
                    result[i][k] += a[i][j]*b[j][k];
                }
            }
        }
        System.out.println("矩阵相乘结果为：");
        for (i = 0; i <result.length;i++){
            for (j = 0;j < result[i].length;j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] Args) {
        System.out.println("请输入第一个矩阵的基本信息");
        int[][] v1 = input();
        System.out.println("请输入第二个矩阵的基本信息");
        int[][] v2 = input();
        if (v1[0].length  != v2.length){
            System.out.println("两个矩阵不能够相乘");
        }
        else {
            CHENGFA(v1,v2);
        }
    }
}
