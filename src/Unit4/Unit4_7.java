package Unit4;
/*
2. 用this 区分成员变量 和 本地变量
 */
public class Unit4_7 {
    static class Example4_7 {
        int sum=0 , x=0 , y=0 ;
        void add(){
            int x = 5;
            int y = 7;
            sum = x + y ; // 此x 为类中本地变量 为5
            System.out.println(sum);
            sum = this.x + y; // 此x 为成员变量 在方法外 为 0
            System.out.println(sum);
        }
    }
        public static void main(String[] args){
            Example4_7 exa = new Example4_7();
            exa.add();
        }
}
