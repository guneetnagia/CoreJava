package online;

public class Outer2 extends Inner2
{
    public static void main(String [] args) 
    {
        Outer2 obj = new Inner2();
        obj.cnt();
    }
}
protected class Inner2
{
    void cnt() 
    {
        for (int x = 0;x<7;x++,x++ ) 
        {
            System.out.print(" " + x);
        }
    }
}