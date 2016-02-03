public class Third extends Declension
	{
	Third()
		{
		name="third";
		for(int i=0; i<Runner.input.length();i++)
			{
			ending=Runner.input.substring(0,i)+Runner.input.substring(i-2);
			}
		
		}
	}