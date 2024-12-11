package Unit4;
class Circle{
    private double radius;
    void setRadius(double radius){
        this.radius = radius;
    }
    private double computeArea(){
        return Math.PI*radius*radius;
    }
    protected double getArea(){
        return computeArea();
    }
    public String toString(){
        return "半径为" + radius + "厘米 ，， 面积为" + computeArea() + "平方厘米";
    }
}
public class Unit4_13 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(6.0);
        double area = c.getArea();
        String result = "半径为" + 6.0 + "厘米 ，， 面积为" + area + "平方厘米";
        String FromCircleResult = c.toString();
        if (result.equals(FromCircleResult)) {
            System.out.println("程序正确");
        } else {
            System.out.println("有问题");
        }
        System.out.println(FromCircleResult);
    }
}
