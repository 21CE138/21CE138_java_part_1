package Part_1_5;

public class Question_5 {
    public int CompareTwoWord(String a,String b)
    {
        int len = Math.min(a.length(),b.length());
        int count = 0;
        for(int i=0;i<len-1;i++)
        {
            String asub = a.substring(i,i+2);
            String bsub = b.substring(i,i+2);
            if(asub.equals(bsub))
            {
                count++;
            }
        }
        return count;
    }
}
