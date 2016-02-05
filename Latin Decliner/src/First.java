public class First extends Declension
	{
	First(String n, String r)
		{
		name="first";
		findRoot();
		String temp="";
		root=temp;
		}
	public static void isFemineFi()
		{
		System.out.println("First Declension Femine");
		System.out.println(root+"a"+ "         "+root+"ae");
		System.out.println(root+"ae"+ "        "+root+"arum");
		System.out.println(root+"ae"+ "        "+root+"is");
		System.out.println(root+"am"+ "        "+root+"as");
		System.out.println(root+"a"+ "         "+root+"is");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	public static void findRoot()
		{
	for(int i=0; i<Runner.input.length()-1;i++)
		{
		String temp = Runner.input.substring(i);
		}
		
		}
	}