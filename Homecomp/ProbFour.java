import java.util.Scanner;
public class ProbFour
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] holeScores = new int[18];
        
        boolean exit = true;
        int counter = 0;
        
        System.out.println("Enter the scores of your golf match. If you want stop enter -1. ");
        while (counter < holeScores.length && exit == true)
        {
           holeScores[counter] = scan.nextInt();
           if (holeScores[counter] == -1)
           {
               exit = false;
           }
           counter ++; 
        }
    }
}