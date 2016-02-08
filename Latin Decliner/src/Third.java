public class Third extends Declension
	{
	Third()
		{
		name="Third";
		Behavior= (BetterBehavior) new Comparative();
		Behavior2= (BestBehavior) new Superlative();
		}
	public static void isGenderT()
		{
		System.out.println("Third Declension");
		System.out.println(Runner.root+""+ "          "+Runner.root+"es");
		System.out.println(Runner.root+"is"+ "        "+Runner.root+"um");
		System.out.println(Runner.root+"i"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.root+"em"+ "        "+Runner.root+"es");
		System.out.println(Runner.root+"e"+ "         "+Runner.root+"ibus");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void isNeuterT()
		{
		System.out.println("Third Declension Neuter");
		System.out.println(Runner.root+" "+ "         "+Runner.root+"a");
		System.out.println(Runner.root+"is"+ "        "+Runner.root+"um");
		System.out.println(Runner.root+"i"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.root+" "+ "         "+Runner.root+"a");
		System.out.println(Runner.root+"e"+ "         "+Runner.root+"ibus");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}