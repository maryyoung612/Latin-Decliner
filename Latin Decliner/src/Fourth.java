public class Fourth extends Declension
	{
	Fourth()
		{
		name="Fourth";
		Behavior= (BetterBehavior) new notCom();
		Behavior2= (BestBehavior) new notSup();
		}
	public static void isMasculineFo()
		{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Fourth Declension");
		System.out.println(Runner.root+"us"+ "         "+Runner.root+"us");
		System.out.println(Runner.root+"us"+ "         "+Runner.root+"uum");
		System.out.println(Runner.root+"ui"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.root+"um"+ "         "+Runner.root+"us");
		System.out.println(Runner.root+"u"+ "          "+Runner.root+"ibus");
		}
	public static void isNeuterFo()
		{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Fourth Declension Neuter");
		System.out.println(Runner.root+"u"+ "         "+Runner.root+"ua");
		System.out.println(Runner.root+"us"+ "        "+Runner.root+"uum");
		System.out.println(Runner.root+"u"+ "         "+Runner.root+"ibus");
		System.out.println(Runner.root+"u"+ "         "+Runner.root+"ua");
		System.out.println(Runner.root+"u"+ "         "+Runner.root+"ibus");
		}
	}