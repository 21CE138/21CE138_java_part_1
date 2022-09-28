package Part_1_8;
import java.util.*;
public class Question_8 {
    public void AnswerKey()
    {
        char[][] answer = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                { 'D', 'B', 'A', 'B', 'C', 'A','E', 'E', 'A', 'D'},
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E' ,'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C' ,'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D','E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] key = {'D','B','D','C','C','D','A','E','A','D'};
        for(int i=0;i<answer.length;i++)
        {
            int correctcount=0;
            for(int j=0;j<answer[i].length;j++)
            {
                if(answer[i][j] == key[j])
                {
                    correctcount++;
                }
            }
            System.out.println("Student "+ i + " correct count is "+ correctcount);
        }
    }

}
