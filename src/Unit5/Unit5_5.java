package Unit5;
/*
        for (int t :x)
            System.out.println(t);
            数组遍历
            返回数组
 */

public class Unit5_5 {
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0,j = result.length-1;i <result.length;i++,j--){
            result[j] = list[i];
        }
        return result;
    }
    public static void main(String[] args){
        int [] numbers = {1,2,3,4,5,6,7,8};
        int [] x;
        x = reverse(numbers);
        for(int i =0;i <numbers.length;i++){
        System.out.println(numbers[i]);
        System.out.println(x[i]);
        }
        //
        System.out.println("\n");
        //
        for (int t :x)
            System.out.println(t);
    }
}
