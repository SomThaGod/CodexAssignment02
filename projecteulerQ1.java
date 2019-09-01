public class projecteulerQ1
{
    public static void main(String[] args)
    {
        int i,n=1000,sum=0;
        for(i=1;i<n;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum+=i;
            }
        }
        System.out.print(sum);
   }
    
}
