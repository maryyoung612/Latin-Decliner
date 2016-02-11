public class Superlative extends Declension
	{
	Superlative()
		{
		name="Superlative";
		Behavior= (BetterBehavior) new notCom();
		Behavior2= (BestBehavior) new isSup();
		}
	public static void change()
		{
		Array.makeSupArray();
		System.exit(0);
		}
	}