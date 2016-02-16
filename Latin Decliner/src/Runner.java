import java.io.IOException;
import java.util.Scanner;
public class Runner
{
		public static String input;
		public static int de;
		public static String root;
		public static void main(String[] args) throws IOException
			{
			Array.makeArray();
			System.out.println("Please enter the nominative singular of the word");
			Scanner userInput = new Scanner(System.in);
			input=userInput.nextLine();
			findSupCom();
			for(int i=0; i<Array.importW.size()-1; i++)
				{
				if(Array.importW.get(i).getLatinWord1().equals(input))
					{
					System.out.println(Array.importW.get(i));
					decline(i);
					}
				}
			}
public static void decline(int i)
		{
	if(Array.importW.get(i).getDelNum().equals("first"))
	{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		First.isFemineFi();
	}
	if(Array.importW.get(i).getDelNum().equals("second"))
	{
		if(Array.importW.get(i).getGender().equals("m"))
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord1().length()-2);
		Second.isMasculineS();
		}
		else
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord1().length()-2);
		Second.isNeuterS();
		}
	}
	if(Array.importW.get(i).getDelNum().equals("third"))
	{
		if(Array.importW.get(i).getGender().equals("m")||Array.importW.get(i).getGender().equals("f"))
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		Third.isGenderT();
		}
		else
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		Third.isNeuterT();
		}
	}
	if(Array.importW.get(i).getDelNum().equals("fourth"))
	{
		if(Array.importW.get(i).getGender().equals("m")||Array.importW.get(i).getGender().equals("f"))
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		Fourth.isMasculineFo();
		}
		else
		{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		Fourth.isNeuterFo();
		}
	}
	if(Array.importW.get(i).getDelNum().equals("fifth"))
	{
		root = Array.importW.get(i).getLatinWord2().substring(0,Array.importW.get(i).getLatinWord2().length()-2);
		Fifth.isFif();		
	}
		}
public static void findSupCom()
	{
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
	}
}