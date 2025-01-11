package Unit5;
/*
5.4 Array类与应用
1.
equal() 用于比较两个数组相等
输出比较后的布尔值 返回值为Boolean 可以直接输出或者用来赋值
2.
flii()用某个数值填充整个数组或指定范围的数组
fill(1.数组名, 起始位置 , 终止位置, 填充内容)注意 ：区间为左闭右开区间 ， 同时对应数组下标 ，即是从零开始
3.
sort()用于数组从小到大排序 返回值为void 直接处理原数组
处理过后原数组为排好序的数组  不能用于赋值
4.
copyOF() 实现数组赋值的功能
需要两个参数一个是要复制的数组 ， 另一个是复制长度

 */
//利用Array类对数组进行排序
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Arrays.*;
public class Unit5_8 {
    public static void main(String[] args) {
        int[] num = {1,4,1,3,2,5,7,3,8,9,44,76,45,75,22};
        System.out.println("原数组为：");
        for (int i = 0 ; i < num.length;i++){
            System.out.print(num[i]+"\t");
        }
        Arrays.sort(num); //Arrays类不是Array类
        System.out.println("排序后的数组为");
        for (int i = 0 ; i < num.length;i++){
            System.out.print(num[i]+"\t");
        }//此处是对原数组直接进行了修改,如果想创建新数组去记录排序,可以创建一个数组与原数组完全一致然后对新创建数组排序
        int[] Sortnum = new int [num.length];
        for (int i = 0;i < num.length ;i++){
            Sortnum[i] = num [i];
        }
        Arrays.sort(Sortnum);
        System.out.println("排序后的数组为");
        for (int i = 0 ; i < Sortnum.length;i++){
            System.out.print(Sortnum[i]+"\t");
        }
    }
}
