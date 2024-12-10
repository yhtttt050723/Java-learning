package Unit9.EX8;

import java.util.Scanner;

// 自定义异常类
class DimensionOutOfRangeException extends Exception {
    public DimensionOutOfRangeException(String message) {
        super(message);
    }
}

// 长方形类
class Rectangle {
    private double length;
    private double width;

    // 构造函数，检查长宽是否在范围内
    public Rectangle(double length, double width) throws DimensionOutOfRangeException {
        if (length < 16 || length > 25 || width < 7 || width > 15) {
            throw new DimensionOutOfRangeException("Length must be in [16,25] and Width in [7,15].");
        }
        this.length = length;
        this.width = width;
    }

    // 计算面积
    public double calculateArea() {
        return length * width;
    }

    // 计算周长
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("请输入长方形的长度: ");
            double length = scanner.nextDouble();
            System.out.print("请输入长方形的宽度: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);

            System.out.println("长方形的面积是: " + rectangle.calculateArea());
            System.out.println("长方形的周长是: " + rectangle.calculatePerimeter());

        } catch (DimensionOutOfRangeException e) {
            System.out.println("输入错误: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("发生了未知错误，请确保输入的是数字。");
        } finally {
            scanner.close(); // 关闭扫描器以防止资源泄漏
        }
    }
}
