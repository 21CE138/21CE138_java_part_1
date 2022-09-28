package Part_1_4;

public class Question_4 {
    public static boolean array123(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
            {
                return true;
            }
        }
        return false;
    }
}
