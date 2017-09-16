public class ProbThree 
{
    public static void main (String[] args)
    {
        
        int[] numChecker = {1, 3, 5, 4, 1, -1, 5, 21};
        boolean numSame;
        for (int i = 0; i < numChecker.length; i++) 
        {
            numSame = false;
            
            for (int p = 0; p < numChecker.length; p++)
            {
                if ( i != p && numChecker[i] == numChecker[p] && p <= i) 
                {
                  numSame = true;  
                }
            }
            
            if ( numSame == true)
            {
                System.out.println ( numChecker[i] + " NOT first instance");
            } else 
            {
                System.out.println( numChecker[i] + " first instance");
            }
        }
    }
}