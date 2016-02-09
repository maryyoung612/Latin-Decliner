import java.util.ArrayList;

public class Array
	{
	static ArrayList <GetAndSet> q = new ArrayList <GetAndSet>();
	static ArrayList <Declension> decl= new ArrayList <Declension>();
	public static void makeArray()
		{
		q.add(new GetAndSet("","",""));
		}
	public static void makeDeArray()
		{
		decl.add(new Comparative());
		decl.add(new Superlative());
		for(Declension fred:decl)
			{
			fred.Behavior.isCom();
			fred.Behavior2.isSup();
			}
		}
	}