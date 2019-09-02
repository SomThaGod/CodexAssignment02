public class  projecteulerQ6
{
    public static void main(String args[])
    {
        int n=100,a,b;  //a=1+2+3+...+n;
        int  diff;      //b=1^2 + 2^2 + 3^2 +...+n^2;
        a=(n*(n+1))/2;
        b=n*(n+1)*(2*n+1)/6;
        diff=(a*a)-b;       //diff=(1+2+3+...+n)^2 - (1^2 + 2^2 + 3^2 +...+n^2)
        System.out.print(diff);
        
    }
    
}
