package Unit6;
/*
intValue();为将Integer类型值转化为int值
Integer默认值为null,int默认值为0
 */
public class Unit6_9 {
    public static void main(String[] args){
        Integer i = new Integer(22);
        int j = 28;
        int sum = j + i.intValue();
        System.out.print(sum);
    }
}
