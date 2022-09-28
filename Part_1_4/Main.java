package Part_1_4;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Question_4 obj = new Question_4();
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int[] array = new int[t];
        for (int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(obj.array123(array));
        System.out.println("This program is created by 21CE138_Yuvraj");
    }
}
