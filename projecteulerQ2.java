public class projecteulerQ2
{
    public static void main(String[] args)
    {
        int a=0,b=1,c=0,sum=0,count=0;
        while(c<4000000)
        {
            
            if (c%2==0)
                {   
                 sum+=c;
                }
            c=a+b;
            a=b;
            b=c;
        }
       System.out.print("\n "+sum);
    
    }
}
