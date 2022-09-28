package Part_1_6;
import java.util.*;
import java.lang.*;
public class Question_6 {
    public void TwoArray(String[] a,String b )
    {
        int count =0;
        for(int i=0;i<a.length;i++)
        {
            if(!a[i].equals(b))
            {
                count++;
            }
        }
        String[] arr = new String[count];
        int count1 = 0;
        for(int i=0;count1<count;i++)
        {
            if(!a[i].equals(b))
            {
                arr[count1]=a[i];
                count1++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
