package Part_1_9;
import java.util.Scanner;
public class Main {
    public class Main_Question_9
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int count = 0;
            int [][] board =
                    {            {5,3,4,6,7,8,9,1,2},
                            {6,7,2,1,9,5,3,4,8},
                            {1,9,8,3,4,2,5,6,7},
                            {8,5,9,7,6,1,4,2,3},
                            {4,2,6,8,5,3,7,9,1},
                            {7,1,3,9,2,4,8,5,6},
                            {9,6,1,5,3,7,2,8,4},
                            {2,8,7,4,1,9,6,3,5},
                            {3,4,5,2,8,6,1,7,9}
                    };
            Question_9 obj = new Question_9(board);
            for(int i= 0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    boolean c = obj.isAllowed(i,j,board[i][j]);
                    if( c == true)
                    {
                        count++;
                    }
                }
            }
            if(count == 81)
            {
                System.out.println("Correct");
            }
            else
            {
                System.out.println("Incorrect");
            }
            System.out.println("This program is created by 21CE138_Yuvraj");
        }

    }
}

