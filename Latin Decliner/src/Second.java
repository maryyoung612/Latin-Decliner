public class Second extends Declension
	{
	Second()
		{
		name="Second";
		Behavior= (BetterBehavior) new Comparative();
		Behavior2= (BestBehavior) new Superlative();
		}
	public static void isMasculineS()
		{
		System.out.println("Second Declension Masculine");
		System.out.println(Runner.root+"us"+ "         "+Runner.root+"i");
		System.out.println(Runner.root+"i"+ "          "+Runner.root+"orum");
		System.out.println(Runner.root+"o"+ "          "+Runner.root+"is");
		System.out.println(Runner.root+"um"+ "         "+Runner.root+"os");
		System.out.println(Runner.root+"o"+ "          "+Runner.root+"is");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void isNeuterS()
		{
		System.out.println("Second Declension Neuter");
		System.out.println(Runner.root+"um"+ "         "+Runner.root+"a");
		System.out.println(Runner.root+"i"+ "          "+Runner.root+"orum");
		System.out.println(Runner.root+"o"+ "          "+Runner.root+"is");
		System.out.println(Runner.root+"um"+ "         "+Runner.root+"a");
		System.out.println(Runner.root+"o"+ "          "+Runner.root+"is");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}