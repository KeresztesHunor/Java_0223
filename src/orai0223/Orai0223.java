package orai0223;

public class Orai0223
{
    public static void main(String[] args)
    {
        
    }
    
    static int elso10SzamOsszege()
    {
        int osszeg = 0;
        for (int i = 0; i < 10; i++)
        {
            osszeg += i;
        }
        return osszeg;
    }
    
    static String osszead(int a, int b)
    {
        return String.format("%d + %d = % d", a, b, a+b);
    }
    
    static void kiir(String szoveg)
    {
        System.out.println(szoveg);
    }
}
