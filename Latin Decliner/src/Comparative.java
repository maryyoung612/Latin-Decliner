public class Comparative extends Declension
	{
	Comparative()
		{
		name="Comparative";
		Behavior= (BetterBehavior) new isCom();
		Behavior2= (BestBehavior) new notSup();
		}
	public static void change()
		{
		System.out.println("Hello");
		Array.makeDeArray();
		System.exit(0);
		}
	}