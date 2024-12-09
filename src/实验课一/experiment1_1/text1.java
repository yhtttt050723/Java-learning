package 实验课一.experiment1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text1 {

    public static void main(String[] args) {
        final int NUM_STUDENTS = 10;
        final int NUM_SUBJECTS = 3;
        final int PASS_MARK = 60; // 及格分数

        Scanner input = new Scanner(System.in);
        double[][] grades = new double[NUM_STUDENTS][NUM_SUBJECTS];
        double[] averageScores = new double[NUM_STUDENTS];
        double[] maxScores = new double[NUM_SUBJECTS];
        double[] minScores = new double[NUM_SUBJECTS];
        List<String> failedStudents = new ArrayList<>();

        // 初始化最大和最小分数为边界值
        for (int i = 0; i < NUM_SUBJECTS; i++) {
            maxScores[i] = -1;
            minScores[i] = 101;
        }

        // 输入成绩并进行验证
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("请输入第 " + (i + 1) + " 名学生的成绩：");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                while (true) {
                    System.out.print("科目 " + (j + 1) + ": ");
                    double grade = input.nextDouble();
                    if (grade >= 0 && grade <= 100) {
                        grades[i][j] = grade;
                        break;
                    } else {
                        System.out.println("输入的成绩无效，请输入介于0到100之间的成绩。");
                    }
                }

                // 更新每门课的最高分和最低分
                if (grades[i][j] > maxScores[j]) {
                    maxScores[j] = grades[i][j];
                }
                if (grades[i][j] < minScores[j]) {
                    minScores[j] = grades[i][j];
                }

                // 检查是否不及格
                if (grades[i][j] < PASS_MARK) {
                    failedStudents.add("学生 " + (i + 1) + " 科目 " + (j + 1) + ": " + grades[i][j]);
                }
            }

            // 计算平均分
            averageScores[i] = (grades[i][0] + grades[i][1] + grades[i][2]) / NUM_SUBJECTS;
        }

        // 输出结果
        System.out.println("\n学生成绩及平均分：");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("学生 " + (i + 1) + " 的平均成绩: " + averageScores[i]);
        }

        System.out.println("\n每门课的最高分和最低分：");
        for (int j = 0; j < NUM_SUBJECTS; j++) {
            System.out.println("科目 " + (j + 1) + " 最高分: " + maxScores[j] + ", 最低分: " + minScores[j]);
        }

        if (!failedStudents.isEmpty()) {
            System.out.println("\n不及格的学生及其课程分数：");
            for (String student : failedStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("\n所有学生都及格了！");
        }

        input.close();
    }
}