
public class PlusZwei
{
    PlusZwei(long n)
    {
        System.out.println(plusZwei(n));
    }
    
    public long plusZwei(long n)
    {
        if (n <= 1) {
            return 1;
        } else {
            return plusZwei(n-1)+2;
        }
    }

}
