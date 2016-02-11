import java.util.ArrayList;

public class Array
	{
	static ArrayList <Word> q = new ArrayList <Word>();
	static ArrayList <Declension> s= new ArrayList <Declension>();
	static ArrayList <Declension> c= new ArrayList <Declension>();
	public static void makeArray()
		{
		q.add(new Word("", "", ""));
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