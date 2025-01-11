package Unit5;
/*
十个选择题，八个学生写，算成绩
 */
public class Unit5_11 {
    public static void main(String[] Args){
        char[][] answers={{'A','B','A','C','C','D','E','E','A','D'},{'D','B','A','B','C','A','E','E','A','D'}};
        char[] Rightanswer = {'D','B','D','C','C','D','A','E','A','D'};
        int score[] = new int[2];
        int i ,j ;
        for (i = 0; i < answers.length;i++){
            for (j = 0;j < answers[i].length;j++){
                if (answers[i][j] == Rightanswer[j]){ //这一句控制为列列控制 所以是j
                    score[i] = score[i]+1;//这一步为加加为i
                }
            }
        }
        System.out.println("第一个学生成绩为"+score[0]);
        System.out.println("第二个学生成绩为"+score[1]);
    }
}
