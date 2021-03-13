/**
 * Write a description of class NFakultaet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NFakultaet
{
    public NFakultaet(long n) {
        System.out.println(fakultaet(n));
    }
    
    public long fakultaet(long n)
    {
        if(n <= 0) {
            return 1;
        } else {
            return fakultaet(n-1) * n;
        }
    }
}
