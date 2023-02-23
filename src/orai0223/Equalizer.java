package orai0223;

import java.util.Random;

public class Equalizer
{
    static Random rnd = new Random();
    static final String MAGENTA = "\u001B[45m";
    
    public static void main(String[] args)
    {
        eqFeladat();
    }
    
    static void eqFeladat()
    {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    
    static void eq()
    {
        int db = rnd.nextInt(3, 7);
        for (int i = 0; i < db; i++)
        {
            System.out.print(MAGENTA + " ");
        }
        System.out.println("");
    }
    
    static void eq(int db)
    {
        for (int i = 0; i < db; i++)
        {
            System.out.print(MAGENTA + " ");
        }
        System.out.println("");
    }
}
