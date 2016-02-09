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
		System.out.println("It's me");
		System.out.print(Behavior.comIs());
		Array.makeDeArray();
		System.exit(0);
		}
	}