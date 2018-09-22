package k;

import java.io.IOException;

import org.junit.Test;

public class KTest
{
    @Test
    public void test()
    {
	String path = "E:\\Program Files (x86)\\Programas\\Eclipse\\Workspace\\K_Mas_Pequenio\\test\\";
	String file = "K2";
	
	try
	{
	    KMasPequenio.resolver(path + file);
	} 
	catch (IOException e)
	{
	    System.out.println("ERROR");
	}
    }
}
