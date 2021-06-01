package online;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test7
{
    public static void main(String args[])
    {
        FileOutputStream out = null;
        try 
        {
            out = new FileOutputStream("output.out");
            out.write(125486);
        }
        catch(IOException io) 
        {
            System.out.println("Error");
        }
        finally 
        {
            try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}