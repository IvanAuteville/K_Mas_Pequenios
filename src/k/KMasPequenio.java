package k;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class KMasPequenio
{
    public static void resolver(String path) throws IOException
    {
	// Archivo
	Scanner sc = new Scanner(new File(path + ".in"));
	
	// Arbol de numeros
	TreeSet<Integer> numeros = new TreeSet<Integer>();
	
	// Cantidad de numeros a leer
	int n = sc.nextInt();
	
	// Cantidad de numeros a buscar
	int b = sc.nextInt();

	// Cargo los numeros
	// N * Log(N)
	for (int i = 0; i < n; i++)
	{
	    numeros.add(sc.nextInt());
	}
	
	// FIN DE LA LECTURA
	sc.close();
	
	
	// PROCESO/ESCRITURA
	PrintWriter out = new PrintWriter(new FileWriter(path + ".out"));
	
	// En caso de que se solicite mostrar más numeros no repetidos de los que hay
	if(b > numeros.size())
	{
	    b = numeros.size();
	}
	
	out.println(b);
	
	for (int i = 0; i < b - 1; i++)
	{
	    out.println(numeros.pollFirst());
	}
	
	out.print(numeros.first());
	out.close();
    }

}
