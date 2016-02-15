import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Array
	{
	static ArrayList <Declension> s= new ArrayList <Declension>();
	static ArrayList <Declension> c= new ArrayList <Declension>();
	static ArrayList <Word> importW = new ArrayList <Word>();
	public static void makeArray() throws IOException
		{
		Scanner file = new Scanner(new File("Dictionary.txt"));
			while(file.hasNext())
			{
			importW.add(new Word(file.next(),file.next(),file.next(),file.next(),file.next()));
			}
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