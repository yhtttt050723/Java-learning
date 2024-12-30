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
        int AddSize = 0;
        System.out.println("请输入要插入数组元素的个数");
        AddSize = input.nextInt();
        int[] AddArray = new int[AddSize];
        for (int i=0;i<AddSize;i++){
            System.out.println("请输入第"+(i+1)+"个元素");
            AddArray[i] = input.nextInt();
        }
        int[] RightArray = Paixu(Array,AddArray);
        for (int n :RightArray){
            System.out.print(RightArray[n]+"\t");
        }
        input.close();
    }
    public static int[] Paixu(int[]list1,int[]list2){
        int[] list3 = new int[list1.length+list2.length];
        int sum = list3.length;
        for (int i =0;i < list1.length;i++) {
            for (int j = 0; j < list1.length - i - 1; j++) {
                {
                    if (list1[j] > list1[j + 1]) {
                        int Big = 0;
                        Big = list1[j];
                        list1[j] = list1[j + 1];
                        list1[j + 1] = Big;
                    }
                }
            }
        }
        for (int i =0;i < list2.length;i++){
            for (int k=0;k < list2.length-i-1;k++) {
                if (list2[k] > list2[k + 1]) {
                    int Bigg = 0;
                    Bigg = list2[k];
                    list2[k] = list2[k + 1];
                    list2[k + 1] = Bigg;
                }
            }
        }
        for (int i=0;i< list1.length;i++){
            for (int j=0;j< list2.length;j++){
                for (int k=0;k<sum;k++){
                    if (list1[i]>list2[j]){
                        list3[k] = list1[i];
                        i++;
                    }
                    else {
                        list3[k] = list2[j];
                        j++;
                    }
                }
            }
        }
        return list3;
    }
}
