package Part_1_9;
import java.util.*;
public class Question_9 {
    private int[][] sudoku;
    public Question_9()
    {
        sudoku = new int[9][9];
    }
    public Question_9(int sudoku[][])
    {
        this.sudoku = sudoku;
    }
    private boolean containsRow(int row,int number)
    {
        for (int i=0;i<9;i++)
        {
            if(sudoku[row][i] == number)
            {
                return true;
            }
        }
        return false;
    }
    private boolean containsCol(int col,int number)
    {
        for (int i=0;i<9;i++)
        {
            if(sudoku[i][col] == number)
            {
                return true;
            }
        }
        return false;
    }
    private boolean containsbox(int row,int col,int number)
    {
        int r =row - row % 3;
        int c =col - col % 3;
        for (int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {if(sudoku[i][j]==number)
            {
                return true;
            }
            }
        }
        return false;
    }
    boolean isAllowed(int row, int col, int number)
    {
        boolean checkforrow = containsRow( row,number);
        boolean checkforcol = containsCol( col,number);
        boolean checkforbox = containsbox( row, col, number);

        return !(checkforbox || checkforrow || checkforcol);
    }
}
