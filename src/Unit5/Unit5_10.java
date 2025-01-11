package Unit5;
/*
二维数组的创建同一维数组
创建初始化次序为11，12，13...n1,n2,n3
数组名.length为获取行数
获取列数为 数组名[].length 获取数组方框中行的列数
 */
//二维数组的输出遍历 输出遍历时 外循环控制行 内循环控制列 然后在内循环外输出空行
public class Unit5_10 {
    public static void main(String[] Args){
        double[][] num = {{1,2,3},{4,5,6},{7,8,9,}};
        int i , j;
        for (i = 0; i <num.length;i++){
            for (j = 0;j < num[i].length;j++){
                System.out.print(num[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
