public class Fifth extends Declension
	{
	Fifth()
		{
		name="Fifth";
		Behavior= (BetterBehavior) new notCom();
		Behavior2= (BestBehavior) new notSup();
		}
	public static void isMasculineFif()
		{
		System.out.println("Fifth Declension Masculine");
		System.out.println(Runner.root+"es"+ "         "+Runner.root+"es");
		System.out.println(Runner.root+"ei"+ "         "+Runner.root+"erum");
		System.out.println(Runner.root+"ei"+ "         "+Runner.root+"ebus");
		System.out.println(Runner.root+"em"+ "         "+Runner.root+"es");
		System.out.println(Runner.root+"e"+ "          "+Runner.root+"ebus");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}