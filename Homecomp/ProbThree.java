public class ProbThree 
{
    public static void main (String[] args)
    {
        
        int[] numChecker = {1, 3, 5, 3, -1, 0, 12, 5};
        boolean numSame;
        for (int i : numChecker) 
        {
            numSame = false;
            for (int p : numChecker)
            {
                if ( i == p && i.length != p.length) 
                {
                  numSame = true;  
                }
            }
            if ( numSame == true)
            {
                System.out.println ( i + " NOT first instance");
            } else 
            {
                System.out.println( i + " first instance");
            }
        }
    }
}