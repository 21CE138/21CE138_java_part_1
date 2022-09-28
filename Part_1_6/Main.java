package Part_1_6;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Question_6 obj= new Question_6();
        String[] a = new String[5];
        System.out.println("Enter a");
        for (int i=0;i<5;i++)
        {
            a[i] = sc.next();
        }
        System.out.println("Enter b");
        String b = sc.next();
        obj.TwoArray(a,b);
        System.out.println("This program is created by 21CE138_Yuvraj");
    }
}
