import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;

public class Encode {
//	private String input;
	private String output;
	private HashMap<String, Integer> dict;
	
	public Encode (File inputFile) throws IOException
	{
		
		dict = new HashMap <String, Integer> ();
		
		for (int x = 0; x<266; x++)
		{
			char ch = (char)x;
			dict.put(String.valueOf(ch), x);
		}
		
		BufferedReader buffy = new BufferedReader (new FileReader(inputFile));
		
		String current = "" +(char)buffy.read();
		String next = "" + (char)buffy.read();
		for (int x = 0; x<inputFile.length(); x++)
		{
			
		}
	}

	
		

	
	
	

}