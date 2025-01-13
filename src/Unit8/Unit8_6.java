package Unit8;
/*
泛型
定义类时,有一个泛型类表作为参数,支持按类型进行参数化的类.
修饰体 类名<泛型列表>{}
在定义类的时候可以选择类
 */
public class Unit8_6 {
}
class Cone<E>{
    E bottom_area;
    double height;
    public Cone(E b){
        bottom_area = b;
    }
    public void computeVolume(){
        String s = bottom_area.toString();
        double area = Double.parseDouble(s);
        System.out.println("");
    }
}
