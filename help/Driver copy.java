/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-08-29
*/
import java.io.IOException;


public class Driver 
{
	public static void main(String[] args) throws IOException 
	{
		//HammingDist something = new HammingDist("Mesonet.txt");
		
		HammingDist hammDist1 = new HammingDist("PORT", "SALL");
		
		HammingDist hammDist2 = new HammingDist("BOIS", "WEBR");
		
			
		
		try{
			hammDist1.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		try{
			hammDist2.read("Mesonet.txt");
		}
		catch(Exception e) {
			System.out.println("wrong");
		}
		
		
		
		System.out.println(hammDist1.toString());
		System.out.println("");
		System.out.println(hammDist2.toString());
	}
}