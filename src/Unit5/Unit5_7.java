package Unit5;

import java.util.Scanner;

//实现插入排序
public class Unit5_7 {
    public static void main(String[] args){
        int NumberOfSize = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组长度");
        NumberOfSize = input.nextInt();
        int[] Array = new int[NumberOfSize];
        for (int i=0;i<NumberOfSize;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            Array[i] = input.nextInt();
        }
        int[] RightArray = Paixu(Array);
        int AddSize = 0;
        System.out.println("请输入要插入数组元素的个数");
        AddSize = input.nextInt();
        int[] AddArray = new int[AddSize];
        for (int i=0;i<AddSize;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            AddArray[i] = input.nextInt();
        }
        int[] RightAddArray = Paixu(AddArray);
        System.out.println("原数组的正确顺序为");
        for (int n :RightArray){
            System.out.print(n+"\t");
        }
        System.out.println("\n");
        System.out.println("添加数组的正确顺序为");
        for (int n:RightAddArray){
            System.out.print(n+"\t");
        }
        System.out.println("\n");
        System.out.println("合并数组的正确顺序为");
        int[] MixArray = new int[AddArray.length+Array.length];
        MixArray = ZhiHe(Array,AddArray);
        for (int n :MixArray){
            System.out.print(n +"\t");
        }
        input.close();
    }
    public static int[] Paixu(int []list){
        for (int i = 0 ; i < list.length; i ++){
            for (int j = 0 ; j < list.length - i -1; j ++){
                int l;
                if (list[j] > list[j+1]){
                    l = list[j];
                    list[j] = list[j+1];
                    list[j+1] = l;
                }
            }
        }
        return list;
    }
    public static int[] ZhiHe(int[] list1,int[] list2){
        int[] list3 = new int[list1.length+ list2.length];
        for (int i =0;i< list1.length;i++){
            list3[i] = list1[i];
        }
        for (int i = 0;i< list2.length;i++){
            list3[list1.length+i] = list2[i];
        }
        list3 = Paixu(list3);
        return list3;
    }
}
