public class Second extends Declension
	{
	Second()
		{
		name="second";
		}
	public static void isMasculineS()
		{
		System.out.println("Second Declension Masculine");
		System.out.println(root+"us"+ "         "+root+"i");
		System.out.println(root+"i"+ "        "+root+"orum");
		System.out.println(root+"o"+ "        "+root+"is");
		System.out.println(root+"um"+ "        "+root+"os");
		System.out.println(root+"o"+ "         "+root+"is");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void isNeuterS()
		{
		System.out.println("Second Declension Neuter");
		System.out.println(root+"um"+ "         "+root+"a");
		System.out.println(root+"i"+ "        "+root+"orum");
		System.out.println(root+"o"+ "        "+root+"is");
		System.out.println(root+"um"+ "        "+root+"a");
		System.out.println(root+"o"+ "        "+root+"is");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}