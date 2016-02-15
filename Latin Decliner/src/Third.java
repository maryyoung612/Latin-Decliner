public class Third extends Declension
	{
	Third()
		{
		name="Third";
		Behavior= (BetterBehavior) new notCom();
		Behavior2= (BestBehavior) new notSup();
		}
	public static void isGenderT()
		{
		System.out.println("Third Declension");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(Runner.input.substring(0,Runner.input.length()-2)+Runner.input.substring(Runner.input.length()-2)+ "          "+Runner.root+"es");
		System.out.println(Runner.root+"is"+ "        "+Runner.root+"um");
		System.out.println(Runner.root+"i"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.root+"em"+ "        "+Runner.root+"es");
		System.out.println(Runner.root+"e"+ "         "+Runner.root+"ibus");
		}
	public static void isNeuterT()
		{
		System.out.println("Third Declension Neuter");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(Runner.input.substring(0,Runner.input.length()-2)+Runner.input.substring(Runner.input.length()-2)+ "          "+Runner.root+"a");
		System.out.println(Runner.root+"is"+ "        "+Runner.root+"um");
		System.out.println(Runner.root+"i"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.input.substring(0,Runner.input.length()-2)+Runner.input.substring(Runner.input.length()-2)+ "          "+Runner.root+"a");
		System.out.println(Runner.root+"e"+ "         "+Runner.root+"ibus");
		}
	}