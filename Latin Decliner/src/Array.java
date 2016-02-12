import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Array
	{
	static ArrayList <Declension> s= new ArrayList <Declension>();
	static ArrayList <Declension> c= new ArrayList <Declension>();
	
	public static void makeArray() throws IOException
		{
		Scanner file = new Scanner(new File("Dictionary.txt"));
		while(File.hasNext())
			{
				
			}
		ArrayList <Word> importW = new ArrayList <Word>();
		importW.add(new Word("","",""));
		importW.add(new Word("","",""));
		}
	public static void makeSupArray()
		{
		s.add(new Superlative());
		for(Declension fred:s)
			{
			fred.Behavior2.supIs();
			}
		}
	public static void makeComArray()
		{
		c.add(new Comparative());
		for(Declension fred:c)
			{
			fred.Behavior.comIs();
			}
		}
	}