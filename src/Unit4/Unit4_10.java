package Unit4;
/*
4.4 方法重载
在同一个类中 定义多个具有相同名称 但参数不同的方法
(1)方法名必须相同
(2)方法的参数列表必须不同(参数类型 ， 个数 ， 顺序 至少有一项不同)
 */
class GraphicApp{ // 通过area 统一接口实现多种功能
    int x , y , z;
    double area(double r){ // 本方法重载为统一方法名不同参数类型个数 实现方法多用
        return Math.PI*r*r;
    }
    double area(double i , double j){
        return i*j;
    }
    double area(double i ,double j ,double k){
        if (((i + j)>k) &&((i + k) > j) && ((k + j) >i)){
            double p = (i + k + j)/2;
            return Math.sqrt(p * (p-i)*(p-k)*(p-j));
        }
        else return 0.0;
    }
}
public class Unit4_10 {
    public static void main(String[] args) {
        GraphicApp app = new GraphicApp();
        double circle_area = app.area(3.0);
        double rectangle_area = app.area(3.0,4.0);
        double triangle_area = app.area(1.0,1.0,1.5);
        System.out.println(circle_area);
        System.out.println(rectangle_area);
        System.out.println(triangle_area);
    }
}
