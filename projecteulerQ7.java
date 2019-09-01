
public class projecteulerQ7
{
 public static void main(String args[])
 {
       int num1=2;
       int primeCount=1;
       int primeNum=0;  
       boolean IsPrime;
       int  limit=10001;
        while(primeCount!=limit)
        { 
        IsPrime=true;    
        for(int i=2 ;i<num1;i++)
        {
            if(num1%i==0)
            {
                IsPrime=false;
                break;
            }  
        }
        if(IsPrime ==true)
        {   primeNum=num1;
            primeCount+=1;
        }
        if(num1==2)
        {
            num1++;
        }
        num1++;
    }
    System.out.print("\n"+primeNum);
}
}
