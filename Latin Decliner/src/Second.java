public class Second extends Declension
	{
	Second()
		{
		name="second";
		for(int i=0; i<Runner.input.length();i++)
			{
			ending=Runner.input.substring(0,i)+Runner.input.substring(i-2);
			}
		
		}
	public static void isMasculine()
		{
		System.out.println("Second Declension Masculine");
		System.out.println(get.root(1)+"us"+ "         "+get.root()+"");
		System.out.println(get.root()+"i"+ "        "+get.root()+"atis");
		System.out.println(get.root()+"o"+ "        "+get.root()+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void isNeuter()
		{
		System.out.println("Second Declension Neuter");
		System.out.println(get.root()+"us"+ "         "+get.root()+"");
		System.out.println(get.root()+"i"+ "        "+get.root()+"atis");
		System.out.println(get.root()+"o"+ "        "+get.root()+"ant");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}