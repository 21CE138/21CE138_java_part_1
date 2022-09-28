package Part_1_2;
public class Question_2 {
    public String startoz(String Word)
    {
        int len = Word.length();
        if(len<1)
        {
            return new String("");
        }
        else if(len>1 && Word.charAt(0)=='o' && Word.charAt(1)=='z' )
        {
            return new String("oz");
        }
        else if( Word.charAt(0)=='o')
        {
            return new String("o");
        }
        else if( Word.charAt(1)=='z')
            return new String("z");
        return new String("");
    }
}