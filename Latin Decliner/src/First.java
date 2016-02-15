public class First extends Declension
	{
	First()
		{
		name="First";
		Behavior= (BetterBehavior) new notCom();
		Behavior2= (BestBehavior) new notSup();
		}
	public static void isFemineFi()
		{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("First Declension Femine");
		System.out.println(Runner.root+"a"+ "         "+Runner.root+"ae");
		System.out.println(Runner.root+"ae"+ "        "+Runner.root+"arum");
		System.out.println(Runner.root+"ae"+ "        "+Runner.root+"is");
		System.out.println(Runner.root+"am"+ "        "+Runner.root+"as");
		System.out.println(Runner.root+"a"+ "         "+Runner.root+"is");
		}
	}