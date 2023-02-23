package orai0223;

import java.util.Random;

public class Equalizer
{
    static Random rnd = new Random();
    
    public static void main(String[] args)
    {
        eq();
        eq();
        eq();
        eq();
        eq();
    }
    
    static void eq()
    {
        int also = 3;
        int felso = 7;
        int db = rnd.nextInt(felso - also + 1) + also;
        for (int i = 0; i < db; i++)
        {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.println("");
    }
}
