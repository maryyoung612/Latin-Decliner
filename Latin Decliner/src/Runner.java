import java.util.Scanner;
public class Runner
{
		public static String input;
		public static int de;
		public static String root;
		public static void main(String[] args)
			{
			System.out.println("Please enter the nominative singular of the word");
			Scanner userInput = new Scanner(System.in);
			input=userInput.nextLine();
			if(input.endsWith("ior"))
				{
				Comparative.change();
				}
			if(input.endsWith("ius"))
				{
				Comparative.change();
				}
			if(input.endsWith("issimus"))
				{
				Superlative.change();
				}
			if(input.endsWith("issime"))
				{
				Superlative.change();
				}
			System.out.println("Please enter the # of the decension");
			de=userInput.nextInt();
			findRoot();
			
			
			if(de==1)
				{
				First.isFemineFi();
				}
			if(de==2)
				{
				if(input.endsWith("us"))
					{
					Second.isMasculineS();
					}
				else
					{
					Second.isNeuterS();
					}
				}
			if(de==3)
				{
				if(input.endsWith("us"))
					{
					Third.isGenderT();
					}
				else
					{
					Third.isNeuterT();
					}
				}
			if(de==4)
				{
				if(input.endsWith("us"))
					{
					Fourth.isMasculineFo();
					}
				else
					{
					Fourth.isNeuterFo();
					}
				}
			if(de==5)
				{
				Fifth.isMasculineFif();		
				}
			}
public static void findRoot()
	{
	if(de==1)
		{
		root = Runner.input.substring(0,Runner.input.length()-1);
		}
	else
		{
		root = Runner.input.substring(0,Runner.input.length()-2);
		}
	}
}
