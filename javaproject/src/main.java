
import java.io.*;
public class Main
{
	public static void main(String[] args)
	throws IOException
	{
		double a, b, pole;
		BufferedReader br=new BufferedReader(new InputStreamReader.in));
		System.out.println("Program oblicza prostokata.");
		System.out.println("Podaj bok a.");
		a= Double.parseDouble(br.readLine());
		System.out.println("Podaj bok a.");
		b=Double.parseDouble(br.readLine());
		pole=a*b;
		System.out.print("Pole prostokata o boku ;a="+a+"i boku b="+b);
		System.out.ptintln("wynosi"+pole+".");
	}
	
}