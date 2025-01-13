package Unit8;
/*
内部类与匿名类
内部类
类中类
可以使用外面的变量和方法
匿名类

 */
//内部类
public class Unit8_3 {
    public static void main(String[] args) {
        Out x = new Out();
        x.data = x.new Buy("鼠标",20,30.0f) ;
        x.m();
    }
}
    class  Out{
        String addr = "上海市";
        Buy data  = new Buy("鼠标",20,30.0f);
        public void m(){
            System.out.println("");
        }
        class Buy{
            String item;
            int quantity;
            float price;
            Buy(String it,int p,float q){
                item = it;
                quantity = p;
                price = q;
                System.out.println(addr+data.pay());
            }
            public float pay(){
                return quantity *price;
            }

        }
    }

