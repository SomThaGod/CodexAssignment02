public class  projecteulerQ6
{
    public static void main(String args[])
    {
        int sumOfSquares=0,squareOfSum=0,diff;
        int n=100;
         for(int i=1;i<=n;i++)
            {
                squareOfSum+=i;
                sumOfSquares+=i*i;
            }
         squareOfSum=squareOfSum*squareOfSum;
         diff=squareOfSum-sumOfSquares;
         System.out.print(diff);
    }
    }