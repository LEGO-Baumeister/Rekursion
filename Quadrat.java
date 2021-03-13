
public class Quadrat
{

    public Quadrat(long n)
    {
        System.out.println(quadrieren(n));
    }
    
    public long quadrieren(long n) {
        if(n <= 1) {
            return 1;
        } else {
            return quadrieren(n-1) + (2*n) - 1;
        }
    }

}
