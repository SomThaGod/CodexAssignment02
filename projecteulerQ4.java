public class projecteulerQ4
{
    public static void main(String[] args )
    
    {
     int d,r=0;
     int maxPalindrome=0,ab,temp_ab;
     for( int a=100;a<1000;a++)
     {
        for(int  b=100;b<1000;b++)
          {
           ab=a*b;
           temp_ab=ab;
           while(temp_ab!=0)
            {  
             d=temp_ab%10;
             r=r*10+d;
             temp_ab=temp_ab/10;
         } 
         if(r==ab && r>maxPalindrome)
         {  
             maxPalindrome=r;
         }
    
        }
    
    }
   System.out.print(maxPalindrome);
  
   }
}

   
