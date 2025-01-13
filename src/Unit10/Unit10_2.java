package Unit10;

import java.io.File;

public class Unit10_2 {
    public static void main(String[] args){
        File file = new File("D:\\2024JAVA\\Learning Time\\src\\text");
        System.out.println("文件名:"+ file.getName());
        System.out.println(file.getParent());
    }
}
