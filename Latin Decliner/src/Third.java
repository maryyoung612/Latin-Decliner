public class Third extends Declension
	{
	Third()
		{
		name="third";
		}
	public static void isGenderT()
		{
		System.out.println("Third Declension");
		System.out.println(root+""+ "         "+root+"es");
		System.out.println(root+"is"+ "        "+root+"um");
		System.out.println(root+"i"+ "        "+root+"ibus");
		System.out.println(root+"em"+ "        "+root+"es");
		System.out.println(root+"e"+ "        "+root+"ibus");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void isNeuterT()
		{
		System.out.println("Third Declension Neuter");
		System.out.println(root+" "+ "         "+root+"a");
		System.out.println(root+"is"+ "        "+root+"um");
		System.out.println(root+"i"+ "        "+root+"ibus");
		System.out.println(root+" "+ "        "+root+"a");
		System.out.println(root+"e"+ "        "+root+"ibus");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}